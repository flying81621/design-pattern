package gaoqi.策略模式;

/**
 * 这个是上下文环境，用于执行设置策略的
 * @createTime 2018年3月4日 上午12:23:41
 * @author MrWang
 */
public class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public void exe(double standardPrice){
		double price = strategy.getPrice(standardPrice);
		System.out.println("报价：" + price);
	}
}
