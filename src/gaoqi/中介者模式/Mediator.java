package gaoqi.中介者模式;

/**
 * 这个是中介者，也就是总经理
 * @createTime 2018年3月3日 下午11:11:45
 * @author MrWang
 */
public interface Mediator {
	
	/**
	 * 这是根据部门的名字，来进行发送命令
	 * @param name
	 */
	void command(String name);
	
	/**
	 * 将部门信息注册到总经理这里
	 * @param name
	 * @param department
	 */
	void register(String name, Department department);

}
