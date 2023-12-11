package searching;

import java.util.Scanner;

public class SwappingArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the len of the array");
		int[]arr=new int[scan.nextInt()];
		System.out.println("enter the number inside the len");
		for(int i=0;i<=arr.length-1;i++) 
		{
			arr[i]=scan.nextInt();
			
		}
		for(int x:arr) {
			System.out.print(x);
		}
		
		System.out.print("enter the index numbers");
		int x=scan.nextInt();
		int y=scan.nextInt();
		if( x>=0 && x<=arr.length-1  && y>=0 && y<=arr.length-1) {
			int temp=arr[x];
			arr[x]=arr[y];
			arr[y]=temp;
			for(int z:arr) {
				System.out.print(z+" ");
			}
			
			
		}
		
	}

}
