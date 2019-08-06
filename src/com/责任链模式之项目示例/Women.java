package com.责任链模式之项目示例;

/**
 * 
 * @createTime 2018年1月29日 下午6:07:06
 * @author MrWang
 */
public class Women implements IWomen {
	/**'
	 * 通过一个int值来表示妇女的个人状况
	 * 1：未嫁从父
	 * 2：既嫁从夫
	 * 3：夫死从子
	 */
	private int type;
	
	/**
	 * 妇女的请求
	 */
	private String request;

	/**
	 * 通过构造函数把妇女的状况和请求传入
	 * @param type
	 * @param request
	 */
	public Women(int type, String request) {
		super();
		this.type = type;
		//为便于显示，这里将请求进行了一定的加工
		switch (this.type) {
		case 1:
			this.request = "女儿的请求是：" + request;
			break;
		case 2:
			this.request = "妻子的请求是：" + request;
			break;
		case 3:
			this.request = "母亲的请求是：" + request;
			break;
			default:
				this.request = request;
		}
	}

	@Override
	public int getType() {
		return type;
	}

	@Override
	public String getRequest() {
		return request;
	}

}
