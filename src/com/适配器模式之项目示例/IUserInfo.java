package com.适配器模式之项目示例;

/**
 * 员工信息接口
 * @createTime 2018年1月29日 下午9:52:51
 * @author MrWang
 */
public interface IUserInfo {
	/**
	 * 获取用户姓名
	 * @return
	 */
	String getUserName();
	/**
	 * 获取家庭住址，好给领导送礼啊
	 * @return
	 */
	String getHomeAddress();
	/**
	 * 获得电话号码
	 * @return
	 */
	String getMobileNumber();
	/**
	 * 获取办公电话，一般是座机
	 * @return
	 */
	String getOfficeTelNumber();
	/**
	 * 这个人的职位是什么
	 * @return
	 */
	String getJobPosition();
	/**
	 * 获得家庭电话
	 * @return
	 */
	String getHomeTelNumber();
}
