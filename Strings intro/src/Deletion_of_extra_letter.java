import java.util.Scanner;

public class Deletion_of_extra_letter {
	public static void main (String[]args)
	  {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("enter the String: ");
	    String str=scan.nextLine();
	    char[]arr=str.toCharArray();
	    String newStr="";
	    for(int i=0;i<=arr.length-1;i++){
	        if(!(newStr.contains(str.substring(i,i+1)))){
	            newStr+=arr[i];
	        }
	    }
	    System.out.println("soo the final ans is:  "+newStr);

	  }
}
