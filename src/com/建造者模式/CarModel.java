/**
 * 
 */
package com.建造者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 车辆模型的抽象类
 * @createTime 2018年1月29日 下午3:02:27
 * @author MrWang
 */
public abstract class CarModel {
	//这个参数是各个基本方法的执行顺序
	private List<String> sequence = new ArrayList<>();
	
	/**
	 * 汽车启动
	 */
	protected abstract void start();
	
	/**
	 * 汽车停止
	 */
	protected abstract void stop();
	
	/**
	 * 汽车鸣笛
	 */
	protected abstract void alarm();
	
	/**
	 * 汽车引擎轰隆隆的响
	 */
	protected abstract void engineBoom();
	
	/**
	 * 模型的运行方法
	 */
	public final void run(){
		for (String actionName : sequence) {
			switch(actionName) {
			case "start":
				this.start();
				break;
			case "stop":
				this.stop();
				break;
			case "alarm":
				this.alarm();
				break;
			case "engine boom":
				this.engineBoom();
				break;
				default:
					System.out.println("汽车的运行方法不存在");
			}
		}
	}

	public final void setSequence(List<String> sequence) {
		this.sequence = sequence;
	}
}
