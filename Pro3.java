package mphasis;

import java.util.Scanner;

public class Pro3 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter three numbers ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
	if(a>b&&a>c)
		System.out.println(a+" is greator");
	else if  (b>c&&b>a)
	System.out.println(b+" is greator");
	else
		System.out.println(c+" is greator");
	}

}
