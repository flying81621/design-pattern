package gaoqi.策略模式;

/**
 * 这是策略的通用接口，现在根据不同的用户，打不同的价格折扣
 * 新用户大批量：9折
 * 新用户小批量：不打折
 * 老用户大批量：8折
 * 老用户小批量：8.5折
 * @createTime 2018年3月4日 上午12:14:33
 * @author MrWang
 */
public interface Strategy {
	double getPrice(double standardPrice);
}
