package gaoqi.命令模式;

/**
 * 这个是命令的通用接口
 * @createTime 2018年3月3日 下午11:45:48
 * @author MrWang
 */
public interface Command {
	/**
	 * 一个简单的命令的调用示例
	 * 实际的项目中，可以根据需求进行返回值和参数的设置
	 */
	void excute();
}
