package gaoqi.状态模式;

/**
 * 
 * @createTime 2018年3月4日 下午8:25:13
 * @author MrWang
 */
public class Client {
	public static void main(String[] args) {
		Context context = new Context();
		context.setState(new FreeState());
		context.setState(new BookedState());
		context.setState(new InRoomState());
	}
}
