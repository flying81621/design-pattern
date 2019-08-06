package com.责任链模式之项目示例;

/**
 * 父亲的责任链
 * @createTime 2018年1月29日 下午6:26:04
 * @author MrWang
 */
public class Father extends Handler {
	//父亲只处理女儿的请求
	public Father(){
		super(FATHER_LEVEL);
	}

	@Override
	public void response(IWomen women) {
		System.out.println("------女儿向父亲请示----");
		System.out.println(women.getRequest());
		System.out.println("父亲说，你去玩吧");
	}

}
