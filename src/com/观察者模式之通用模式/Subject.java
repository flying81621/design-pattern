package com.观察者模式之通用模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者抽象类
 * @createTime 2018年2月7日 上午12:44:41
 * @author MrWang
 */
public abstract class Subject {
	//定义一个观察者容器
	private List<Observer> list = new ArrayList<>();
	
	/**
	 * 增加一个观察者
	 * @param observer
	 */
	public void addObserver(Observer observer){
		list.add(observer);
	}
	
	public void deleteObserver(Observer observer) {
		// TODO Auto-generated method stub
		list.remove(observer);
	}

	public void notifyObservers(Object object) {
		// TODO Auto-generated method stub
		for (Observer observer : list) {
			observer.update(object);
		}
	}
	
	/**
	 * 处理业务的方法
	 */
	public abstract void doSomething();
}
