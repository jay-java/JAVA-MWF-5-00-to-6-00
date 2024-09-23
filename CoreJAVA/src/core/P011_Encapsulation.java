package core;

class Student {
	private int id;
	private String name;
	private String address;

	Student() {

	}

	Student(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	public String toString() {
		return "id : "+id+" name : "+name+" address : "+address;
	}
}

public class P011_Encapsulation {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("java");
		s1.setAddress("ahmedabad");
//		System.out.println(s1.getId());
//		System.out.println(s1.getName());
//		System.out.println(s1.getAddress());
		System.out.println(s1);
		Student s2 = new Student(2, "python", "delhi");
		System.out.println(s2);
	}
}
