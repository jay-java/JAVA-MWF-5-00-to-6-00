package core;

import java.util.Scanner;

public class P005_ConditionalState {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();

		// 1.simple if
		if (a > b) {
			System.out.println("a is greater than b");
		}

		// 2. if else
		if (a > b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("b is greater than a");
		}

		// 3.nested if
		System.out.println("enter age = ");
		int age = sc.nextInt();
		if (age > 18) {
			if (age < 55) {

				System.out.println("you are eligible");
			} else {
				System.out.println("age is greater than 18 but not less than 55");
			}
		} else {
			System.out.println("age is less than 18");
		}

		// 4.else if ladder
		System.out.println("enter marks = ");
		int m = sc.nextInt();
		if (m < 33) {
			System.out.println("fail");
		} else if (m >= 33 && m <= 50) {
			System.out.println("Pass class");
		} else if (m >= 51 && m <= 70) {
			System.out.println("C class");
		}

		else if (m >= 71 && m <= 80) {
			System.out.println("B class");
		}

		else if (m >= 81 && m <= 90) {
			System.out.println("A class");
		}

		else if (m >= 91 && m <= 100) {
			System.out.println("A+ class");
		} else {
			System.out.println("invalid input");
		}

		// 5.switch case
		System.out.println("Enter your choice : 1.English\n2.hindi\n3.Gujarati");
		int c = sc.nextInt();
		switch (c) {
		case 1:
			System.out.println("you selected english");
			break;
		case 2:
			System.out.println("hindi");
			break;
		case 3:
			System.out.println("gujarati");
			break;
		default:
			System.out.println("invalid");
		}

	}
}