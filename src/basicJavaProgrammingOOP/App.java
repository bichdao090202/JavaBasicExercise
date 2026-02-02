package basicJavaProgrammingOOP;


public class App {

	public static void main(String[] args) {
		
		BasicJavaProgrammingOOP ex1 = new BasicJavaProgrammingOOP();
		
		System.out.println(ex1.convertNegativeNumberToInversePositiveNumber(-001));
		
		int[] numbers = {1,2,4};
		System.out.println(ex1.checkNumberMissing(numbers));

		ex1.checkIfNumberIsTheSumOf2PrimeNumbers(18);
		
	}
	
}
