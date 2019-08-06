package gaoqi.状态模式;

/**
 * 状态控制环境
 * @createTime 2018年3月4日 下午8:23:52
 * @author MrWang
 */
public class Context {
	private State state;

	public void setState(State state) {
		System.out.println("状态切换");
		this.state = state;
		state.handle();
	}
}
