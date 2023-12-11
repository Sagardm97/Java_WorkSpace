import java.util.Scanner;

public class Captializing_first_letter_without_inbuilt {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string ");
		String str=scan.nextLine();
		char[]arr=str.toCharArray();
		for(int i=0;i<=arr.length-1;i++) {
			if(i==0) {
				if(arr[i]>='a' && arr[i]<='z') {
					arr[i]=(char)(arr[i]-32);
				}
			}
			else if(arr[i]==' ') {
				i++;
				if(arr[i]>='a' && arr[i]<='z') {
					arr[i]=(char)(arr[i]-32);
				}
			}
			
		}
		String newStr=new String(arr);
		System.out.print(newStr);
		
		

	}

}
