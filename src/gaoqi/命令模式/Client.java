package gaoqi.命令模式;

/**
 * 比如，将军对士兵发送命令，让其执行任务
 * @createTime 2018年3月3日 下午11:50:58
 * @author MrWang
 */
public class Client {
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command command = new ConcreteCommand(receiver);
		//新建为一个命令调用者，调用这个命令
		Invoker invoker = new Invoker(command);
		invoker.call();
		//其实和下面的代码是一样的效果，但是设计模式实现了可维护性和扩展性,而且更符合人类的思考
//		new Receiver().action();
	}
}
