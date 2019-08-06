package com.命令模式之通用模式;

/**
 * 具体的命令类
 * @createTime 2018年1月29日 下午5:45:26
 * @author MrWang
 */
public class ConcreteCommand2 extends Command{
	private Receiver recevier;
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		recevier.doSomething();
	}

	public ConcreteCommand2(Receiver recevier) {
		super();
		this.recevier = recevier;
	}

}
