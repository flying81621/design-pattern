/**
 * 
 */
package com.建造者模式;

/**
 * 宝马车模型
 * @createTime 2018年1月29日 下午3:14:12
 * @author MrWang
 */
public class BMWModel extends CarModel {

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("宝马车运行起来了");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("宝马车运行停下了");
	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("宝马车在鸣笛");
	}

	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("宝马车的引擎在轰鸣");
	}

}
