package com.命令模式之项目示例;

/**
 * 负责人，负责下命令
 * @createTime 2018年1月29日 下午5:14:15
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
	 * 执行命令
	 */
	public void action(){
		this.command.execute();
	}
}
