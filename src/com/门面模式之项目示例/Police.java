package com.门面模式之项目示例;

/**
 * 现在插入一个警察局检查的过程
 * @createTime 2018年2月6日 下午11:51:06
 * @author MrWang
 */
public class Police {
	public void checkLetter(ILetterProcess letterProcess){
		System.out.println("警察已经检查过了，可以放行！");
	}
}
