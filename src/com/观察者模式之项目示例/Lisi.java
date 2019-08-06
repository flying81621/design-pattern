package com.观察者模式之项目示例;

/**
 * 这是观察者的一个实现类
 * @createTime 2018年2月7日 上午12:37:00
 * @author MrWang
 */
public class Lisi implements Observer {

	@Override
	public void update(Object object) {
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
