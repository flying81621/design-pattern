package gaoqi.享元模式;

/**
 * 模拟围棋的下棋过程
 * @createTime 2018年3月3日 下午7:03:40
 * @author MrWang
 */
public class Client {
	public static void main(String[] args) {
		ChessFlyWeight chess = ChessFlyWeightFactory.getChess("黑色");
		ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("黑色");
		
		//测试享元工厂创建出来的是一个对象
		System.out.println(chess);
		System.out.println(chess2);
		System.out.println(chess == chess2);
		
		//实则为围棋的颜色大小等信息是一样的，这部分不用反复创建，使用共享的既可，而位置是不同的，采用不同的位置既可
		chess.display(new Coordinate("10", "20"));
		chess2.display(new Coordinate("10", "20"));
	}
}
