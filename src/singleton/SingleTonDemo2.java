/**
 * 
 */
package singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.util.concurrent.TimeUnit;

/**
 * 单例类的延迟加载实现：基于volatile的解决多线程的安全问题，解决双重检查机制(DCL)带来的弊端，原理是volatile关键字会使得在类初始化时，
 * 禁止初始化时的重排序
 * 对象初始化的过程：
 * 1、分配内存空间
 * 2、初始化内存对象
 * 3、将内存赋予对象的引用
 * 
 * 这里只有1、2之间和1、3有依赖关系，所以正常的变量初始化时，有可能2和3发生重排序，于是在下面的DCL（双重检查）机制中，A线程和B线程同时访问时，
 * A将instance初始化后，可能现在实际上instance只是指向了这个内存空间，但实际上初始化还没有完成，而这时B拿到的是一个还没有完成初始化的变量，这时候
 * B拿着这个初始化未完成的变量进行调用的时候，出现安全问题
 * 
 * 所以要进行volatile修饰，第三步是一个volatile写的操作，会在volatile变量前面加一个写写屏障，保证普通的读写（第二步）和这个volatile写不会发生重排序，于是对象可以安全初始
 * 化后在进行使用
 * @createTime 2018年1月24日 下午11:22:50
 * @author MrWang
 */
public class SingleTonDemo2 implements Serializable {
	private static final long serialVersionUID = 1L;

	private static boolean flag = true;
	private volatile static SingleTonDemo2 instance;

	private SingleTonDemo2() {
		// 防止利用反射创建多个对象,需要保证构造方法只能被调用一次
		synchronized(SingleTonDemo2.class){
			if(flag){
				flag = false;
			} else{
				throw new RuntimeException("单例类正在遭受攻击");
			}
			/*if (null != instance) {
				throw new RuntimeException("单例类正在遭受攻击");
			}*/
		}
	}

	public static SingleTonDemo2 getInstance() {
		if (instance == null) {
			//两个线程到这里了
			synchronized (SingleTonDemo2.class) {
				if (instance == null) {
					instance = new SingleTonDemo2();
				}
			}
		}
		return instance;
	}

	// 防止反序列化获取多个对象的漏洞。
	// 如果对象定义了readResolve()方法，readObject()会调用readResolve()方法。从而解决反序列化的漏洞
	// 无论是实现Serializable接口，或是Externalizable接口，当从I/O流中读取对象时，readResolve()方法都会被调用到。
	// 实际上就是用readResolve()中返回的对象直接替换在反序列化过程中创建的对象。
	private Object readResolve() throws ObjectStreamException {
		return SingleTonDemo2.getInstance(); 
	}

	/**
	 * 测试如何防止序列化和反序列化产生的单例类的漏洞
	 * 测试暴力反射攻击
	 * @param args
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws InterruptedException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args)
			throws Exception {
//		testSingleSeria();
		testSingleDeclared();
	}

	/**
	 * 测试如何防止序列化和反序列化产生的单例类的漏洞
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws InterruptedException
	 * @throws ClassNotFoundException
	 */
	private static void testSingleSeria()
			throws IOException, FileNotFoundException, InterruptedException, ClassNotFoundException {
		SingleTonDemo2 instance = SingleTonDemo2.getInstance();

		// 先序列化到磁盘上
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("out.txt"));
		out.writeObject(instance);
		out.close();

		// 休眠两秒钟
		TimeUnit.SECONDS.sleep(2);

		// 在从磁盘上反序列化出来
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("out.txt"));
		SingleTonDemo2 readObject = (SingleTonDemo2) in.readObject();
		in.close();

		// 在未定义readResolve()方法时，可以看到输出结果是false，定义了之后，可以发现输出的结果是true
		System.out.println(instance == readObject);
	}
	
	/**
	 * 测试暴力反射攻击
	 * @throws Exception
	 */
	private static void testSingleDeclared() throws Exception{
		Class<SingleTonDemo2> clazz = (Class<SingleTonDemo2>) Class.forName("singleton.SingleTonDemo2");
		Constructor<SingleTonDemo2> constructor = clazz.getDeclaredConstructor();
		constructor.setAccessible(true);
		SingleTonDemo2 demo1 = constructor.newInstance();
		SingleTonDemo2 demo2 = SingleTonDemo2.getInstance();
		System.out.println(demo1 == demo2);
	}

}
