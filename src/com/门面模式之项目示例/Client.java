package com.门面模式之项目示例;

/**
 * 客户端模拟
 * @createTime 2018年2月6日 下午11:49:30
 * @author MrWang
 */
public class Client {
	public static void main(String[] args) {
		ModerPostOffice moderPostOffice = new ModerPostOffice();
		String context = "这是我的信的内容";
		String address = "上海";
		moderPostOffice.sendLetter(context, address);
	}
}
