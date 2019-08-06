package gaoqi.观察者模式;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 这个是被观察者
 * @createTime 2018年3月4日 下午8:58:16
 * @author MrWang
 */
public abstract class Subject {
	private List<Observer> observers = new CopyOnWriteArrayList<>();
	
	public void addObserver(Observer observer){
		observers.add(observer);
	}
	
	public void removeObserver(Observer observer){
		observers.remove(observer);
	}
	
	public void notifyAllObservers(Object obj){
		for (Observer observer : observers) {
			observer.update(obj);
		}
	}
	
	public abstract void handle();
}
