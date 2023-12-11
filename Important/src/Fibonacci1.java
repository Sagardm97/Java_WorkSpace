import java.util.Scanner;

public class Fibonacci1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int firstnum=0;
		int secondnum=1;
		System.out.print(firstnum); // Print the initial 0
        System.out.print(secondnum); // Print the initial 1
		
		
		for(int i=0;i<=n-2;i++) {
			
			int z=firstnum+secondnum;
			firstnum=secondnum;
			secondnum=z;
			System.out.print(z+" ");	
		}
	
		

	}

}
