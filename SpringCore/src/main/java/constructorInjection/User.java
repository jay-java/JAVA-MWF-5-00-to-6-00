package constructorInjection;

public class User {
	private int id;
	private String name;
	private long contact;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, long contact) {
		super();
		System.out.println("data set by cons");
		this.id = id;
		this.name = name;
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", contact=" + contact + "]";
	}

}
