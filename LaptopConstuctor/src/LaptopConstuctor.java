public class LaptopConstuctor 
{
String processor;
String Brand;
String OS;
int RAM;
float cost;

 void switchon()
 {
 System.out.println("switched on the lap");
		// TODO Auto-generated method stub

	}
 void switchoff()
 {
 System.out.println("switched off the lap");

}
 void details()
 {
 System.out.println("processor :"+processor);
 System.out.println("Brand :"+Brand);
 System.out.println("os :"+OS);
 System.out.println("RAM :"+RAM);
 System.out.println("cost :"+cost);
 }
 public LaptopConstuctor(String a,String b,String c,int d,float e)
 {
	 processor=a;
	 Brand=b;
	 OS=c;
	 RAM=d;
	 cost=e;
	 
	 
	 
 }
 }