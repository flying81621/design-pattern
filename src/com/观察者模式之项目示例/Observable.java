package com.观察者模式之项目示例;

/**
 * 被观察者接口
 * @createTime 2018年2月7日 上午12:30:33
 * @author MrWang
 */
public interface Observable {
	void addObserver(Observer observer);
	void deleteObserver(Observer observer);
	void notifyObservers(Object object);
}
