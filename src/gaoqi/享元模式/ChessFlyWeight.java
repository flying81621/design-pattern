package gaoqi.享元模式;

/**
 * 享元模式之共同的部分,模拟围棋的展示
 * 共同的部分：颜色，大小等
 * 不同的部分：位置
 * @createTime 2018年3月3日 下午6:43:19
 * @author MrWang
 */
public interface ChessFlyWeight {
	/**
	 * 这是共同的部分
	 * @param color
	 */
	void setColor(String color);
	
	String getColor();
	
	/**
	 * 享元模式的不同的部分的展示
	 * @param coordinate
	 */
	void display(Coordinate coordinate);
}
