package searching;

import java.util.Scanner;

public class BinarySearchApp {

	public static void main(String[] args) {
		//creating the scanner object
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		//taking the array length input from the user and creating the array
		int [] arr = new int[scan.nextInt()];
		//storing the element in the array
		System.out.println("Enter the elements of the array");
		for(int i = 0 ; i <= arr.length- 1  ; i ++)
		{
			arr[i] = scan.nextInt();
		}
		//asking the key input from the user
		System.out.println("Enter the key element to search");
		int key = scan.nextInt();
		
		//sorting the array
		int[] sortedArray = BinarySearch1.sort(arr);
		//printing the array
		for(int x: sortedArray)
		{
			System.out.print(x + " ");
		}
		
		//calling the binary search method present in BinarySearch class
		int res = BinarySearch1.binarySearch(sortedArray, key);
		
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