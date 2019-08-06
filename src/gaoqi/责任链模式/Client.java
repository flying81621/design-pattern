package gaoqi.责任链模式;

/**
 * 
 * @createTime 2018年3月3日 下午8:06:39
 * @author MrWang
 */
public class Client {
	public static void main(String[] args) {
		Manager fir = new FirstManager("张三");
		Manager se = new SecondManager("李四");
		Manager th = new ThirdManager("王五");
		
		fir.setNextManager(se);
		se.setNextManager(th);
		
		Request request = new Request(new RequestInfo("小二", 16, "回家结婚"));
		Response response = fir.handleRequest(request);
		System.out.println("请求的结果是:" + response);
	}
}
