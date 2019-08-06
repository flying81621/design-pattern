/**
 * 
 */
package com.建造者模式;

import java.util.List;

/**
 * 宝马车建造者
 * @createTime 2018年1月29日 下午3:21:18
 * @author MrWang
 */
public class BMWBuilder extends CarBuilder {
	private BMWModel bmwModel = new BMWModel();
	
	@Override
	void setSequence(List<String> sequence) {
		this.bmwModel.setSequence(sequence);
	}

	@Override
	CarModel getCarModel() {
		// TODO Auto-generated method stub
		return this.bmwModel;
	}

}
