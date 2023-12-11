import java.util.Scanner;

public class Inbuiltmethods {

	public static void main(String[] args) {
		String s="Kodnest Technologies PVT LTD";		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.isEmpty());
		System.out.println(s.charAt(3));
		System.out.println(s.indexOf('e'));
		System.out.println(s.indexOf('z'));
		System.out.println(s.lastIndexOf('e'));
		System.out.println(s.contains("Test"));
		System.out.println(s.contains("nest"));
		System.out.println(s.startsWith("k"));
		System.out.println(s.endsWith("D"));
		System.out.println(s.substring(8));
		System.out.println(s.replace('e','x'));
		System.out.println(s.replaceAll("Technologies", "xxxxxx"));
		System.out.println(s.concat(" then bro"));
		System.out.println(s.stripIndent());
		System.out.println(s.matches(s));
		System.out.println(s.codePointAt(0));
		
		
		
	}

}
