import java.util.Scanner;

public class ArmstrongNumbeer {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	
		int n=scan.nextInt();
		int rem=0;
		int count=0;
		
		while(n!=0) {
			n=n/10;
			count++;	
			
		}
		System.out.println(+(Math.pow(n, count)));
		System.out.println();
		

	}

}
