package com.桥接模式高淇;

/**
 * 
 * @createTime 2018年3月3日 上午10:32:10
 * @author MrWang
 */
public class DeskTop extends Computer {
	/**
	 * @param brand
	 */
	public DeskTop(Brand brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sale() {
		// TODO Auto-generated method stub
		super.sale();
		System.out.println("销售台式机");
	}

}
