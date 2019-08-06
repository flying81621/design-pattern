package com.策略模式之通用模式;

/**
 * 具体的策略类
 * @createTime 2018年1月29日 下午7:19:43
 * @author MrWang
 */
public class ConcreteStrategy implements Strategy {

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("具体的运算法则");
	}

}
