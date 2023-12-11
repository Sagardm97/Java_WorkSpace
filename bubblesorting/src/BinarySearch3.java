
import java.util.Scanner;

public class BinarySearch3 {

	//creating a method for the sorting of the array
	public static int [] bubbleSort(int [] arr) 
	{
		for(int i = 0 ; i <= arr.length - 2 ; i ++)
		{
			for(int j = 0 ; j <= (arr.length - i - 2) ; j ++)
			{
				if(arr[j] > arr[j + 1])
				{
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
		
	}
	
	//creating a method for the searching of the key element
	public static int binarySearch(int [] arr, int key)
	{
		//intializing the low and high values
		int low = 0;
		int high = arr.length - 1;
		
		//Iterating through the loop till low <= high
		while(low <= high)
		{
			//finding the mid value with low and high
			int mid = (low + high) / 2;
			//Checking the arr[mid] equal to the key element
			if(arr[mid] == key)
			{
				//If it is equal returning the mid value
				return mid;
			}
			//checkignt
			else if(key < arr[mid])
			{
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		return -1;
	}

}