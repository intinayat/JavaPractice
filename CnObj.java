package mphasis;

import java.util.Scanner;

public class CnObj {
	
	int empno;
	String name,address;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter empno,name,address");
		empno=sc.nextInt();
		name=sc.next();
		address=sc.next(); 
	}
	void display() {
		System.out.println("the empno" +empno+" NAME is "+name+" ADDRESS is "+address);
	}
	 public static void main(String[] args) {
		CnObj obj = new CnObj();
		obj.input();
		obj.display();
		
	}
}
