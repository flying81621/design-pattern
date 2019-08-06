package com.观察者模式之通用模式;

/**
 * 具体的被观察者
 * @createTime 2018年2月7日 上午12:51:17
 * @author MrWang
 */
public class ConcreteSubject extends Subject {

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("do something!");
		super.notifyObservers("this is the observer msg");
	}

}
