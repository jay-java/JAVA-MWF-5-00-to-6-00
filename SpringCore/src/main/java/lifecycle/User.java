package lifecycle;

public class User {
	private int id;
	private String name;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	public void startBean() {
		System.out.println("bean started by xml");
	}
	
	public void stopBean() {
		System.out.println("bean destroyed  by xml");
	}

}
