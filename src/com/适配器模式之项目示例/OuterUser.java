package com.适配器模式之项目示例;

import java.util.HashMap;
import java.util.Map;

/**
 * 这是外部借调员工的实现类
 * 
 * @createTime 2018年1月29日 下午10:09:27
 * @author MrWang
 */
public class OuterUser implements IOuterUser {

	@Override
	public Map<String, String> getUserBaseInfo() {
		// TODO 模拟查询数据库的过程然后返回结果
		Map<String, String> baseInfo = new HashMap<>();
		baseInfo.put("userName", "小三");
		baseInfo.put("mobileNumber", "13899990000");
		return baseInfo;
	}

	@Override
	public Map<String, String> getUserOfficeInfo() {
		// TODO 模拟查询数据库的过程然后返回结果
		Map<String, String> homeInfo = new HashMap<>();
		homeInfo.put("homeTelNumber", "010-4488777");
		homeInfo.put("homeAddress", "上海最高的楼");
		return homeInfo;
	}

	@Override
	public Map<String, String> getUserHomeInfo() {
		// TODO 模拟查询数据库的过程然后返回结果
		Map<String, String> officeInfo = new HashMap<>();
		officeInfo.put("jobPosition", "经理的小蜜");
		officeInfo.put("officeTelNumber", "010-2222777");
		return officeInfo;
	}

}
