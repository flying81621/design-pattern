package gaoqi.备忘录模式;

/**
 * 
 * @createTime 2018年3月4日 下午9:31:25
 * @author MrWang
 */
public class Client {
	public static void main(String[] args) {
		Originator originator = new Originator("张三", 28, 400);
		Memento memento = originator.createMemento();
		CareTaker taker = new CareTaker();
		taker.setMemento(memento);
		System.out.println(originator);
		
		//现在对源发器对象进行改变
		originator.setName("李四");
		originator.setAge(49);
		originator.setPrice(1000);
		System.out.println(originator);
		
		//现在进行复原
		originator.restoreMemento(taker.getMemento());
		System.out.println(originator);
		
	}
}
