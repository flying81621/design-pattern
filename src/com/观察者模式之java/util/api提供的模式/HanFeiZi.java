package com.观察者模式之java.util.api提供的模式;

import java.util.Observable;

import com.观察者模式之项目示例.IHanFeiZi;

/**
 * 采用javaAPI提供好的被观察者
 * 
 * @createTime 2018年2月7日 上午1:01:17
 * @author MrWang
 */
public class HanFeiZi extends Observable implements IHanFeiZi {

	@Override
	public void haveBreakFirst() {
		// 韩非子要吃饭了
		System.out.println("韩非子要吃饭了");

		super.setChanged();
		super.notifyObservers("通知：韩非子在吃饭");
	}

	@Override
	public void haveFun() {
		// 韩非子要吃饭了
		System.out.println("韩非子要娱乐了");

		super.setChanged();
		super.notifyObservers("通知：韩非子在娱乐");
	}

}
