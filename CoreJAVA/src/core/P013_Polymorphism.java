package core;

class Overload {
	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}
}

class Overriding {
	public void show() {
		System.out.println("show in overriding in parent");
	}
}

class Override extends Overriding {
	public void show() {

		System.out.println("show in override");
		super.show();
	}

	public void call() {
		System.out.println("call in child");
	}
}

public class P013_Polymorphism {
	public static void main(String[] args) {
		Overload o = new Overload();
		int res = o.add(1, 20);
		System.out.println(res);

		int res2 = o.add(12, 13, 14);
		System.out.println(res2);

		Override o1 = new Override();
		o1.show();
		o1.call();
	}
}
