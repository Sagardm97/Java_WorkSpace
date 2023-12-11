import java.util.Scanner;

public class Charcterrelated {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char ch=scan.next().charAt(0);
		if(ch>='A'&& ch<='Z') 
		{
		   if(ch=='A' ||ch=='E' ||ch=='I'||ch=='O'||ch=='U') 
		    {
			System.out.println("so the given number is upper case vowel");	
		    }
		
		   else 
		    {
			System.out.println("so the given number is upper case consonant");
		     }
	    }

		else if(ch>='a'&& ch<='b') 
		{
		   if(ch=='a' ||ch=='e' ||ch=='i'||ch=='o'||ch=='u') 
		{
			System.out.println("so the given number is lower case vowel");	
		}
		
		else 
		    {
			System.out.println("so the given number is lower case consonant");
		}
		}
		
		
	else 
	{
		System.out.println("other char");
		
	}
	}

}
