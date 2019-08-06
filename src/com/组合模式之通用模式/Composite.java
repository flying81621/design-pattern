package com.组合模式之通用模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝构件
 * @createTime 2018年2月7日 下午10:31:49
 * @author MrWang
 */
public class Composite extends Component {
	//构建容器
	private List<Component> components = new ArrayList<>();
	
	//增加一个叶子构件或者树枝构件
	public void add(Component component){
		this.components.add(component);
	}
	
	//删除一个叶子构件或者树枝构件
	public void remove(Component component){
		this.components.remove(component);
	}
	
	//获得所有的叶子构件或者树枝构件
	public List<Component> getChildren(){
		return this.components;
	}
}
