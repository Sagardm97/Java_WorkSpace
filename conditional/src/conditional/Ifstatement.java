package conditional;

import java.util.Scanner;
public class Ifstatement
{
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("enter the number");
		int marks=scan.nextInt();
		if(marks>=90){
		    System.out.println("welcome to kodnest tech club");
		}
		else if(marks>=70 && marks<90)
	    {
	    System.out.println("xxxxxxxxxxxxxxxx");
	    }
		else{
		    System.out.println("welcome to pg");
		}
	}
}
