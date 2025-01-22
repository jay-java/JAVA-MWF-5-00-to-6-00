package lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class User1 implements InitializingBean, DisposableBean {
	private int id;
	private String name;

	public User1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User1(int id, String name) {
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
		return "User1 [id=" + id + ", name=" + name + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("bean started by interface");

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("bean destroyed by interface");
	}

}
