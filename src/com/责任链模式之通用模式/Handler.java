package com.责任链模式之通用模式;

/**
 * 抽象处理者
 * @createTime 2018年1月29日 下午7:00:30
 * @author MrWang
 */
public abstract class Handler {
	/**
	 * 定义下一个处理者
	 */
	private Handler nextHanler;
	/**
	 * 设置下一个处理者
	 * @param nextHandler
	 */
	public void setNextHandler(Handler nextHandler){
		this.nextHanler = nextHandler;
	}
	
	/**
	 * 具体处理消息的方法
	 * @param request
	 * @return
	 */
	public final Response handleMessage(Request request){
		Response response = null;
		if(this.getHandlerLevel(request).equals(request.getLevel())){
			response = this.echo(request);
		} else{
			if(this.nextHanler != null){
				response = this.nextHanler.handleMessage(request);
			} else{
				System.out.println("就怎么怎么样，这里是饱和策略");
			}
		}
		return response;
	}
	
	/**
	 * 每一个处理者都有一个处理级别的模板方法
	 * @return
	 */
	public abstract Level getHandlerLevel(Request request); 
	
	/**
	 * 处理请求，获取响应的模板方法
	 * @return
	 */
	public abstract Response echo(Request request);
}
