package io;
import java.util.*;
public class Person {
	public static void main(String[] args) {
		Scanner scan;
		scan=new Scanner(System.in);
		System.out.println("Enter First name:");
		String name=scan.next();
		System.out.println("Enter Last name:");
		String name1=scan.next();
		System.out.println("Enter age:");
		int age=scan.nextInt();
		System.out.println("Enter gender:");
		String gen=scan.next();
		System.out.println("First Name:"+name+"\nLast name:"+name1+"\nAge:"+age+"\nGender:"+gen);
		//String name=scan.next();
		
		
	}

}
