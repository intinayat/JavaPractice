package mphasis;

import java.util.Scanner;

public class Pro2 {
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("enter 5 nmbr: ");
		for (int i = 0; i < 5; i++)
			a[i] = ob.nextInt();
		System.out.println("The five nmbr are: ");
		for (int i = 0; i < 5; i++)
			System.out.println(a[i]);
	}
}
