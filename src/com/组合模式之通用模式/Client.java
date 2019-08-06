package com.组合模式之通用模式;

import java.util.List;

/**
 * 
 * @createTime 2018年2月7日 下午10:37:00
 * @author MrWang
 */
public class Client {
	public static void main(String[] args) {
		//创建一个根节点
		Composite composite = new Composite();
		//创建一个树枝节点
		Composite branch = new Composite();
		//创建一个树叶节点
		Leaf leaf = new Leaf();
		//建立整体的关系
		composite.add(branch);
		branch.add(leaf);
		
		//遍历节点
		display(composite);
	}

	/**
	 * @param composite
	 */
	private static void display(Composite composite) {
		// TODO Auto-generated method stub
		List<Component> children = composite.getChildren();
		for (Component component : children) {
			if(component instanceof Leaf){
				component.doSomething();
			} else{
				display((Composite) component);
			}
		}
	}
}
