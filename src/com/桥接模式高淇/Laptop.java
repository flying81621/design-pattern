package com.桥接模式高淇;

/**
 * 
 * @createTime 2018年3月3日 上午10:27:28
 * @author MrWang
 */
public class Laptop extends Computer {
	/**
	 * @param brand
	 */
	public Laptop(Brand brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void sale() {
		// TODO Auto-generated method stub
		super.sale();
		System.out.println("销售笔记本");
	}

}
