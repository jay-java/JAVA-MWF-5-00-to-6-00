package core;

import java.util.Scanner;

class ABC {
	public void show() {
		System.out.println("show in ABC class");
	}
}

public class P004_UserInput {
	public static void main(String[] args) {
		System.out.println("main mehtod");
		ABC a = new ABC();
		a.show();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter i = ");
		int i = sc.nextInt();
		System.out.println(i);
		System.out.println("enter j = ");
		int j = sc.nextInt();
		int k = i +j;
		System.out.println("addition of i and j = "+k);
	}
}
