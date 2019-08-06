package gaoqi.观察者模式;

/**
 * 具体的观察者
 * @createTime 2018年3月4日 下午8:55:27
 * @author MrWang
 */
public class ConcreteObserver implements Observer {
	
	@Override
	public void update(Object obj) {
		System.out.println(obj.toString());
	}
	
}
