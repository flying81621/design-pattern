package com.访问者模式之通用模式;

/**
 * 抽象访问者,有几个具体的元素，就有几个访问方法
 * @createTime 2018年2月7日 下午6:52:44
 * @author MrWang
 */
public interface IVistor {
	//访问的方法
	void visit(ConcreteElement1 concreteElement1);
	void visit(ConcreteElement2 concreteElement2);
}
