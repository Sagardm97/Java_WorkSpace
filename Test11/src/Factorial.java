import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact=1;
		int sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		for(int i=1;i<=num;i++) {
			fact=fact*i;
			sum=sum+fact;   //extra term;
			
			
		}
		System.out.println("sooo this is the factorial of the number :"+fact);
		System.out.println("sooo this is the factorial of the number :"+sum);

		

	}

}
