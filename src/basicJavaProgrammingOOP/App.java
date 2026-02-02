package basicJavaProgrammingOOP;


public class App {

	public static void main(String[] args) {
		//exercise 1 - BasicJavaProgrammingOOP	
		
		BasicJavaProgrammingOOP ex1 = new BasicJavaProgrammingOOP();
		
		System.out.println("Inverse positive number of -5:");
		System.out.println(ex1.convertNegativeNumberToInversePositiveNumber(-5));
		
		System.out.println("Number is missed in array:");
		int[] numbers = {1,2,3,5};
		System.out.println(ex1.checkNumberMissing(numbers));

		
		ex1.checkIfNumberIsTheSumOf2PrimeNumbers(18);
		
	}
	
	
    
    
    
    
    

}
