package gaoqi.责任链模式;

/**
 * 享元模式
 * @createTime 2018年3月3日 下午7:29:32
 * @author MrWang
 */
public abstract class Manager {
	private String name;
	private Manager nextManager;
	
	public void setNextManager(Manager nextManager) {
		this.nextManager = nextManager;
	}

	public Manager(String name) {
		super();
		this.name = name;
	}
	
	/**
	 * 则是获取最终执行方法的方法
	 * @param request
	 * @return
	 */
	public final Response handleRequest(Request request) {
		if(request == null){
			return null;
		}
		Response response = null;
		if(this.getLevel().compareTo(request.getLevel()) == 0){
			response = handle(request);
		} else{
			if(nextManager != null)
				response = this.nextManager.handleRequest(request);
			else{
				System.out.println("已经没人可以处理请求了");
				response = new Response("已经没人可以处理请求了");
			}
		}
		return response;
	}
	
	/**
	 * 这个是每个manager处理实际请求的模板方法
	 * @param request
	 * @return
	 */
	public abstract Response handle(Request request);
	
	/**
	 * 这是获取处理级别的方法
	 * @param request
	 * @return
	 */
	public abstract Level getLevel();
	
}
