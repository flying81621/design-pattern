package com.门面模式之项目示例;

/**
 * 模拟一个写信投递的过程
 * @createTime 2018年2月6日 下午11:40:33
 * @author MrWang
 */
public interface ILetterProcess {
	/**
	 * 写信
	 * @param context 信的内容
	 */
	void writeContext(String context);
	
	/**
	 * 写信封的内容，如收件人电话之类的
	 * @param address
	 */
	void fillEnvelop(String address);
	
	/**
	 * 把信装入信封
	 */
	void letterIntoEnvelop();
	
	/**
	 * 然后邮递
	 */
	void sendLetter();
}
