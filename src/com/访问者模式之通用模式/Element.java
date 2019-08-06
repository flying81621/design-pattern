package com.访问者模式之通用模式;

/**
 * 抽象元素
 * @createTime 2018年2月7日 下午6:50:49
 * @author MrWang
 */
public abstract class Element {
	//定义业务逻辑
	public abstract void doSomething();
	//允许谁来访问
	public abstract void accept(IVistor vistor);
}
