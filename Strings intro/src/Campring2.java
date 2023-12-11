
public class Campring2 {

	public static void main(String[] args) {
	String s1= "RAM";          
	String s2="RAMU";                // u IS OLY LEFT means -1 suppose RAMUJ=-2 like wise it will continue
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
