/**
 * 
 */
package com.原型模式;

/**
 * 广告信模板代码
 * @createTime 2018年1月29日 下午4:00:57
 * @author MrWang
 */
public class AdvTemplate {
	/**
	 * 广告信名称
	 */
	private String advSubject = "XX银行国庆信用卡抽奖活动";
	/**
	 * 广告信内容
	 */
	private String advContext = "国庆抽奖活动通知：只要刷卡就送你一百万！。。。";
	
	public String getAdvSubject() {
		return advSubject;
	}
	public void setAdvSubject(String advSubject) {
		this.advSubject = advSubject;
	}
	public String getAdvContext() {
		return advContext;
	}
	public void setAdvContext(String advContext) {
		this.advContext = advContext;
	}
	
}
