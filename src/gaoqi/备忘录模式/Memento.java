package gaoqi.备忘录模式;

/**
 * 这个是备忘录,备忘录和元数据是一样的
 * @createTime 2018年3月4日 下午9:26:03
 * @author MrWang
 */
public class Memento {
	private String name;
	private int age;
	private double price;
	
	public Memento(String name, int age, double price) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
