package gaoqi.责任链模式;

import java.util.Comparator;

/**
 * 这个是处理水平
 * @createTime 2018年3月3日 下午7:37:50
 * @author MrWang
 */
public class Level implements Comparable<Level>{
	public static int FirstLevel = 1;
	public static int SecondLevel = 2;
	public static int ThirdLevel = 3;
	
	private int level;

	public Level(int level) {
		super();
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public int compareTo(Level o) {
		// TODO Auto-generated method stub
		return level - o.getLevel();
	}



	
}