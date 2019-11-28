package assignment;

import java.util.Scanner;

public class Q9_Fibonacci {

	    public static void main(String args[]) {
	    try {
	        System.out.println("Enter number how many Fibonacci series need to print: ");
	        int MaxNum = new Scanner(System.in).nextInt();
	      
	        System.out.println("Fibonacci series numbers : ");
	        for(int i=1; i<=MaxNum; i++){
	            System.out.print(FibonacciSum(i) +" ");
	        }	  	    
	    } catch(Exception e) {
	    	System.out.println("which is not a vaild input.");
	    }
	    }

	    public static int FibonacciCal(int number){
	        if(number == 1 || number == 2){
	            return 1;
	        }
	      
	        return FibonacciCal(number-1) + FibonacciCal(number -2); 
	    }
	  

	    public static int FibonacciSum(int number){
	        if(number == 1 || number == 2){
	            return 1;
	        }
	        int fibonacciNum1=1, fibonacciNum2=1, fibonacciSum=1;
	        for(int i= 3; i<= number; i++){
	            fibonacciSum = fibonacciNum1 + fibonacciNum2;             
	            fibonacciNum1 = fibonacciNum2;
	            fibonacciNum2 = fibonacciSum;
	          
	        }
	        return fibonacciSum;
	      
	    }   
	  
	}
