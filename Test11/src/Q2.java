import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int a=scan.nextInt();
		System.out.println("enter the second number");
		int b=scan.nextInt();
		System.out.println("enter the operator(+,-,*,/)");
		char d=scan.next().charAt(0);
		int c=calculate(a,b,d);
		System.out.println(" "+c);
		

	}
	
	public static int calculate(int a,int b,char d) {
		switch(d) {
		case '+':System.out.println("add");
		}
		return a+b;
	case '-':System.out.println("add");
	  return a-b;
	}
	
	
	}
	
	
	
	


