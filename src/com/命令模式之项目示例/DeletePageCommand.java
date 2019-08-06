package com.命令模式之项目示例;

/**
 * 删除页面的命令
 * @createTime 2018年1月29日 下午5:11:05
 * @author MrWang
 */
public class DeletePageCommand extends Command {

	@Override
	public void execute() {
		//找到页面组
		super.pageGroup.find();
		//删除一个页面
		super.pageGroup.delete();
		//给出计划
		super.pageGroup.plan();
		//找到代码组
		super.codeGroup.find();
		//删除一个任务
		super.codeGroup.delete();
		//给出计划
		super.codeGroup.plan();
	}

}
