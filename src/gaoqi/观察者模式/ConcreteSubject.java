package gaoqi.观察者模式;

/**
 * 实际的被观察者
 * @createTime 2018年3月4日 下午9:04:27
 * @author MrWang
 */
public class ConcreteSubject extends Subject {

	@Override
	public void handle() {
		System.out.println("这是被观察者（服务端）的业务类方法");
		this.notifyAllObservers("服务端消息推送----被观察者改变东西了");
	}

}
