package gaoqi.中介者模式;

/**
 * 这个是部门下的开发部
 * @createTime 2018年3月3日 下午11:15:44
 * @author MrWang
 */
public class Development implements Department {
	private Mediator mediator;
	private String name; 
	public Development(String name, Mediator mediator) {
		super();
		this.name = name;
		this.mediator = mediator;
		//在构造方法里面把本对象注册到中介者中
		mediator.register(name, this);
	}

	@Override
	public void selfAction() {
		// TODO Auto-generated method stub
		System.out.println("开发部汇报，这是我们的开发部的报告");
	}

	@Override
	public void outAction(String name) {
		// TODO Auto-generated method stub
		System.out.println(this.name + "需要" + name + "部的支持");
		//使用中介者进行访问外部需求
		mediator.command(name);
	}

}
