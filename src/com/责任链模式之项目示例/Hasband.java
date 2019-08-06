package com.责任链模式之项目示例;

import javax.print.attribute.HashAttributeSet;

/**
 * 丈夫的责任链
 * @createTime 2018年1月29日 下午6:26:04
 * @author MrWang
 */
public class Hasband extends Handler {
	//父亲只处理女儿的请求
	public Hasband(){
		super(HASBAND_LEVEL);
	}

	@Override
	public void response(IWomen women) {
		System.out.println("------妻子向丈夫请示----");
		System.out.println(women.getRequest());
		System.out.println("丈夫说，老老实实的在家里看孩子！");
	}

}
