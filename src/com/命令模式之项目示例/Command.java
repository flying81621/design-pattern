package com.命令模式之项目示例;

/**
 * 抽象命令类
 * @createTime 2018年1月29日 下午5:05:30
 * @author MrWang
 */
public abstract class Command {
	//定义好三个组，可以直接使用   设计上这三个命令的接受者通过构造函数传入更好点
	protected RequirementGroup requirementGroup = new RequirementGroup();
	protected PageGroup pageGroup = new PageGroup();
	protected CodeGroup codeGroup = new CodeGroup();
	
	//定义抽象方法，用来进行命令的任务执行
	public abstract void execute();
}
