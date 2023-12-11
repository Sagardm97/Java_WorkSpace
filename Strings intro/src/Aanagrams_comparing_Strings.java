import java.util.Scanner;

public class Aanagrams_comparing_Strings {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s1=scan.nextLine();
		char[] arr1=s1.toCharArray();
		
		
		String s2=scan.nextLine();
		char [] arr2=s2.toCharArray();
		if(s1.equals(s2)) {
			System.out.println("soo both are anagrams");
		}
		else {
			System.out.println("soo this sentence is not anagrams");
		}
		

	}

}
