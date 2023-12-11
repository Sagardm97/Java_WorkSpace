package conditional;

import java.util.Scanner;

public class Larger {
	public static void main(String[]args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int a=scan.nextInt();
		System.out.println("enter the number");
		int b=scan.nextInt();
		LargerNumber(a,b);
	}
	static void LargerNumber(int a,int b) {
		if(a>b) {
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("b is greater than a");
		}
	}
	

}
