import java.util.Scanner;

public class CheckSortApp {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the len of the array");
		int []arr=new int[scan.nextInt()];
		System.out.println("enter the elements to be enterred");
		
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		
		for(int z:arr) {
			System.out.println(z);
		}
		// here we are not using static word so we are using new keyword like created one more method
		
	    CheckSort ss=new CheckSort();
	    boolean status=ss.CheckApp(arr);
	    if(status==true) {
	    	System.out.println("Array  is sorted");
	    }
	    else {
	    	System.out.println(" Array is not sorted");
	    }
		

	}

	

}
