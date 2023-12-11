
public class Rec_Tables_of_two {

	public static void main(String[] args) {
		mul(5,1);
		

	}
	public static void mul(int n,int times) {
		if(times==11) {
			return;
		}else {
			System.out.println("the tables of two number is: "+"2"+"*"+(times)+"="+(n*times));
			mul(n,(times+1));
		}
		
	}

}
