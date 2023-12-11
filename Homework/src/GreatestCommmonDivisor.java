public class GreatestCommmonDivisor {
	public static int checkGcd(int num1, int num2) 
	{
		
		
		while(num2!=0)
		{
			int rem = num1 % num2;
			
			num1 = num2;
			num2 = rem;
		}
		return num1;
		
		
	}

}