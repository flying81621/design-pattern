package com.观察者模式之通用模式;

/**
 * 具体的观察者
 * @createTime 2018年2月7日 上午12:53:20
 * @author MrWang
 */
public class ConcreteObserver implements Observer {

	@Override
	public void update(Object object) {
		// TODO Auto-generated method stub
		System.out.println("observer doSomeThing");
		System.out.println(object.toString());
	}

}
