package gaoqi.享元模式;

import java.util.HashMap;
import java.util.Map;

/**
 * 这个是享元工厂，用来创建享元对象的
 * @createTime 2018年3月3日 下午6:50:48
 * @author MrWang
 */
public class ChessFlyWeightFactory {
	private static Map<String, ChessFlyWeight> factory = new HashMap<>();
	
	/**
	 * 根据颜色获取享元对象
	 * @param color
	 * @return
	 */
	public static ChessFlyWeight getChess(String color) {
		ChessFlyWeight chess = factory.get(color);
		if(chess == null) {
			chess = new ConcreteChessFlyWeight(color);
			factory.put(color, chess);
		}
		return chess;
	}
}
