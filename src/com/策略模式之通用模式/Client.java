package com.策略模式之通用模式;

/**
 * 场景类
 * @createTime 2018年1月29日 下午7:22:44
 * @author MrWang
 */
public class Client {
	public static void main(String[] args) {
		//创建一个策略
		Strategy strategy = new ConcreteStrategy();
		//创建一个上下文对象，执行策略的
		Context context = new Context(strategy);
		//执行策略
		context.doAnyThing();
	}
}
