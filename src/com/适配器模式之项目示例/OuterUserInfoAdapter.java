package com.适配器模式之项目示例;

import java.util.Map;

/**
 * 员工的适配器类，用于外部服务公司的员工信息和我们的员工信息进行对接
 * 方法内部仍然模拟从数据库进行查询
 * 这是采用类适配器的模式，也可以采用组合适配器的模式，即不采用继承，而使用一个组合属性
 * @createTime 2018年1月29日 下午10:15:47
 * @author MrWang
 */
public class OuterUserInfoAdapter extends OuterUser implements IUserInfo {
	
	private Map<String, String> baseInfo = super.getUserBaseInfo();
	private Map<String, String> homeInfo = super.getUserHomeInfo();
	private Map<String, String> officeInfo = super.getUserOfficeInfo();

	@Override
	public String getUserName() {
		String username = this.baseInfo.get("userName");
		System.out.println(username);
		return username;
	}

	@Override
	public String getHomeAddress() {
		String homeAddress = this.homeInfo.get("homeAddress");
		System.out.println(homeAddress);
		return homeAddress;
	}

	@Override
	public String getMobileNumber() {
		String mobileNumber = this.baseInfo.get("mobileNumber");
		System.out.println(mobileNumber);
		return mobileNumber;
	}

	@Override
	public String getOfficeTelNumber() {
		String officeTelNumber = this.officeInfo.get("officeTelNumber");
		System.out.println(officeTelNumber);
		return officeTelNumber;
	}

	@Override
	public String getJobPosition() {
		String jobPosition = this.officeInfo.get("jobPosition");
		System.out.println(jobPosition);
		return jobPosition;
	}

	@Override
	public String getHomeTelNumber() {
		String homeTelNumber = this.homeInfo.get("homeTelNumber");
		System.out.println(homeTelNumber);
		return homeTelNumber;
	}

}
