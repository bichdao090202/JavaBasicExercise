package practice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Function {

	/**
	 * Enter a String array with n elements, then output that array
	 */
	public String[] exercise1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number elements of array: ");
		int n = sc.nextInt();
		sc.nextLine();
		String[] array = new String[n];
		System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLine();
        }
		sc.close();
		
		System.out.println("The array you entered: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
		
		return array;
	}
	

	/**
	 * Enter an integer array with n elements, calculate the sum
	 */
	public int exercise2() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number elements of array: ");
		int n = sc.nextInt();
		sc.nextLine();
		int[] array = new int[n];
		System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
		sc.close();
		
		System.out.println("The array you entered: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
			sum+=array[i];
		}
		
		System.out.println("\nThe sum 0f array you entered: " + sum);
		return sum;
	}
	

	/**
	 * Given the array, find the maximum value in the array
	 * @param array
	 */
	public int exercise3(int[] array) {
		int max = array [0];
		for (int i = 1; i < array.length; i++) {
			max = max > array[i] ? max : array[i];
		}
		System.out.println("\nThe maximum value in the array: " + max);
		return max;
	}
	

	/**
	 * Given the array, find the minimum value in the array
	 * @param array
	 */
	public int exercise4(int[] array) {
		int min = array [0];
		for (int i = 1; i < array.length; i++) {
			min = min < array[i] ? min : array[i];
		}
		System.out.println("\nThe minimum value in the array: " + min);
		return min;
	}
	

	/**
	 * Given the array, find the position of the largest element in the array (i.e., find the index of the maximum element)
	 * @param array
	 */
	public int exercise5(int[] array) {
		int maxIndex = 0;
		for (int i = 1; i < array.length; i++) {
			maxIndex = array[maxIndex] > array[i] ? maxIndex : i;
		}
		System.out.println("\nThe position of the largest element in the array: " + maxIndex);
		return maxIndex;
	}
	

	/**
	 * Given the array, find the position of the smallest element in the array (i.e., find the index of the minimum element)
	 * @param array
	 */
	public int exercise6(int[] array) {
		int minIndex = 0;
		for (int i = 1; i < array.length; i++) {
			minIndex = array[minIndex] < array[i] ? minIndex : i;
		}
		System.out.println("\nThe position of the smallest element in the array: " + minIndex);
		return minIndex;
	}
	

	/**
	 * Enter an integer array with n elements, find the maximum value in the array
	 */
	public int exercise7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number elements of array: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		
		System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
		sc.close();
		
		int max = array [0];
		System.out.println("The array you entered: ");
		System.out.print(array[0]+ " ");
		for (int i = 1; i < array.length; i++) {
			System.out.print(array[i]+ " ");
			max = max > array[i] ? max : array[i];
		}
		
		System.out.println("\nThe maximum value in the array: " + max);
		
		return max;
	}
	

	/**
	 * Enter an integer array with n elements, find the minimum value in the array
	 */
	public int exercise8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number elements of array: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		
		System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
		sc.close();
		
		int min = array [0];
		System.out.println("The array you entered: ");
		System.out.print(array[0]+ " ");
		for (int i = 1; i < array.length; i++) {
			System.out.print(array[i]+ " ");
			min = min < array[i] ? min : array[i];
		}
		
		System.out.println("\nThe minimum value in the array: " + min);
		return min;
	}
	

	/**
	 * Enter an integer array with n elements, find the position of the largest element in the array (i.e., find the index of the maximum element)
	 */
	public int exercise9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number elements of array: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		
		System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
		sc.close();
		
		int maxIndex = 0;
		System.out.println("The array you entered: ");
		System.out.print(array[0]+ " ");
		for (int i = 1; i < array.length; i++) {
			System.out.print(array[i]+ " ");
			maxIndex = array[maxIndex] > array[i] ? maxIndex : i;
		}
		
		System.out.println("\nThe position of the largest element in the array: " + maxIndex);
		
		return maxIndex;
	}
	
	

	/**
	 * 10.Enter an integer array with n elements, find the position of the smallest element in the array (i.e., find the index of the minimum element)
	 */
	public int exercise10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number elements of array: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		
		System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
		sc.close();
		
		int minIndex = 0;
		System.out.println("The array you entered: ");
		System.out.print(array[0]+ " ");
		for (int i = 1; i < array.length; i++) {
			System.out.print(array[i]+ " ");
			minIndex = array[minIndex] < array[i] ? minIndex : i;
		}
		
		System.out.println("\nThe position of the smallest element in the array: " + minIndex);
		
		return minIndex;
	}
	

	/**
	 * Enter an integer array with n elements, find the position of an element entered by the user (i.e., find the index of the element to search for in the array)
	 */
	public int exercise11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number elements of array: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		
		System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        System.out.print("Enter the element you want to search: ");
        int search = sc.nextInt();    
        
		sc.close();
		
		
		System.out.println("The array you entered: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
		
		System.out.println("\nThe index of emelent you search: ");
		int searchIndex=0;
		for (int i = 1; i < array.length; i++) {
			if (array[i]==search) {
				System.out.print(array[i]+ " ");
				searchIndex = i;
			}
		}
		return searchIndex;
	}
	

	/**
	 * Enter an integer array with n elements, reverse the array
	 */
	public int[] exercise12() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number elements of array: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		
		System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
		sc.close();
		
		System.out.println("The array you entered: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
		
		int[] reservedArray = new int[n];
		for (int i = 0; i < array.length; i++) {
			reservedArray[n-i-1]=array[i];
		}
		
		
		System.out.println("\nThe array is reversed: ");
		for (int i = 0; i < reservedArray.length; i++) {
			System.out.print(reservedArray[i]+ " ");
		}
		return reservedArray;
		
	}
	

	/**
	 * Enter an integer array with n elements, sort the array in ascending order
	 */
	public int[] exercise13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number elements of array: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		
		System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
		sc.close();
		
		System.out.println("The array you entered: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
		
		Arrays.sort(array);
		
		System.out.println("\nThe array is sorted in ascending order: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
		return array;
	}
	

	/**
	 * Enter an integer array with n elements, remove duplicate elements
	 */
	public Set<Integer> exercise14() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number elements of array: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		
		System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
		sc.close();
		
		System.out.println("The array you entered: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
		
		Set<Integer> linkedHashSet = new LinkedHashSet<>();
		for (int i = 0; i < array.length; i++) {
			linkedHashSet.add(array[i]);
		}
		
		System.out.println("\nThe array removed duplicate elements: ");
		for (Integer value : linkedHashSet) {
            System.out.print(value + " ");
        }
		return linkedHashSet;
	}
	
}
