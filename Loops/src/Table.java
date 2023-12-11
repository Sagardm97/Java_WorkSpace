import java.util.Scanner;
public class Table{

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the starting number: ");
		int start=scan.nextInt();
		int i=1;
		do{
			System.out.println("the table of number is\t"+start+"*"+i+"="+(start*i));
			i++;
		}
		while(i<=10);
		
		
	}
	

}