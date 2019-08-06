package com.门面模式之项目示例;

/**
 * 一个简单的实现
 * @createTime 2018年2月6日 下午11:43:59
 * @author MrWang
 */
public class LetterProcessImpl implements ILetterProcess {

	@Override
	public void writeContext(String context) {
		// TODO Auto-generated method stub
		System.out.println("写信的内容是；"+context);
	}

	@Override
	public void fillEnvelop(String address) {
		// TODO Auto-generated method stub
		System.out.println("填写的收件人的地址是："+address);
	}

	@Override
	public void letterIntoEnvelop() {
		// TODO Auto-generated method stub
		System.out.println("把信装入信封");
	}

	@Override
	public void sendLetter() {
		// TODO Auto-generated method stub
		System.out.println("邮寄信");
	}

}
