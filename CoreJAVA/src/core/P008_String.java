package core;

import java.util.Scanner;

public class P008_String {
	public static void main(String[] args) {
		char name[] = { 'J', 'A', 'V', 'A' };
		System.out.println(name);
		String n1 = "java3465*U^&%%*   sgrfg";
		System.out.println(n1);
		System.out.println(n1.length());
		String name1 = "java";
		String name2 = "tech";
		System.out.println(name1.concat(name2));
		System.out.println(name1);
		// StringBuffer,StringBuilder
		String s = "java tech is best to learn";
		System.out.println(s.charAt(2));
		System.out.println(s.contains("is b"));
		System.out.println(s.startsWith("jav"));
		String s1 = "java";
		String s2 = "jAva";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.toUpperCase());
		
//		System.out.println("enter name : ");
		Scanner sc= new Scanner(System.in);
//		String nn = sc.next();
		
		System.out.println("enter character : ");
		char c = sc.next().charAt(0);
		System.out.println(c);
		
		StringBuffer ss = new StringBuffer("java");
		System.out.println(ss);
		ss.append(" tech is best");
		System.out.println(ss);
	}
}