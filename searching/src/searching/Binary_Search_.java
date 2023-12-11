package searching;
import java.util.*;
public class Binary_Search_
{
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the length of arr");
	int []arr=new int[scan.nextInt()];
	System.out.println("enter the number of arrays");
	for(int i=0;i<=arr.length-1;i++){
	    arr[i]=scan.nextInt();
	}

	
	int low=0;
	int high=arr.length-1;
	
	System.out.println("enter the key we need to find");
	int key=scan.nextInt();
	sort(arr);
	binarySearch(arr,low,high,key);

	
	}
		public static int[] sort(int []arr){
	    Arrays.sort(arr);
	    return arr;
	}
	public static void binarySearch(int arr[],int low,int high,int key){
	    
	    while(low<=high){
	        int mid=(low+high)/2;
	        if(key==arr[mid]){
	            System.out.println("key found  "+arr[mid]);
	            break;
	        }
	        else if(key>=arr[mid]){
	           low=mid+1;
	           high=0;
	           System.out.println("key found  "+arr[mid]);
	        }
	        else {
	            high=mid-1;
	            System.out.println("key found  "+arr[mid]);
	            
	        }
	    }
	    
	}
}
