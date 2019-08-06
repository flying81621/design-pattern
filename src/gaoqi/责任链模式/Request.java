package gaoqi.责任链模式;

/**
 * 这个是请求，耦合度比较高的，主要体现在获取level的方法那里的if else 语句
 * @createTime 2018年3月3日 下午7:34:54
 * @author MrWang
 */
public class Request {
	
	private RequestInfo requestInfo;
	
	public Request(RequestInfo requestInfo) {
		super();
		this.requestInfo = requestInfo;
	}

	/**
	 * 这个是获取请求水平的方法，耦合度比较高
	 * 我的想法是其实可以用一个枚举来解决
	 * @return
	 */
	public Level getLevel(){
		int days = requestInfo.getDays();
		if(days <= 3){
			return new Level(Level.FirstLevel);
		} else if(days <= 10){
			return new Level(Level.SecondLevel);
		} else {
			return new Level(Level.ThirdLevel);
		}
	}
	
	
}
