package searching;

import java.util.Arrays;

public class BinarySearch1 {
	public static int[] sort(int[] arr)
	{
		Arrays.sort(arr);
		return arr;
	}
	 
	public static int binarySearch(int[] arr, int key)
	{
		int low = 0;
		int high = arr.length-1;
		
		while(low <= high)
		{
			int mid = (low + high) / 2;
			if(key == arr[mid])
			{
				return mid;
			}
			else if(key > arr[mid])
			{
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		return-3;
	}

}