package singleton;

/**
 * 测试使用枚举进行单例模式调用
 * 枚举类本身就是单例模式
 * 缺点：没有延迟加载
 * @createTime 2018年2月27日 下午9:59:02
 * @author MrWang
 */
public enum SingleTonDemo3Enum {
	Instance;
	
	static class Client{
		public static void main(String[] args) {
			SingleTonDemo3Enum instance1 = SingleTonDemo3Enum.Instance;
			SingleTonDemo3Enum instance2 = SingleTonDemo3Enum.Instance;
			System.out.println(instance1 == instance2); //output:true
		}
	}
}
