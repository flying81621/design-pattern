package gaoqi.备忘录模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 这个是一个备忘录管理者，管理一个备忘录
 * @createTime 2018年3月4日 下午9:30:01
 * @author MrWang
 */
public class CareTaker {
	//管理一个备忘录
	private Memento memento;
	
//	这个是采用一个容器管理多个备忘录，在管理的时候进行相应的设置和取出即可
//	private List<Memento> list = new ArrayList<>();

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
	
}
