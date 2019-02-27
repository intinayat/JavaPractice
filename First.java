package mphasis;

import java.util.Scanner;

public class First {
	public static void main(String[] args) {
		
	
		Scanner ob  = new Scanner(System.in);
		System.out.println("enter  two nmbr: ");
		int a = ob.nextInt();
		int b = ob.nextInt();
		if (a>b)
			System.out.println("Greast is: "+a);
		else 
			System.out.println("Gratest is: "+b);
	}		
}
