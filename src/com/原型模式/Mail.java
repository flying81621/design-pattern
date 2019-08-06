package com.原型模式;

/**
 * 广告类
 * @createTime 2018年1月29日 下午4:04:43
 * @author MrWang
 */
public class Mail implements Cloneable{
	/**
	 * 收件人
	 */
	private String receiver;
	/**
	 * 邮件名称
	 */
	private String subject;
	/**
	 * 称谓
	 */
	private String appellation;
	/**
	 * 邮件内容
	 */
	private String context;
	/**
	 * 邮件的尾部，一般都会加上“AAA版权所有”等信息
	 */
	private String tail;
	
	public Mail(AdvTemplate advTemplate) {
		this.subject = advTemplate.getAdvSubject();
		this.context = advTemplate.getAdvContext();
	}

	/**
	 * 注意，采用clone只是一个浅拷贝，也就是只有基本类型和String会被拷贝，而其对象内部的数组、引用对象都都不拷贝，还是指向原来的对象的在堆中的地址；
	 * 而如果想达到目标的拷贝，则可以在下面的clone中，将现在的引用对象指向拷贝后的地址，如list = list.clone()
	 * 由此引来的另外一个问题就是：本对象的final变量不可拷贝，所以采用原型模式时，引用类型尽量不要采用final修饰
	 */
	@Override
	public Mail clone(){
		try {
			return (Mail) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Mail(new AdvTemplate());
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAppellation() {
		return appellation;
	}

	public void setAppellation(String appellation) {
		this.appellation = appellation;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getTail() {
		return tail;
	}

	public void setTail(String tail) {
		this.tail = tail;
	}
	
}
