package mphasis;

public class Staticexample {
	
	static int a = 5, b = 8;
	static int sum(int a, int b)

	{
		return a + b;
	}
	static {
		System.out.println("Static block");
	}

	public static void main(String[] args) {
		System.out.println("The Sum is: " + sum(6, 7));
		
		System.out.println(a);
	}
}
	

