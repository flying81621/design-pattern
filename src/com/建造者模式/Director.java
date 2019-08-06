/**
 * 
 */
package com.建造者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 导演类
 * 
 * @createTime 2018年1月29日 下午3:25:23
 * @author MrWang
 */
public class Director {
	/**
	 * 导演顺序
	 */
	private List<String> sequence = new ArrayList<>();
	private BenzBuilder benzBuilder = new BenzBuilder();
	private BMWBuilder bmwBuilder = new BMWBuilder();

	/**
	 * A类型的奔驰车模型，先start，然后stop，其他的没有
	 * 
	 * @return
	 */
	public BenzModel getABenzModel() {
		// 清理原来的顺序
		this.sequence.clear();
		this.sequence.add("start");
		this.sequence.add("stop");

		this.benzBuilder.setSequence(sequence);
		return (BenzModel) benzBuilder.getCarModel();
	}

	/**
	 * B类型的奔驰车模型，先发动引擎，然后停止，其他的没有
	 * 
	 * @return
	 */
	public BenzModel getBBenzModel() {
		// 清理原来的顺序
		this.sequence.clear();
		this.sequence.add("engine boom");
		this.sequence.add("stop");

		this.benzBuilder.setSequence(sequence);
		return (BenzModel) benzBuilder.getCarModel();
	}

	/**
	 * A类型的宝马车模型，先发动引擎，然后启动，然后停止，其他的没有
	 * 
	 * @return
	 */
	public BMWModel getABMWModel() {
		// 清理原来的顺序
		this.sequence.clear();
		this.sequence.add("engine boom");
		this.sequence.add("start");
		this.sequence.add("stop");
		
		this.bmwBuilder.setSequence(sequence);
		return (BMWModel) this.bmwBuilder.getCarModel();
	}
	
	/**
	 * B类型的宝马车模型，就一个跑的功能，run
	 * 
	 * @return
	 */
	public BMWModel getBMWModel() {
		// 清理原来的顺序
		this.sequence.clear();
		this.sequence.add("run");
		
		this.bmwBuilder.setSequence(sequence);
		return (BMWModel) this.bmwBuilder.getCarModel();
	}
}
