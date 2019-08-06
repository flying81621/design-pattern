package com.迭代器模式之项目示例;

import java.util.Iterator;

/**
 * 项目信息接口
 * @createTime 2018年1月29日 下午11:01:03
 * @author MrWang
 */
public interface IProject {
	/**
	 * 增加项目
	 * @param name 项目名称
	 * @param num 项目成员数量
	 * @param cost 项目价值
	 */
	void add(String name, int num, int cost);
	
	/**
	 * 根据名称查询项目信息
	 * @param name 要查询的项目名称
	 * @return
	 */
	String getProjectInfo(String name);
	
	/**
	 * 查询项目的详细信息
	 * @return
	 */
	String getProjectInfo();
	
	/**
	 * 获得一个可以被遍历的对象
	 * @return
	 */
	Iterator iterator();
	
}
