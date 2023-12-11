package conditional;
import java.util.Scanner;

public  class Program {
	void display()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks");
		int marks=sc.nextInt();
		if(marks>=90) {
			System.out.println("welcome to kodnest tech club");
		}
			
	}

}
