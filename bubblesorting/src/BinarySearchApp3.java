

import java.util.Scanner;

public class BinarySearchApp3 {

	public static void main(String[] args) {
		//creating the scanner object
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		//taking the array length input from the user and creating the array
		int [] arr = new int[scan.nextInt()];
		//storing the elements in the array
		System.out.println("Enter the elements of the array");
		for(int i = 0 ; i <= arr.length- 1  ; i ++)
		{
			arr[i] = scan.nextInt();
		}
		//asking the key input from the user
		System.out.println("Enter the key element to search");
		int key = scan.nextInt();

		//printing the user entered array
		System.out.println("User entered array: ");
		for(int x: arr)
		{
			System.out.print(x + " ");
		}
		//calling the bubbleSort method present in BinarySearch3 class and getting the sorted array
		int [] sortedArray = BinarySearch3.bubbleSort(arr);
		System.out.println();
		
		//printing the elements in the sorted array
		System.out.println("Sorted Array: ");
		for(int x: sortedArray)
		{
			System.out.print(x + " ");
		}
		
		System.out.println();
		
		//calling the binarySearch method present in BinarySearch3 class and getting the index of key element
		int res = BinarySearch3.binarySearch(sortedArray, key);
		
		//checking if the result is -1 (-1 means element not found)
		if(res == -1)
		{
			System.out.println("Key not found");
		}
		//printing the index of the key element
		else {
			System.out.println("key element found at index " +res);
		}
	}

}