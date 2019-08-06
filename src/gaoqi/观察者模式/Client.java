package gaoqi.观察者模式;

/**
 * 观察者模式适用于各种的服务端向客户端推送消息的场景，如：聊天室、cs多人联机大战、发布订阅模式、广播机制、servlet监听器机制
 * @createTime 2018年3月4日 下午9:06:21
 * @author MrWang
 */
public class Client {

	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();
		
		//定义三个观察者
		Observer observer1 = new ConcreteObserver();
		Observer observer2 = new ConcreteObserver();
		Observer observer3 = new ConcreteObserver();
		
		//添加被观察者对象中
		subject.addObserver(observer1);
		subject.addObserver(observer2);
		subject.addObserver(observer3);
		
		//现在服务端状态改变，推送给客户端
		subject.handle();
	}
}
