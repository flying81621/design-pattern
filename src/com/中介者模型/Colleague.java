package com.中介者模型;

/**
 * 抽象同事类
 * @createTime 2018年1月29日 下午4:42:44
 * @author MrWang
 */
public abstract class Colleague {
	protected Mediator mediator;
	public Colleague(Mediator mediator){
		this.mediator = mediator;
	}
}
