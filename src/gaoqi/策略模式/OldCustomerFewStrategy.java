package gaoqi.策略模式;

/**
 * 老用户小批量，打0.85折
 * @createTime 2018年3月4日 上午12:22:36
 * @author MrWang
 */
public class OldCustomerFewStrategy implements Strategy {

	@Override
	public double getPrice(double standardPrice) {
		// TODO Auto-generated method stub
		System.out.println("老用户小批量，打0.85折");
		return 0.85 * standardPrice;
	}

}
