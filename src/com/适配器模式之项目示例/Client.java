package com.适配器模式之项目示例;

/**
 * 场景类进行测试
 * @createTime 2018年1月29日 下午10:22:52
 * @author MrWang
 */
public class Client {
	public static void main(String[] args) {
		//对接外部的员工信息,看看是不是这样就直接实现了对接，只需要改一个后面的多态就可以在我们的员工和外来的员工之间进行切换
		IUserInfo userInfo = new OuterUserInfoAdapter();
		//假设从数据库查到了5个数据
		for(int i = 0; i < 5; i++){
			System.out.println("外来的员工的电话是："+userInfo.getMobileNumber());
		}
		
	}
}
