package com.命令模式之通用模式;

/**
 * 具体的Receiver类
 * @createTime 2018年1月29日 下午5:42:44
 * @author MrWang
 */
public class ConcreteReceiver1 extends Receiver {

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("每个接受者处理一定的业务逻辑");
	}

}
