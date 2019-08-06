package com.桥接模式高淇;

/**
 * 
 * @createTime 2018年3月3日 上午10:22:52
 * @author MrWang
 */
public abstract class Computer {
	protected Brand brand;

	public Computer(Brand brand) {
		super();
		this.brand = brand;
	}

	public void sale(){
		brand.sale();
	}
}
