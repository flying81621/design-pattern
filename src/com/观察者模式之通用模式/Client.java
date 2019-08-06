package com.观察者模式之通用模式;

/**
 * 
 * @createTime 2018年2月7日 上午12:53:47
 * @author MrWang
 */
public class Client {
	public static void main(String[] args) {
		Subject subject = new ConcreteSubject();
		
		Observer observer = new ConcreteObserver();
		
		subject.addObserver(observer);
		
		subject.doSomething();
		
	}
}
