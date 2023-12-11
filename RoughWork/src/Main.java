/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    
	    System.out.println("enter the len of array");
	    int []arr=new int[scan.nextInt()];
	    
	    System.out.println("enter the elemenst to be present in the array");
	    for(int i=0;i<=arr.length-1;i++){
	        arr[i]=scan.nextInt();
	    }
	    
	    
	    
	    System.out.println("enter the keyword");
		int keyword=scan.nextInt();
	
		for(int i=0;i<arr.length-1;i++){
		    
		        if(arr[i]+arr[i-1]==keyword){
		        System.out.println(	new int[]{i});
		        }
		       
		    
		}
	}
}
