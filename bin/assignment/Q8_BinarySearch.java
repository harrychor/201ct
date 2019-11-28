package assignment;

import java.util.Scanner;

public class Q8_BinarySearch {
    int binarySearch(int array[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
            if (array[mid] == x) 
                return mid; 

            if (array[mid] > x) 
                return binarySearch(array, l, mid - 1, x); 
  
            return binarySearch(array, mid + 1, r, x); 
        }   
 
        return -1; 
    } 

    public static void main(String args[]) 
    { 
        Q8_BinarySearch ob = new Q8_BinarySearch(); 
        int arr[] = {11, 12, 34,55, 66, 77, 88 }; 
        int n = arr.length; 
        try {
        Scanner input = new Scanner(System.in);
        System.out.print("Input are number to search in the array : ");
        int x =input.nextInt(); 
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
        }catch(Exception e) {
        	 System.out.println("no vaild input"); 
        }
    } 
}
