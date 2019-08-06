package com.桥接模式高淇;

/**
 * 桥接模式测试类，桥接模式适用于多维度的情况，进行自由的组合
 * @createTime 2018年3月3日 上午10:33:07
 * @author MrWang
 */
public class Client {
	public static void main(String[] args) {
		Computer lenovo = new DeskTop(new Lenove());
		lenovo.sale();
		
		Computer dell = new Laptop(new Dell());
		dell.sale();
	}
}
