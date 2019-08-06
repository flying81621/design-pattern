package com.命令模式之通用模式;

/**
 * 调用者类
 * @createTime 2018年1月29日 下午5:47:53
 * @author MrWang
 */
public class Invoker {
	private Command command;
	
	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	/**
	 * 声明一个调用命令的方法
	 */
	public void action(){
		command.execute();
	}
}
