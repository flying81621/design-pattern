package com.访问者模式之通用模式;

/**
 * 场景类
 * @createTime 2018年2月7日 下午7:01:43
 * @author MrWang
 */
public class Client {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++){
			//获得一个元素对象
			Element element = ObjectStruture.createElement();
			//接受访问者的访问
			element.accept(new Visitor());
		}
	}
}
