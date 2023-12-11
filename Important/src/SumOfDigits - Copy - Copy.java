import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum = 0,rem=0;
		while(n!=0) {
			rem=n%10;
			sum=sum+rem;
			
			n=n/10;
		}
		System.out.println("so the sum of digits of number is:"+sum);
	}
}
