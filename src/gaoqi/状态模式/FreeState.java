package gaoqi.状态模式;

/**
 * 酒店状态的空闲模式
 * @createTime 2018年3月4日 下午8:21:18
 * @author MrWang
 */
public class FreeState implements State {

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("房间现在是空闲状态，可以预定");
	}

}
