package core;

class Data {
	static {
		System.out.println("static block in data class");
	}
	int id;
	String name;
	static String col = "TOPS";

	public void setData() {

	}

	public void getData() {
		System.out.println("id : " + id + " name : " + name + " col : " + col);
	}

	public static void show() {
		System.out.println("static fun in data class : " + col);
	}
}

public class P009_Static {
	static {
		System.out.println("static block in main method");
	}

	public static void main(String[] args) {
		Data d = new Data();
		d.getData();
		Data.show();
	}
}