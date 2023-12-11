package bubblesorting;

public class bubbleclasslogic {

	public static void bbhhh(int[]arr) {
		
		for(int i=0;i<=arr.length-2;i++) 
		{
			for(int j=0;j<=arr.length-i-2;j++) 
			{
				if(arr[j]>arr[j+1]) 
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
				
			}
			
		}
		
		for(int x:arr)
		{
			System.out.print(x+" ");
			}
		}

	}


