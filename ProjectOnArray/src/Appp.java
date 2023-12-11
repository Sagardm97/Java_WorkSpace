import java.util.Scanner;


public class Appp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the len of the array");
		
		int []arr=new int[scan.nextInt()];
		
		System.out.println("enter the elements to be stored");
		 
		for(int i=0;i<=arr.length-1;i++) 
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("please enter the number :");
		char ch=scan.next().charAt(0);
			
		
		switch(ch)
		
		{
		case '1':
			boolean status=MyApp.sorted(arr);
			if(status==true) {
				System.out.println("sorted");
			}
			else {
				System.out.println("not sorted");
			}
		}
		
			
		switch(ch) {
		
		case '2':
			System.out.println("enter the key element to be search:");
									 // Function call
	        
			int x = scan.nextInt();
			 
	        int index = MyApp.linearsearch(arr, arr.length-1, x);
	        if (index == -1)
	            System.out.println("Element is not present in the array");
	        else
	            System.out.println("Element found at position " + index);
			
			}
		
		switch(ch) {
		case '3':System.out.println("enter the key element to be search:");
			int x = scan.nextInt();
			
			int res = MyApp.binarySearch(arr,arr.length);
			
			System.out.println();
			System.out.println("Sorted array: ");
			if(res == -1)
			{
				System.out.println("Element not found");
			}
			else {
				System.out.println("Element found at index " + res);
			}
		}

	}

}
