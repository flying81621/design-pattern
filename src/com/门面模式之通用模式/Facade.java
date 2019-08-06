package com.门面模式之通用模式;

/**
 * 门面
 * @createTime 2018年2月6日 下午11:55:51
 * @author MrWang
 */
public class Facade {
	//被委托的对象
	private ClassA classA = new ClassA();
	private ClassB classB = new ClassB();
	private ClassC classC = new ClassC();
	
	//这时候新增一个复杂的功能，进行一个业务类的组装
	private Context context = new Context();
	
	public void doSomethingA(){
		classA.doSomethingA();
	}
	
	public void doSomethingB(){
		classB.doSomethingB();
	}
	
	public void doSomethingC(){
		classC.doSomethingC();
	}
	
	public void complexMethod(){
		context.complexMethod();
	}
	
}
