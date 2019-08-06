package com.中介者模型;

/**
 * 具体的同事类
 * @createTime 2018年1月29日 下午4:44:56
 * @author MrWang
 */
public class ConcreteColleague extends Colleague {

	/**
	 * 通过构造函数传递中介者
	 * @param mediator
	 */
	public ConcreteColleague(Mediator mediator) {
		super(mediator);
	}

	/**
	 * 自有方法1
	 */
	public void selfMethod1(){
		System.out.println("selfMethod1");
	}
	
	/**
	 * 依赖方法依赖方法
	 */
	public void depMethod(){
		System.out.println("依赖方法");
	}
}
