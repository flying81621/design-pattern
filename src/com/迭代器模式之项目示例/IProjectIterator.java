package com.迭代器模式之项目示例;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 真实的项目迭代器
 * @createTime 2018年1月29日 下午11:15:27
 * @author MrWang
 */
public class IProjectIterator implements Iterator<Project> {
	
	private List<Project> projects;
	//定义当前游标
	private int currentItem = 0;
	
	//使用构造函数将列表传入进来
	public IProjectIterator(List<Project> projects) {
		super();
		this.projects = projects;
	}

	@Override
	public boolean hasNext() {
		boolean b = true;
		if(currentItem >= projects.size() || projects.get(currentItem) == null){
			b = false;
		}
		return b;
	}

	@Override
	public Project next() {
		if(hasNext())
			return projects.get(currentItem++);
		return null;
	}

	/**
	 * 迭代器的移除方法应该完成两个逻辑：
	 * 1.删除当前的元素
	 * 2.使当前的游标指向下一个元素
	 */
	@Override
	public void remove() {
		projects.remove(currentItem--);
	}

}
