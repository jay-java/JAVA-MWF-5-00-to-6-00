package core;
class Employee{
	int id;
	String name;
	double salary;
	Employee(){
		System.out.println("default cons");
	}
	Employee(int id,String name,double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
		System.out.println("id : "+id+" name : "+name+ " salary : "+salary);
	}
	Employee(Employee e){
		this.id = e.id;
		this.name= e.name;
		this.salary = e.salary;
	}
	public void show() {
		System.out.println("id : "+id+" name : "+name+ " salary : "+salary);
	}
}
public class P010_Constructor {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.show();
		Employee e2 = new Employee(1, "java", 3454.34);
		e2.show();
		Employee e3 = new Employee(e2);
		e3.show();
	}
}
