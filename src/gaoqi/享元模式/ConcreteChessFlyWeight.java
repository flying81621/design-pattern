package gaoqi.享元模式;

/**
 * 这个是内部状态，也就是共享的状态
 * @createTime 2018年3月3日 下午6:44:58
 * @author MrWang
 */
public class ConcreteChessFlyWeight implements ChessFlyWeight {
	
	private String color;
	
	public ConcreteChessFlyWeight(String color) {
		super();
		this.color = color;
	}

	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		this.color = color;
	}

	@Override
	public String getColor() {
		System.out.println("围棋的颜色是：" + color);
		return color;
	}

	@Override
	public void display(Coordinate coordinate) {
		System.out.println("围棋的坐标为:x：" + coordinate.getX() + ",y:" + coordinate.getY());
	}

}
