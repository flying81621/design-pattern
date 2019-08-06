package com.迭代器模式之项目示例;

import java.util.Iterator;

/**
 * 场景类
 * @createTime 2018年1月29日 下午11:26:00
 * @author MrWang
 */
public class Client {
	public static void main(String[] args) {
		IProject project = new Project();
		project.add("前任3", 5, 100000);
		project.add("猩球崛起", 8, 20000);
		project.add("夏洛特烦恼", 10, 30000);
		
		//遍历取出所有的元素进行展示
		Iterator<Project> iterator = project.iterator();
		while(iterator.hasNext()) {
			Project next = iterator.next();
			System.out.println(next.getProjectInfo());
		}
		
	}
}
