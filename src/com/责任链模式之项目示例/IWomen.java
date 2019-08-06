package com.责任链模式之项目示例;

/**
 * 根据古代女子“三从四得”来模拟责任链模式
 * 三从：
 * 		未嫁从父、既嫁从夫、夫死从子
 * @createTime 2018年1月29日 下午6:01:14
 * @author MrWang
 */
public interface IWomen {
	/**
	 * 获得个人状况
	 * @return
	 */
	int getType();
	
	/**
	 * 获取个人请示，比如：你要干什么去，出去逛街还是出去约会
	 * @return
	 */
	String getRequest();
}
