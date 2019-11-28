package assignment;

import java.util.Scanner;

public class Q2_Substringchecking {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner inputSub = new Scanner(System.in);
		
		System.out.println("input string1 :");
		String string1 = input.nextLine();
		System.out.println("input string2 :");
		String string2 = inputSub.nextLine();

        if (string1 != null && string2 != null & string2.length() <= string1.length() & string1.contains(string2)) {
            System.out.println("string1 contains string2");
        } else {
        	System.out.println("string1 is not contains to string2");
        }
	  }

}
