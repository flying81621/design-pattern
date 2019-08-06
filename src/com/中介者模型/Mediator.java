package com.中介者模型;

/**
 * 中介者抽象类
 * @createTime 2018年1月29日 下午4:38:54
 * @author MrWang
 */
public abstract class Mediator {
	//定义同事类
	private ConcreteColleague colleague;
	private ConcreteColleague2 colleague2;
	
	public ConcreteColleague getColleague() {
		return colleague;
	}
	public void setColleague(ConcreteColleague colleague) {
		this.colleague = colleague;
	}
	public ConcreteColleague2 getColleague2() {
		return colleague2;
	}
	public void setColleague2(ConcreteColleague2 colleague2) {
		this.colleague2 = colleague2;
	}
	public abstract void doSomething1();
	public abstract void doSomething2();
}
