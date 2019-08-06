package com.命令模式之项目示例;

/**
 * 增加需求的命令
 * @createTime 2018年1月29日 下午5:08:15
 * @author MrWang
 */
public class AddRequirementCommand extends Command {

	@Override
	public void execute() {
		//找到需求组
		super.requirementGroup.find();
		//增加一项需求
		super.requirementGroup.add();
		//给出计划
		super.requirementGroup.plan();
	}

}
