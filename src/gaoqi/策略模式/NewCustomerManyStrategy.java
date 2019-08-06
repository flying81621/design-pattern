package gaoqi.策略模式;

/**
 * 新用户大批量，打9折
 * @createTime 2018年3月4日 上午12:18:23
 * @author MrWang
 */
public class NewCustomerManyStrategy implements Strategy {

	@Override
	public double getPrice(double standardPrice) {
		// TODO Auto-generated method stub
		System.out.println("新用户大批量，打9折");
		return 0.9 * standardPrice;
	}

}
