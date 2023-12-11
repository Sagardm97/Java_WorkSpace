import java.util.Scanner;

public class Captilalizing_the_first_letter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the String ");
		String str=scan.nextLine();
		String[] arr=str.split(" ");
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i].charAt(0)>='a' && arr[i].charAt(0)<='z') {
				char temp=arr[i].charAt(0);
				char newtemp=(char)(temp-32);
				arr[i]=newtemp+arr[i].substring(1);
			}
	        System.out.print(arr[i]+" ");
		}
		
	}


}
