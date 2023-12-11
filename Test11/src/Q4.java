import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//taking the user first i/p 
		System.out.println("enter the first number");
		int c=scan.nextInt();
		//taking the user second i/p 
		System.out.println("enter the second number");
		int f=scan.nextInt();
		//taking the user operation  i/p[ + , - , * , / , % ] 
		System.out.println("celsius to fahrenheit :"+(((c*9/5)+32)));
		System.out.println("fahrenheit to celsius :"+(((f-32)*5/9)));
		int h=gg(c,f);
		System.out.println(h);
		int i=gg1(c,f);
		System.out.println(i);

	}
	public static int gg(int c,int f) {
		return (c*9/5)+32;
		
	}public static int gg1(int c,int f) {
		return (f-32)*5/9;

}
}
