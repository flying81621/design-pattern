package com.责任链模式之项目示例;

/**
 * 儿子的责任链
 * @createTime 2018年1月29日 下午6:26:04
 * @author MrWang
 */
public class Son extends Handler {
	//父亲只处理女儿的请求
	public Son(){
		super(SON_LEVEL);
	}

	@Override
	public void response(IWomen women) {
		System.out.println("------母亲向请示----");
		System.out.println(women.getRequest());
		System.out.println("儿子说，你去玩吧");
	}

}
