package com.命令模式之通用模式;

/**
 * 命令抽象类
 * @createTime 2018年1月29日 下午5:43:44
 * @author MrWang
 */
public abstract class Command {
	/**
	 * 每个命令必须有一个执行命令的方法
	 */
	public abstract void execute();
}
