package gaoqi.状态模式;

/**
 * 已预订模式
 * @createTime 2018年3月4日 下午8:22:13
 * @author MrWang
 */
public class BookedState implements State {

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("房间已经被预定了");
	}

}
