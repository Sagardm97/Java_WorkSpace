import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num1=scan.nextInt();
		System.out.println("enter the number");
		int num2=scan.nextInt();
		int rem=0;
		while(num2!=0)
		{
			rem = num1 % num2;
			
			num1 = num2;
			num2 = rem;
		}
		
		System.out.println(num1);
		
		
		

	}

}
