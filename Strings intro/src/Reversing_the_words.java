import java.util.Scanner;

public class Reversing_the_words {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number: ");
		String str=scan.nextLine();
		
		String []arr=str.split(" ");
		String []result= new String[arr.length];
		int count =arr.length-1;
		for(int i=0;i<=arr.length-1;i++) {
			result[i]=arr[count];
			count--;
		}
		//reversing the String & assign to new revstr
		
		String revstr="";
		for(String i : result) {
			revstr+=i+" ";
			
		}System.out.println(revstr);
	}

}
