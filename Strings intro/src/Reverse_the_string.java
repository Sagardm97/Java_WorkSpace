import java.util.Scanner;

public class Reverse_the_string {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		char []arr1=str.toCharArray();
		char []arr2=new char[arr1.length];
		int count=arr1.length-1;
		
		for(int i=0;i<=arr1.length-1;i++) {
			arr2[i]=arr1[count];
			count--;
		}
		String revstr=new String(arr2);
		System.out.println(revstr);
		

	}

}
