import java.util.Scanner;
public class Ex2{

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the starting number: ");
		int start=scan.nextInt();
		System.out.println("enter the ending number: ");
		int end=scan.nextInt();
		for(int i=start;i<=end;i++)
		{
			if(i%2==0)
			{
				System.out.println("these number are even"+i);
				
			}
			else {
				System.out.println("these numbers are odd numbers"+i);
				
			}
			
		}
		
	}

}
