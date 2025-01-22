package autowire;

public class Address {
	private int aid;
	private String data;
	public Address(int aid, String data) {
		super();
		this.aid = aid;
		this.data = data;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", data=" + data + "]";
	}
	
}
