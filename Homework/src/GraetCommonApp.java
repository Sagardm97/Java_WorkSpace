import java.util.Scanner;

public class GraetCommonApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
	    int res=GreatestCommmonDivisor.checkGcd(num1, num2);
	    System.out.println(res);
		
		
		
		

	}

}
