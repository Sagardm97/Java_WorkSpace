
public class MyApp {
	public static boolean  sorted(int arr[]) {
		
		for(int i=0;i<=arr.length-2;i++) {
			
			if(arr[i]>arr[i+1]) {
				return false;
				
			}
						}
		return true;
			}
	
	//liner search
	static int linearsearch(int arr[], int n, int x)
    {
        for (int i = 0; i < n; i++) {
            // Return the index of the element if the element
            // is found
            if (arr[i] == x)
                return i;
        }
 
        // return -1 if the element is not found
        return -1;
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
		return-1;
	}

}
