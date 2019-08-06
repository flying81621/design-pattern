package com.命令模式之项目示例;

/**
 * 代码组
 * @createTime 2018年1月29日 下午4:59:52
 * @author MrWang
 */
public class CodeGroup extends Group{

	@Override
	public void find() {
		// TODO Auto-generated method stub
		System.out.println("找到代码组。。。。");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("客户要求代码组增加一项功能。。。。");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("客户要求代码组删除一功能。。。。");
	}

	@Override
	public void change() {
		// TODO Auto-generated method stub
		System.out.println("客户要求代码组增加一项功能。。。。");
	}

	@Override
	public void plan() {
		// TODO Auto-generated method stub
		System.out.println("客户要求代码组功能变更计划。。。。");
	}

}
