package mphasis;

public class Prog5 {
	public static void main(String[] args) {
		System.out.println("Prime no bw 1 to 50 :");
		for(int i=1;i<50;i++) {
			int count =0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.print(i+"  ");
			}
		}
	}
}
