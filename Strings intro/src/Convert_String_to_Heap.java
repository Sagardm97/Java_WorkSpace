
public class Convert_String_to_Heap {

	public static void main(String[] args) {
		String s1=new String("Kodnest");
		System.out.println(s1);
		String s2=s1.intern();
		System.out.println(s2);
		String s3="Kodnest";
		if(s2==s3) {             //this if else statement is for checking the heap is connected or nto/
			System.out.println("refernece are equal");
		}
		else {
			System.out.println("reference are not equal");
		}
	}

}
