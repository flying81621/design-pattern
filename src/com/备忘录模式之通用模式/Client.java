package com.备忘录模式之通用模式;

/**
 * 
 * @createTime 2018年2月7日 下午6:46:53
 * @author MrWang
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Originator originator = new Originator();
		//比如这时候需要保存状态，创建一个备忘录管理员
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(originator.createMemento());
		
		//比如现在需要恢复备忘录的状态
		originator.restoreMemento(caretaker.getMemento());
	}

}
