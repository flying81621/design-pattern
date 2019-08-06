package gaoqi.命令模式;

/**
 * 这个是命令的调用者，表示由这个对象来发布这个命令
 * @createTime 2018年3月3日 下午11:49:16
 * @author MrWang
 */
public class Invoker {
	//这里可以根据需求，设计成一个容器，对命令进行批量的调用
	private Command command;

	public Invoker(Command command) {
		super();
		this.command = command;
	}
	
	public void call(){
		command.excute();
	}
	

}
