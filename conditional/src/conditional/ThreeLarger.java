package conditional;

import java.util.Scanner;

public class ThreeLarger {
	public static void main(String[]args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int a=scan.nextInt();
		System.out.println("enter the number");
		int b=scan.nextInt();
		System.out.println("enter the number");
		int c=scan.nextInt();
		LargerNumber(a,b,c);
	}
	static void LargerNumber(int a,int b,int c) {
		if(a>b && a>c) {
			System.out.println("a is greater than b,c");
		}
		else if(b>a && b>c){
			System.out.println("b is greater than a,c");
		}
		else {
		System.out.println("c is greater than b,a");
		}
	}
		
	

}