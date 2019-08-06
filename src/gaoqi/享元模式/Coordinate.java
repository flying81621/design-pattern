package gaoqi.享元模式;

/**
 * 象棋的坐标实体类,这个是外部的状态，也就是不共享的状态
 * @createTime 2018年3月3日 下午6:46:11
 * @author MrWang
 */
//在类图中，这里要求也实现享元接口或继承享元抽象类
public class Coordinate  /*implements ChessFlyWeight*/{
	private String x,y;

	public Coordinate(String x, String y) {
		super();
		this.x = x;
		this.y = y;
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Coordinate [x=" + x + ", y=" + y + "]";
	}
}
