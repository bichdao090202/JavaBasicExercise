package javaBasicExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
	public static void main(String[] args) {
		Function2 ex = new Function2();
		System.out.println("\nThe factorial of " + 10 + ": " 
				+ ex.findTheFactorial(10));
		
		System.out.println("\nString is palindrome: " + ex.checkStringPalindrome("ABCDCBA"));
		
		System.out.println("\nReverse string: "+ ex.reverseStrig("Welcome to Agest"));
		
		System.out.println("\nCheck if any number given as input is the sum of 2 prime numbers: " + 18);
		ex.checkIfNumberIsTheSumOf2PrimeNumbers(18);
		
		String[] array = {"apple", "banana", "cherry"};
		String targetStr = "banana";
		System.out.println("\nCheck if the target string is present in the list: " + ex.checkStringIsPresent(array,  targetStr));
		
		System.out.println("\nSum of prime numbers within the range: " + ex.sumOfPrimeNumbersInRange(5));
		
//		ArrayList<Integer> arr1 = new ArrayList<>(List.of(1,2,3,4,5,6));
//		int [] arr2 = {4,5,6};
//		System.out.println("Check if array B is a subarray of array A: " + );
	}
}
