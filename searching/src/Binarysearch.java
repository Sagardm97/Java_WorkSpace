
import java.util.Scanner;

public class Binarysearch {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the len of the array");
		int[]arr=new int[scan.nextInt()];
		System.out.println("enter the array");
		for(int i=0;i<=arr.length-1;i++) 
		{
			arr[i]=scan.nextInt();
			
		}
		
		int key=scan.nextInt();
		int low=0;
		int high=arr.length-1;
		int mid=(low+high)/2;
		
		while(low<=high) {
		if(key==arr[mid]) 
		{
			System.out.println("founddd");
			return;
		}
		else if(key>arr[mid]) {
			low=mid+1;
			high=high;
		}
		else {
			low=low;
			high=mid-1;
		}
		}
		for(int x:arr) {
		System.out.println(x);
		
		}
	}

}