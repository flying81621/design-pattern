package com.备忘录模式之通用模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 备忘录管理员角色
 * @createTime 2018年2月7日 下午6:45:44
 * @author MrWang
 */
public class Caretaker {
	//这是管理的备忘录
	private Memento memento;
	
//	这个是管理多个备忘点的方式
//	private List<Memento> mementos = new ArrayList<>();

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
	
}
