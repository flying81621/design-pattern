package com.迭代器模式之项目示例;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 项目信息 
 * @createTime 2018年1月29日 下午11:06:10
 * @author MrWang
 */
public class Project implements IProject,Iterable<Project> {
	//定义一个项目列表，所有的项目都放在这里
	private List<Project> projects = new ArrayList<>();
	//项目名称
	private String name;
	//项目成员数量
	private int num;
	//项目费用
	private int cost;
	
	public Project() {}

	public Project(String name, int num, int cost) {
		super();
		this.name = name;
		this.num = num;
		this.cost = cost;
	}

	@Override
	public void add(String name, int num, int cost) {
		projects.add(new Project(name, num, cost));
	}

	@Override
	public String getProjectInfo(String name) {
		for (Project project : projects) {
			if(name.equals(project.getName())){
				StringBuilder sb = new StringBuilder();
				sb.append("项目名称：").append(project.getName())
				.append("\t项目人数：").append(project.getName())
				.append("\t向公募费用").append(project.getCost());
				return sb.toString();
			}
		}
		return "未查到项目信息";
	}
	
	@Override
	public String getProjectInfo() throws UnsupportedOperationException{
		StringBuilder sb = new StringBuilder();
		sb.append("项目名称：").append(this.getName())
		.append("\t\t项目人数：").append(this.getName())
		.append("\t\t向公募费用").append(this.getCost());    
		return sb.toString();
	}

	@Override
	public Iterator<Project> iterator() {
		return new IProjectIterator(projects);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	
}
