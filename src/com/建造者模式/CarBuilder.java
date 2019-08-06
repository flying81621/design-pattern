/**
 * 
 */
package com.建造者模式;

import java.util.List;

/**
 * 抽象汽车组装者
 * @createTime 2018年1月29日 下午3:17:31
 * @author MrWang
 */
public abstract class CarBuilder {
	/**
	 * 建造一个模型，你要给我一个顺序要求，就是组装顺序
	 * @param sequence
	 */
	abstract void setSequence(List<String> sequence);
	
	/**
	 * 设置完毕顺序后，就可以直接拿到这个车辆模型
	 * @return
	 */
	abstract CarModel getCarModel();

}
