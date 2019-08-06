package com.原型模式;

import java.util.Random;

/**
 * 场景测试类
 * @createTime 2018年1月29日 下午4:12:32
 * @author MrWang
 */
public class Client {
	//发送账单的数量，这个数据是从数据库中取得的
	private static final int MAX_COUNT = 6;
	public static void main(String[] args) {
		//把模板定义出来，这个是从数据库中取得的
		Mail mail = new Mail(new AdvTemplate());
		//设置共有部分
		mail.setTail("XX银行所有");
		//以下是模拟从数据库中查出来用户的数据，然后根据用户的额数据来设计邮件的内容
		for(int i = 0; i < MAX_COUNT; i++){
			//一下是每封邮件不同的地方
			Mail clone = mail.clone();
			clone.setAppellation(getString(5)+" 先生（女士）");
			clone.setReceiver(getString(5)+"@"+getString(8)+".com");
			//然后发送邮件
			sendMail(clone);
		}
	}
	/**
	 * 模拟发送邮件
	 * @param mail
	 */
	private static void sendMail(Mail mail) {
		System.out.println("标题："+mail.getSubject()+"\t收件人："+mail.getReceiver()+"\t...发送成功！");
	}
	/**
	 * 模拟随机生成一个名字
	 * @param i
	 * @return
	 */
	private static String getString(int len) {
		String origin = "abcedsladffjhgklgjhogjuibnrikgzujivjmvsnx";
		StringBuilder sb = new StringBuilder();
		Random r = new Random();
		for(int i = 0; i < len; i++){
			sb.append(origin.charAt(r.nextInt(origin.length())));
		}
		return sb.toString();
	}
}
