import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
int temp = 0;

Scanner scan=new Scanner(System.in);
System.out.println("enter the number:");
int num=scan.nextInt();


int b=temp;
num=temp;
temp=b;
b=temp;

	
	if(temp==num) {
		
		System.out.println((temp));
	}
}

	}


