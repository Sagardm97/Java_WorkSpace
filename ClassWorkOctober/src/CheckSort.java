
public class CheckSort {

	public  boolean CheckApp(int []arr) {   
		// here we are not using static word so we are using new keyword like created one more method
		
		for(int i=0;i<=arr.length-2;i++) {
		
		if(arr[i]>arr[i+1]) {
			return  false;
			
		}
		}
		return true;
		

	}

}
