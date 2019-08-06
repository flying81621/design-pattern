package gaoqi.中介者模式;

/**
 * 这个是部门的接口
 * @createTime 2018年3月3日 下午11:10:04
 * @author MrWang
 */
public interface Department {
	
	String FINANCIAL = "finalcial";
	String DEVELOPMENT = "development";
	String HR = "hr";
	
	/**
	 * 这是自己内部的行为
	 */
	void selfAction();
	
	/**
	 * 这是和外部进行交互的方法
	 * @param name 这是需要打交道的部门名字
	 */
	void outAction(String name);

}
