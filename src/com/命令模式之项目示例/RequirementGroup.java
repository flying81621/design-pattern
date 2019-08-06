package com.命令模式之项目示例;

/**
 * 需求组
 * @createTime 2018年1月29日 下午4:59:52
 * @author MrWang
 */
public class RequirementGroup extends Group{

	@Override
	public void find() {
		// TODO Auto-generated method stub
		System.out.println("找到需求组。。。。");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("客户要求增加一项功能。。。。");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("客户要求删除一项功能。。。。");
	}

	@Override
	public void change() {
		// TODO Auto-generated method stub
		System.out.println("客户要求增加一项功能。。。。");
	}

	@Override
	public void plan() {
		// TODO Auto-generated method stub
		System.out.println("客户要求需求变更计划。。。。");
	}

}
