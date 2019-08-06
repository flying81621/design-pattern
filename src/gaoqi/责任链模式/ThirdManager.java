package gaoqi.责任链模式;

/**
 * 
 * @createTime 2018年3月3日 下午8:03:23
 * @author MrWang
 */
public class ThirdManager extends Manager {

	/**
	 * @param name
	 */
	public ThirdManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Response handle(Request request) {
		// TODO Auto-generated method stub
		System.out.println("总监处理");
		return new Response("总监处理了");
	}

	@Override
	public Level getLevel() {
		// TODO Auto-generated method stub
		return new Level(Level.ThirdLevel);
	}

}
