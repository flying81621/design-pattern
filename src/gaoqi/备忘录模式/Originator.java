package gaoqi.备忘录模式;

/**
 * 这个是源发器
 * @createTime 2018年3月4日 下午9:24:37
 * @author MrWang
 */
public class Originator {
	@Override
	public String toString() {
		return "Originator [name=" + name + ", age=" + age + ", price=" + price + "]";
	}

	public Originator(String name, int age, double price) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
	}

	private String name;
	private int age;
	private double price;
	
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
	
	/**
	 * 创建一个备忘录
	 * @return
	 */
	public Memento createMemento(){
		return new Memento(name, age, price);
	}
	
	/**
	 * 恢复一个备忘录
	 * @param memento
	 */
	public void restoreMemento(Memento memento){
		setAge(memento.getAge());
		setName(memento.getName());
		setPrice(memento.getPrice());
	}
}
