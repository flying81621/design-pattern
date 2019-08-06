package gaoqi.责任链模式;

/**
 * 这个是响应
 * 
 * @createTime 2018年3月3日 下午7:34:21
 * @author MrWang
 */
public class Response {
	private String response;

	public Response(String response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return "响应是：" + response;
	}

}
