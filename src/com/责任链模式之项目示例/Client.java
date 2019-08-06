package com.责任链模式之项目示例;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Test;

/**
 * 
 * @createTime 2018年1月29日 下午6:35:05
 * @author MrWang
 */
public class Client {

	public static void main(String[] args) {
		Random r = new Random(1);
		//随机定义几个女性
		List<IWomen> womens = new ArrayList<>();
		for (int i = 0; i < 5; i++){
			womens.add(new Women(r.nextInt(3) + 1,"我要出去逛街"));
		}
		//定义三个请示对象
		Handler father = new Father();
		Handler hasband = new Hasband();
		Handler son = new Son();
		//定义责任链的顺序
		father.setNextHandler(hasband);
		hasband.setNextHandler(son);
		//开始执行请示
		for (IWomen iWomen : womens) {
			//从父亲这一级开始进行请示
			father.handleMessage(iWomen);
		}
	}
	
	@Test
	public void test(){
		Random r = new Random();
		for(int i = 0; i < 10; i++)
			System.out.println(r.nextInt(3));
	}

}
