package mphasis;

import java.util.Scanner;

public class Student {
	int rollno;
	String name,address;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll, name, address:");
		rollno= sc.nextInt();
		name= sc.next();
		address=sc.next();
	}
	void display() {
		System.out.println("rollno :"+rollno+"Name is: "+name+"Address :"+address);
	}
}
