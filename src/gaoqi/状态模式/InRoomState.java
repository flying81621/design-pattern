package gaoqi.状态模式;

/**
 * 酒店的已经入住模式
 * @createTime 2018年3月4日 下午8:23:18
 * @author MrWang
 */
public class InRoomState implements State {

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("酒店已经入住了");
	}

}
