package mphasis;

import java.util.Scanner;

public class Marks extends Student
{
	int phy,chem,bio,tot;
	void input()
	{
		super.input();
		Scanner ob=new Scanner(System.in);
		System.out.println("enter phy,chem,bio marks");
		phy=ob.nextInt();chem=ob.nextInt();bio=ob.nextInt();
	}
	void display()
	{
		super.display();
		tot=phy+chem+bio;
		System.out.println("phy "+phy+"chem "+chem+" bio "+bio+"tot"+tot);
	}
	public static void main(String[] args)
	{
	Marks ob=new Marks();
	ob.input();ob.display();
	}
}