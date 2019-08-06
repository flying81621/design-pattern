package com.适配器模式之项目示例;

import java.util.Map;

/**
 * 这是借调的外部的劳动服务公司的人员信息接口
 * 
 * @createTime 2018年1月29日 下午10:04:48
 * @author MrWang
 */
public interface IOuterUser {
	/**
	 * 基本信息，如名称、性别、手机号码等
	 * @return
	 */
	Map<String, String> getUserBaseInfo();
	
	/**
	 * 工作区域信息
	 * @return
	 */
	Map<String, String> getUserOfficeInfo();
	
	/**
	 * 用户的家庭信息
	 * @return
	 */
	Map<String, String> getUserHomeInfo();
}
