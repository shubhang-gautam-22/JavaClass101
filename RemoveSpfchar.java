

import java.util.Scanner;

public class RemoveSpfchar {

	public static void removeChr() {
		
		Scanner ch = new Scanner(System.in);
		
		System.out.println( "Enter your Strig: ");
		String str = ch.nextLine();
		
		System.out.println("One- "+ str.replace( "a", ""));
		System.out.println("Two- "+ str.replaceAll("a", ""));
		System.out.println("Three- "+ str.replaceFirst("a", ""));
	    System.out.println("Four- "+ str.replaceAll("a(.)", ""));//remove ch and also remove spaces 
	    System.out.println("Five- "+ str.replaceAll("a(.*)", ""));//remove all string after replace
		 
		 
		
	}

}
