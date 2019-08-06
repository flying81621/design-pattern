package com.门面模式之通用模式;

/**
 * 现在需要增加一个复杂的业务功能，在这里新建一个子系统，用来进行业务的组装
 * @createTime 2018年2月6日 下午11:58:52
 * @author MrWang
 */
public class Context {
	private ClassA classA = new ClassA();
	private ClassB classB = new ClassB();
	
	public void complexMethod(){
		classA.doSomethingA();
		classB.doSomethingB();
	}
}
