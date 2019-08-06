package com.访问者模式之通用模式;

/**
 * 具体的访问者
 * @createTime 2018年2月7日 下午6:56:47
 * @author MrWang
 */
public class Visitor implements IVistor {

	@Override
	public void visit(ConcreteElement1 concreteElement1) {
		// TODO Auto-generated method stub
		//这里写对ConcreteElement1的访问操作，如查询，组合，调用方法，或者访问者自己的其他逻辑
	}

	@Override
	public void visit(ConcreteElement2 concreteElement2) {
		// TODO Auto-generated method stub
		//这里写对ConcreteElement2的访问操作，如查询，组合，调用方法，或者访问者自己的其他逻辑
	}

}
