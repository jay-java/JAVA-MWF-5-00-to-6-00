package lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class User2 {
	private int id;
	private String name;

	public User2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User2(int id, String name) {
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
		return "User2 [id=" + id + ", name=" + name + "]";
	}
	
	@PostConstruct
	public void startBeanByAnnotation() {
		System.out.println("bean started by annotation");
	}
	
	@PreDestroy
	public void stopBeanByAnnotation() {
		System.out.println("bean destroyed by annotation");
	}

}
