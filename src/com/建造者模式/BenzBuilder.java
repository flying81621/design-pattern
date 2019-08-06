/**
 * 
 */
package com.建造者模式;

import java.util.List;

/**
 * 奔驰车建造者
 * @createTime 2018年1月29日 下午3:21:18
 * @author MrWang
 */
public class BenzBuilder extends CarBuilder {
	private BenzModel benzModel = new BenzModel();
	
	@Override
	void setSequence(List<String> sequence) {
		this.benzModel.setSequence(sequence);
	}

	@Override
	CarModel getCarModel() {
		// TODO Auto-generated method stub
		return this.benzModel;
	}

}
