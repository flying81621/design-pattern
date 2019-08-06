package gaoqi.中介者模式;

import java.util.HashMap;
import java.util.Map;

/**
 * 这个是总经理
 * @createTime 2018年3月3日 下午11:14:26
 * @author MrWang
 */
public class President implements Mediator {
	private Map<String, Department> map = new HashMap<>();
	private String name;
	public President(String name){
		this.name = name;
	}

	@Override
	public void command(String name) {
		// TODO Auto-generated method stub
		map.get(name).selfAction();
	}

	@Override
	public void register(String name, Department department) {
		// TODO Auto-generated method stub
		map.put(name, department);
	}

}
