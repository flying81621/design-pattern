package com.命令模式之项目示例;

/**
 * 美工组
 * @createTime 2018年1月29日 下午4:59:52
 * @author MrWang
 */
public class PageGroup extends Group{

	@Override
	public void find() {
		// TODO Auto-generated method stub
		System.out.println("找到美工组。。。。");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("客户要求美工组增加一项页面。。。。");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("客户要求美工组删除一页面。。。。");
	}

	@Override
	public void change() {
		// TODO Auto-generated method stub
		System.out.println("客户要求美工组增加一项页面。。。。");
	}

	@Override
	public void plan() {
		// TODO Auto-generated method stub
		System.out.println("客户要求美工组页面变更计划。。。。");
	}

}
