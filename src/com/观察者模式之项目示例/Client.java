package com.观察者模式之项目示例;

/**
 * 场景类
 * @createTime 2018年2月7日 上午12:39:57
 * @author MrWang
 */
public class Client {
	public static void main(String[] args) {
		//定义被观察者
		HanFeiZi hanFeiZi = new HanFeiZi();
		
		//定义一个观察者
		Lisi lisi = new Lisi();
		
		hanFeiZi.addObserver(lisi);
		
		hanFeiZi.haveBreakFirst();
		hanFeiZi.haveFun();
	}
}
