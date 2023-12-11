import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the len of the array");
		int []arr=new int[scan.nextInt()];
		System.out.println("enter the elements of the array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("soo this is the array before sorted************************");
		
		for(int z:arr) 
		{
			System.out.print(z+" ");

		}
		
		for(int i=0;i<=arr.length-2;i++)
		{
			int min=arr[i];
			int pos=i;
			
			for(int j=i+1;j<=arr.length-1;j++)
			{
			
			if(arr[j]<min) 
			{
				min=arr[j];
				pos=j;
				
			}
			
		}
			int temp=arr[i];
			arr[i]=min;
			arr[pos]=temp;
			
		}
		System.out.println();
		
		System.out.println("soo this is the sorted array ***********************");
		
	
	for(int x:arr) 
	{
		System.out.print(x+" ");

	}
}
}
