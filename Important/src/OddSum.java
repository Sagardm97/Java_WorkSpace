import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int sum=1;
		for(int i=1;i<=num;i++) {
			if(i%2!=0) {
				sum=sum*i;
			}
			
		}
		System.out.println("so the product of odd Sum is:"+sum);

	}

}
