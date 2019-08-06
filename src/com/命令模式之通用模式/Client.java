package com.命令模式之通用模式;

/**
 * 场景类
 * @createTime 2018年1月29日 下午5:50:07
 * @author MrWang
 */
public class Client {
	public static void main(String[] args) {
		//声明调用者
		Invoker invoker = new Invoker();
		//定义一个接受者（这是被命令的对象）
		Receiver receiver = new ConcreteReceiver1();
		//定义一个要施加的命令
		Command command = new ConcreteCommand1(receiver);
		//调用者设置命令
		invoker.setCommand(command);
		//调用者执行调用的命令
		invoker.action();
	}
}
