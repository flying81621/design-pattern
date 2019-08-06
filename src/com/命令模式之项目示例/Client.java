package com.命令模式之项目示例;

/**
 * 场景测试类
 * @createTime 2018年1月29日 下午5:15:50
 * @author MrWang
 */
class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoker invoker = new Invoker();
		System.out.println("----客户要求增加一项功能------");
		Command command = new AddRequirementCommand();
		invoker.setCommand(command);
		invoker.action();
	}

}
