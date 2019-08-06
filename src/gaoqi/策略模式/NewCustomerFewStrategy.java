package gaoqi.策略模式;

/**
 * 新用户小批量,不打折
 * @createTime 2018年3月4日 上午12:17:15
 * @author MrWang
 */
public class NewCustomerFewStrategy implements Strategy {

	@Override
	public double getPrice(double standardPrice) {
		// TODO Auto-generated method stub
		System.out.println("新用户小批量,不打折");
		return standardPrice;
	}


}
