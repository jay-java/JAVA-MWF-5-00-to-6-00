package core;

//1.in
//2.out
//3.err
public class P001_First {
	public static void main(String[] args) {
		System.out.print("hello java");
		System.out.println("hello again");
		System.err.println("hello again java");
		
		int a = 450;
		if(a>40) {
			a = a*2;
			System.out.println(a);
		}
		else {
			System.out.println("a is less than 40");
		}
		if(a>100) {
			a = a-10;
			System.out.println(a);
		}
		else {
			System.out.println("a is less than 100");
		}
	}
}
