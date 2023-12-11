package conditional;

public class Main1{
			

			public static void a(int age,String nationality) 
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


