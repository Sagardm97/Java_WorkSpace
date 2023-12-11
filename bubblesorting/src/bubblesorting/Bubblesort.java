package bubblesorting;
                                                 //ascending order
import java.util.Scanner;

public class Bubblesort {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of the array ");
		int[]arr=new int[scan.nextInt()];
		System.out.println("enter the Length of the arrays");
		
		for(int i=0;i<=arr.length-1;i++) 
		{
			arr[i]=scan.nextInt();
		}
		
		System.out.println("soo this the array before sorted");
		for(int z:arr)
		{
			System.out.print(z+" ");
			}
				
		for(int i=0;i<=arr.length-2;i++) 
		{
			for(int j=0;j<=arr.length-i-2;j++) 
			{
				if(arr[j]>arr[j+1]) 
				{
					int temp=arr[j];
					arr[j]=arr[j+1];   
					arr[j+1]=temp;
				}
				
				
			}
			
		}
		System.out.println();
		System.out.println("soo this the bubble sorted(after sorted)array");
		for(int x:arr)
		   {
			System.out.print(x+" ");
			}
		}
}
