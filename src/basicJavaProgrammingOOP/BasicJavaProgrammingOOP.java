package basicJavaProgrammingOOP;

public class BasicJavaProgrammingOOP {
	
	/**
	 * @param negativeNumber
	 * @return convert from a negative number to an inverse positive number
	 */
	public int convertNegativeNumberToInversePositiveNumber(int negativeNumber){
		
        return -negativeNumber;
    }

	
    /**
     * Given an array of non-duplicating numbers from 1 to n where one number is missing, write an efficient java program to find that missing number
     * @param list
     * @return a number missing, if no number missing then return 0 
     */
    public int checkNumberMissing(int[] list){
    	for (int i = 0; i < list.length; i++) {
    		if (list[i]!=i+1)
    			return i+1;	
		}
    	if (list.length==0)
    		return 1;
    	else 
    		return list.length+1;
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
    	System.out.println("The sum of 2 prime numbers of " + number + ": ");
    	for (int i = 2; i <= number/2; i++) {
    		if (checkPrimeNumber(i) & checkPrimeNumber(number-i) )
    			System.out.println(number + " = " + i + " " + (number-i));
    	}
    }

}
