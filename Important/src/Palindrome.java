import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int rem,rev=0;
		int temp=n;
		
		while(n!=0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(temp==rev) {
			System.out.println("the given number is palindrom"+rev);
		}
		else {
			System.out.println("the given number is not a palindrom"+rev);
		}

	}

}
