package gaoqi.策略模式;

/**
 * 
 * @createTime 2018年3月4日 上午12:26:52
 * @author MrWang
 */
public class Client {
	public static void main(String[] args) {
		Strategy oldMany = new OldCustomerManyStrategy();
		Context context = new Context(oldMany);
		
		context.exe(800);
	}
}
