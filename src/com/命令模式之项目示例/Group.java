package com.命令模式之项目示例;

/**
 * 项目抽象组
 * @createTime 2018年1月29日 下午4:56:23
 * @author MrWang
 */
public abstract class Group {
	/**
	 * 甲乙双方分开办公，如果你要和某个组进行讨论，你需要先找到这个组
	 */
	public abstract void find();
	/**
	 * 被要求增加功能
	 */
	public abstract void add();
	/**
	 * 被要求删除功能
	 */
	public abstract void delete();
	/**
	 * 被要求改变功能
	 */
	public abstract void change();
	/**
	 * 被要求给出所有的变更计划
	 */
	public abstract void plan();
}
