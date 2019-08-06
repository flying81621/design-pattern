package gaoqi.中介者模式;

/**
 * 中介者模式通过一个中介者进行不同类之间的交互，适用于不同的类很多的时候，在很少的时候，这个模式其实并不适合
 * @createTime 2018年3月3日 下午11:27:07
 * @author MrWang
 */
public class Client {
	public static void main(String[] args) {
		Mediator mediator = new President("张三");
		
		Department development = new Development(Department.DEVELOPMENT, mediator);
		Department financial = new Financial(Department.FINANCIAL, mediator);
		Department hr = new Hr(Department.HR, mediator);
		
		System.out.println("以下是财务部的自己的事务=--------");
		financial.selfAction();
		
		System.out.println("以下是与外部的交互--------");
		financial.outAction(Department.HR);
	}
}
