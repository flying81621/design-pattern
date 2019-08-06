package gaoqi.责任链模式;

/**
 * 这个请假的基本信息
 * @createTime 2018年3月3日 下午7:46:38
 * @author MrWang
 */
public class RequestInfo {
	
	private String name;
	private int days;
	private String reason;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public RequestInfo(String name, int days, String reason) {
		super();
		this.name = name;
		this.days = days;
		this.reason = reason;
	}
	
}
