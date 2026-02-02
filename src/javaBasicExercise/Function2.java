package javaBasicExercise;

import java.util.ArrayList;

public class Function2 {
	public int findTheFactorial(int number){
		int result = 1;
		for (int i = 2; i <= number; i++) {
			result*=i;
		}
		return result;
	}
	

	public boolean checkStringPalindrome(String string) {
		int length = string.length();
		for (int i = 0; i <= length/2;i++) {
			if (string.charAt(i)!=string.charAt(length-1-i))
				return false;
		}
		return true;
	}
	
	public String reverseStrig(String string) {
		int length = string.length();
		String newString = "";
		for (int i = length-1; i >= 0;i--) {
			newString+=string.charAt(i);				
		}
		return newString;
	}
	
	public boolean checkPrimeNumber(int number) {
    	for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number%i==0)
				return false;
		}
    	return true;
    }
	
	/**
     * check if any number given as input is the sum of 2 prime numbers
     * @param number
     */
    public void checkIfNumberIsTheSumOf2PrimeNumbers(int number) {
    	System.out.println("The sum of 2 prime numbers of 18: ");
    	for (int i = 2; i <= number/2; i++) {
    		if (checkPrimeNumber(i) & checkPrimeNumber(number-i) )
    			System.out.println(number + " = " + i + " " + (number-i));
    	}
    }
    
    public boolean checkStringIsPresent(String[] arrayString, String targetStr) {
    	for (String s : arrayString) {
    		if (s.equals(targetStr))
    			return true;
    	}    	
    	return false;
    }
    
    public int sumOfPrimeNumbersInRange(int range) {
    	int sum = 0;
    	for (int i = 2; i <= range; i++) {
    		sum+=checkPrimeNumber(i)?i:0;
		}
    	return sum;
    }
    
//    public boolean checkIfSubarray(ArrayList<Integer> bigArray, int[] subArray) {
//    	boolean flag = false;
//    	for (int i : bigArray) {
//    		for (int j : subArray) {
//    			if (i==j) {
//    				bigArray.remove(i);
//    				continue;
//    			}
//    		}
//    	}
//    }
    
}
