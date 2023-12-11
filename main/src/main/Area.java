package main;
import java.util.*;
public class Area 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the value of  side");
		int side=scan.nextInt();
		
		
		System.out.println("enter the  value of lenght ");
		int lenght=scan.nextInt();
		int breadth=scan.nextInt();
		
		
		System.out.println("enter the  value radius");
		float radius=scan.nextFloat();
		
		System.out.println("so the area of square is"+(side*side));
		System.out.println("so the area of rectangle is"+(lenght*breadth));
		System.out.println("so the area of circle is"+(3.14*radius*radius));
		
	}
		
		
	public static int main(int side) 
	{
		return side*side;
	}
	public static int main(int lenght,int breadth)
	{
		return lenght*breadth;
	}
	public static float  main(float radius)
	{
		return 3.14F*radius*radius;
	}
	

}

