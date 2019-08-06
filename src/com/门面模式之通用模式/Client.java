package com.门面模式之通用模式;

/**
 * 场景类
 * 门面模式实际为各种功能的组装，然后对外统一提供功能
 * @createTime 2018年2月6日 下午11:57:38
 * @author MrWang
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facade facade = new Facade();
		facade.doSomethingA();
		
		//新增的一个复杂的业务功能
		facade.complexMethod();
	}

}
