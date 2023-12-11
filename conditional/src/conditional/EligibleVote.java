package conditional;

public class EligibleVote 
{
	

	public static void eligibleVoting(int age,string nationality) 
	{
		if(nationality.equals("indian"))
		{
			if(age>=18)
			{
				System.out.println("your eligible");
			}
			else
			{
				System.out.println("focus on studies");
			}
		}
		else
		{
			System.out.println("only indians are eligible");
		}
	}
		
		
		
}
	
	

