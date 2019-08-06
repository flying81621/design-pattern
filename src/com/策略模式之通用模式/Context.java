package com.策略模式之通用模式;

/**
 * 封装角色
 * @createTime 2018年1月29日 下午7:20:20
 * @author MrWang
 */
public class Context {
	//封装策略
	private Strategy strategy;
	
	//通过构造函数进行策略的封装
	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	/**
	 * 封装后的策略方法
	 */
	public void doAnyThing(){
		this.strategy.doSomething();
	}
}

