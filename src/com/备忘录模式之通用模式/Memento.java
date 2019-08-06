package com.备忘录模式之通用模式;

/**
 * 备忘录角色
 * @createTime 2018年2月7日 下午6:40:45
 * @author MrWang
 */
public class Memento {
	//发起人内部状态
	private String state = "";
	//构造函数传递参数
	public Memento(String state){
		this.state = state;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
