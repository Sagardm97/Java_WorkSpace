import java.util.Scanner;

public class Difficult_reversing_ex1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		char[]arr=str.toCharArray();
		String arr2="";
		
		int count=0;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]!=' ') {
				arr2+=arr[i];
				count++;
			}	
		}
		System.out.println(arr2);
		
	}

}
