/**
 * 
 */
package com.建造者模式;

/**
 * 场景测试类
 * 
 * @createTime 2018年1月29日 下午3:36:36
 * @author MrWang
 */
public class Client {
	public static void main(String[] args) {
		Director director = new Director();
		System.out.println("---------生产10辆A型奔驰--------------");
		// 生产10辆A型奔驰
		for (int i = 0; i < 10; i++) {
			System.out.println("第"+i+"辆A类奔驰车");
			director.getABenzModel().run();
		}
		
		System.out.println("---------生产10辆B型奔驰--------------");
		// 生产10辆B型奔驰
		for (int i = 0; i < 10; i++) {
			System.out.println("第"+i+"辆B类奔驰车");
			director.getBBenzModel().run();
		}
		System.out.println("---------生产10辆A型宝马--------------");
		// 生产10辆A型宝马
		for (int i = 0; i < 10; i++) {
			System.out.println("第"+i+"辆A类宝马车");
			director.getABMWModel().run();
		}
	}
}
