package com.观察者模式之java.util.api提供的模式;

import java.util.Observable;
import java.util.Observer;

/**
 * 这个是一个具体的访问者
 * @createTime 2018年2月7日 上午1:04:18
 * @author MrWang
 */
public class LiSi implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("李斯：开始监测，汇报");
		reportToQinShiHuang();
		System.out.println("李斯：汇报完毕");
	}

	/**
	 * 
	 */
	private void reportToQinShiHuang() {
		// TODO Auto-generated method stub
		System.out.println("正在给秦始皇汇报中");
	}

}
