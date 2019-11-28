package assignment;

import java.util.Scanner;

public class Q1_ArmstrongNumber {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        int number, originalNumber, remainder, result = 0, n = 0;
        
        System.out.print("Enter number: ");
        try {
        number = input.nextInt();
        originalNumber = number;
        
        for (;originalNumber != 0; originalNumber /= 10, ++n);
        originalNumber = number;
        for (;originalNumber != 0; originalNumber /= 10)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }
		
		
        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
        }catch(Exception e) {
			System.out.println("which is not a vaild number.");
		}
        
}
}
