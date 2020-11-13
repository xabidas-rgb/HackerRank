package levelEasy;

import java.util.Scanner;

/**
 * @author abinash
 * Given an array of integers, find the sum of its elements
 * For example, if the aray ar = [1,2,3], 1 + 2 + 3 = 6, so return 6
 * 
 * Function - Complete the simpleArraySum function in the editor below. It must return the sum of the array elements as an integer. 
 *            simpleArraySum has the following parameter(s): 
 *             . ar: an array of integers
 *             
 * Input Format - The first line contains an integer, n , denoting the size of the array.
                  The second line contains n space-separated integers representing the array's elements. 
                  
   Constraints - 0 < n, ar[i]<= 1000
   
   Output Format - Print the sum of the array's elements as a single integer
   
   Sample Input - 6
                  1 2 3 4 10 11
                  
   Sample Output - 31
   
   Explanation - We print the sum of the array's elements: 1 + 2 + 3 + 4 + 10 + 11 = 31.
 */
public class SimpleArraySumProblem {
	
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter the size of the array : ");
			int size = scanner.nextInt();
			int[] arr = new int[size];
			System.out.println("Enter the elements of an array one by one : ");
		    for (int i = 0; i< arr.length ; i++) {
		    	int element = scanner.nextInt();
		    	arr[i] = element;
		    }
		    System.out.println("Summation of all the elements in the array : " + simpleArraySum(arr));
		} catch(Exception e) {
			System.out.println("Exception occurred !");
		} finally {
			scanner.close();
		}
	}
	
	/**
	 * Sums up all the elements in an array
	 * @param arr, the input array
	 * @return
	 */
	static int simpleArraySum(int[] arr) {
		int sum = 0;
		if (arr == null || arr.length == 0)
			return sum;
		
		for(int a : arr) {
			sum += arr[a];
		}
		return sum;
	}

}
