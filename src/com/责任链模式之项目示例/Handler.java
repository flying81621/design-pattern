package com.责任链模式之项目示例;

/**
 * 定义一个处理类抽象类
 * 
 * @createTime 2018年1月29日 下午6:13:35
 * @author MrWang
 */
public abstract class Handler {
	public static final int FATHER_LEVEL = 1;
	public static final int HASBAND_LEVEL = 2;
	public static final int SON_LEVEL = 3;
	// 定义一个能处理的级别
	private int level;
	// 责任链的传递，下一个处理者
	private Handler nextHandler;

	// 构造方法说明自己能处理的范围
	public Handler(int level) {
		super();
		this.level = level;
	}

	/**
	 * 处理方法
	 * @param women
	 */
	public final void handleMessage(IWomen women) {
		if (this.level == women.getType()) {
			this.response(women);
		} else {
			if (nextHandler != null){
				this.nextHandler.handleMessage(women);
			} else{
				System.out.println("已经没有人可以处理了");
			}
		}
	}

//	public abstract int getLevel();
	
	/**
	 * 给与women响应的模板方法
	 */
	public abstract void response(IWomen women);

	/**
	 * 设置请求链的下一个负责人
	 * 
	 * @param nextHandler
	 */
	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
}
