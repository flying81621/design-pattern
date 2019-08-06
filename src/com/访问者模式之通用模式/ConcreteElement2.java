package com.访问者模式之通用模式;

/**
 * 具体的访问元素2
 * @createTime 2018年2月7日 下午6:53:30
 * @author MrWang
 */
public class ConcreteElement2 extends Element {

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("B....");
	}

	@Override
	public void accept(IVistor vistor) {
		// TODO Auto-generated method stub
		vistor.visit(this);
	}

}
