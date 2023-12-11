
public class Camparing {

	public static void main(String[] args) {
	String s1= "RAMU";          //M is greater 
	String s2="RAJU";
	int res=s1.compareTo(s2);
	System.out.println(res);
	if(res>0) {
		System.out.println("S1 is greater");
	}
	else if(res<0) {
		System.out.println("s2 is lesser");
	}
	else {
		System.out.println(" both are equal");
	}

	}

}
