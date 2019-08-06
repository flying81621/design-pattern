package gaoqi.策略模式;

/**
 * 老用户大批量，打八折
 * @createTime 2018年3月4日 上午12:21:26
 * @author MrWang
 */
public class OldCustomerManyStrategy implements Strategy {

	@Override
	public double getPrice(double standardPrice) {
		// TODO Auto-generated method stub
		System.out.println("老用户大批量，打八折");
		return 0.8 * standardPrice;
	}

}
