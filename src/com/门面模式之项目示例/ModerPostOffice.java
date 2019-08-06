package com.门面模式之项目示例;

/**
 * 现代化的邮局,只需要告诉邮局邮件内容和邮寄地址，就可以委托邮局完成邮寄
 * @createTime 2018年2月6日 下午11:45:54
 * @author MrWang
 */
public class ModerPostOffice {
	
	private ILetterProcess letterProcess = new LetterProcessImpl();
	
	//这里加入一个警察检查的过程
	private Police police = new Police();
	
	/**
	 * 一体化的邮寄过程，只需要告诉邮寄内容和地址
	 * @param context
	 * @param address
	 */
	public void sendLetter(String context, String address){
		letterProcess.writeContext(context);
		letterProcess.fillEnvelop(address);
		letterProcess.letterIntoEnvelop();
		
		//在发送信的时候，要先检查内容是否违规
		police.checkLetter(letterProcess);
		
		letterProcess.sendLetter();
	}
}
