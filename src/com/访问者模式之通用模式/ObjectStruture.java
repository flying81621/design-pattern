package com.访问者模式之通用模式;

import java.util.Random;

/**
 * 结构对象
 * @createTime 2018年2月7日 下午7:00:01
 * @author MrWang
 */
public class ObjectStruture {
	//对象生成器
	public static Element createElement(){
		Random r = new Random();
		if(r.nextInt(100) > 50){
			return new ConcreteElement1();
		} else {
			return new ConcreteElement2();
		}
	}
}
