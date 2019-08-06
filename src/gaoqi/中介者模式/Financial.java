package gaoqi.中介者模式;

/**
 * 这个是部门下的财务部
 * @createTime 2018年3月3日 下午11:15:44
 * @author MrWang
 */
public class Financial implements Department {
	private Mediator mediator;
	private String name;

	public Financial(String name, Mediator mediator) {
		super();
		this.name = name;
		this.mediator = mediator;
		//在构造方法里面进行注册到中介者中
		mediator.register(name, this);
	}

	@Override
	public void selfAction() {
		// TODO Auto-generated method stub
		System.out.println("财务部汇报，这是我们的financial部的报告");
	}

	@Override
	public void outAction(String name) {
		// TODO Auto-generated method stub
		System.out.println(this.name + "需要" + name + "部的支持");
		mediator.command(name);
	}

}
