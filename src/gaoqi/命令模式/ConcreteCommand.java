package gaoqi.命令模式;

/**
 * 这个是具体的命令
 * @createTime 2018年3月3日 下午11:47:08
 * @author MrWang
 */
public class ConcreteCommand implements Command {
	//每个命令都有个命令的目标对象，表示对这个对象发布命令，没这个对象了还要这个命令干什么
	private Receiver receiver;
	
	public ConcreteCommand(Receiver receiver){
		this.receiver = receiver;
	}

	@Override
	public void excute() {
		// TODO 在这里进行调用接受者进行方法的执行
		receiver.action();
	}

}
