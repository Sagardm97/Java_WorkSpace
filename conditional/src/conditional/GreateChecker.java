package conditional;

public class GreateChecker{
public static void GreatChecker1(int marks){
if(marks>=90 &&marks<=100) {
	System.out.println("Gradde A");
}
else if(marks>=70 && marks<=89) {
	System.out.println("Grade B");	
}
else if(marks>=50 && marks<=69) {
	System.out.println("Grade c");
}
else if(marks>=0 && marks<=49) {
	System.out.println("grade d");
}
else {
	System.out.println("invalid mrks");
}
}
}