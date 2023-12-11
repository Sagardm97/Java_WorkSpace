import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the purchase amount:");
		int a=scan.nextInt();
		System.out.println("enter the tax rate:");
		float b=scan.nextFloat();
		System.out.println("total cost including tax:"+(a*b+a));
		
		
	}

}
