import java.util.Scanner;

public class Word_reverser_separate_words {    //i/p=== i am learning java
											   //o/p=== i ma gninrael avaj 
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string");
		String str=scan.nextLine();
		String[]arr=str.split(" ");
				for(int i=0;i<=arr.length-1;i++) {
			for(int j=arr[i].length();j>=0;j--) {
				System.out.print(arr[i].charAt(j));
			}
			if(i<=arr.length-1) {
				System.out.print(" ");
			}
			
		}
		
		
}
	


}
