package com.观察者模式之项目示例;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @createTime 2018年2月7日 上午12:30:11
 * @author MrWang
 */
public class HanFeiZi implements IHanFeiZi, Observable {

	List<Observer> observers = new ArrayList<>();
	@Override
	public void addObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void deleteObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}

	@Override
	public void notifyObservers(Object object) {
		// TODO Auto-generated method stub
		for (Observer observer : observers) {
			observer.update(object);
		}
	}
	
	@Override
	public void haveBreakFirst() {
		// TODO Auto-generated method stub
		System.out.println("韩非子吃早饭了。。。");
		notifyObservers("韩非子吃早饭");
	}

	@Override
	public void haveFun() {
		// TODO Auto-generated method stub
		System.out.println("韩非子在娱乐。。。");
		notifyObservers("韩非子娱乐");
	}

}
