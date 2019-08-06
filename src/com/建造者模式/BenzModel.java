/**
 * 
 */
package com.建造者模式;

/**
 * 奔驰车模型
 * @createTime 2018年1月29日 下午3:14:12
 * @author MrWang
 */
public class BenzModel extends CarModel {

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("奔驰车运行起来了");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("奔驰车运行停下了");
	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("奔驰车在鸣笛");
	}

	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("奔驰车的引擎在轰鸣");
	}

}
