import java.util.Scanner;

public class reverse_example2_fun_is_java {       // java is fun ==>i/p
												 // fun is java ==> o/p

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the String :");
		String str=scan.nextLine();
		String[]arr=str.split(" ");
		String []result=new String[arr.length];
		int count=arr.length-1;
		
		for(int i=0;i<=arr.length-1;i++) {
			result[i]=arr[count];
			count--;
		}
		String revstr="";
		for(String i:result) {
			revstr+=i+" ";
		}System.out.println(revstr+" ");
		

	}

}
