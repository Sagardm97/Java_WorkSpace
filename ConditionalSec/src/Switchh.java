

import java.util.Scanner;
public class Switchh

 {
	public static void main(String[]args) 
	{
		Scanner scan=new Scanner(System.in);
		//taking the user first i/p 
		System.out.println("enter the first number");
		int a=scan.nextInt();
		//taking the user second i/p 
		System.out.println("enter the second number");
		int b=scan.nextInt();
		//taking the user operation  i/p[ + , - , * , / , % ] 
		System.out.println("enter the sysmbol");
		char c=scan.next().charAt(0);
		//applying switch case
		switch(c) {
		case '+':System.out.println(a+"+"+b+" \t"+(a+b));//addition
		break;
		case '-':
			if(a>b)
			System.out.println(a+"+"+b+" \t"+(a-b));//substraction(applying conditions)
			else
			System.out.println(a+"+"+b+" \t"+(b-a));	
			break;
		case '*':System.out.println(a+"+"+b+" \t"+(a*b));//multiplication
		break;
		case '/':System.out.println(a+"+"+b+" \t"+(a/b));//division
		break;
		case '%':System.out.println(a+"+"+b+"\t"+(a%b));//reminder
		break;
		}
		
		
		
		
	}
}

