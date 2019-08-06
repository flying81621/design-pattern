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
import java.util.concurrent.TimeUnit;

/**
 * 单例类的延迟加载实现：基于类初始化的解决多线程的安全问题，解决双重检查机制带来的弊端
 * 
 * @createTime 2018年1月24日 下午11:19:02
 * @author MrWang
 */
public class SingleTonDemo implements Serializable {
	private SingleTonDemo() {
		// 防止利用反射创建多个对象
		if (null != InstanceHolder.singleInstance) {
			throw new RuntimeException();
		}
	}

	// 使用内部类，基于类初始化的解决多线程的安全问题，原理是生成这个类的class文件时，需要获取class锁，这个只有一个线程可以获取到，于是可以保证
	//只有一个线程可以进行类的加载初始化，类的加载初始化一旦完成，这个静态变量肯定也是已经完成了
	private static class InstanceHolder {
		private static SingleTonDemo singleInstance = new SingleTonDemo();
		//不知道下面这样定义成final变量会不会更安全
//		private static final SingleTonDemo singleInstance = new SingleTonDemo();
	}

	public static SingleTonDemo getInstance() {
		return InstanceHolder.singleInstance;
	}

	// 防止反序列化获取多个对象的漏洞。
	// 如果对象定义了readResolve()方法，readObject()会调用readResolve()方法。从而解决反序列化的漏洞
	// 无论是实现Serializable接口，或是Externalizable接口，当从I/O流中读取对象时，readResolve()方法都会被调用到。
	// 实际上就是用readResolve()中返回的对象直接替换在反序列化过程中创建的对象。
	private Object readResolve() throws ObjectStreamException {
		return InstanceHolder.singleInstance;
	}

	/**
	 * 测试如何防止序列化和反序列化产生的单例类的漏洞
	 * 
	 * @param args
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws InterruptedException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args)
			throws FileNotFoundException, IOException, InterruptedException, ClassNotFoundException {
		SingleTonDemo instance = SingleTonDemo.getInstance();

		// 先序列化到磁盘上
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("out1.txt"));
		out.writeObject(instance);
		out.close();

		// 休眠两秒钟
		TimeUnit.SECONDS.sleep(2);

		// 在从磁盘上反序列化出来
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("out1.txt"));
		SingleTonDemo readObject = (SingleTonDemo) in.readObject();
		in.close();

		// 在未定义readResolve()方法时，可以看到输出结果是false，定义了之后，可以发现输出的结果是true
		System.out.println(instance == readObject);

	}

}
