package com.适配器模式之项目示例;

/**
 * 员工信息实现类
 * @createTime 2018年1月29日 下午9:56:33
 * @author MrWang
 */
public class UserInfo implements IUserInfo {

	@Override
	public String getUserName() {
		System.out.println("这是员工的名字，叫做。。。。");
		return "你大爷";
	}

	@Override
	public String getHomeAddress() {
		System.out.println("这是员工的家庭住址");
		return "上海金融大厦顶楼";
	}

	@Override
	public String getMobileNumber() {
		System.out.println("这是员工的电话");
		return "13388889999";
	}

	@Override
	public String getOfficeTelNumber() {
		System.out.println("这是员工的办公电话");
		return "010-7777888";
	}

	@Override
	public String getJobPosition() {
		System.out.println("员工的职位为BOSS");
		return "BOSS的小蜜";
	}

	@Override
	public String getHomeTelNumber() {
		System.out.println("这是员工的家庭电话");
		return "010-8888888";
	}

}
