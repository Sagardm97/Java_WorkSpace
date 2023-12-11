package bubblesorting;

	import java.util.Scanner;

	public class bbb1
	{

		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the number ");
			int[]arr=new int[scan.nextInt()];
			System.out.println("enter the number of arrays");
			for(int i=0;i<=arr.length-1;i++) 
			{
				arr[i]=scan.nextInt();
			}
			bubbleclasslogic.bbhhh(arr);
				
		}
	

}
