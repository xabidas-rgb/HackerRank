package levelEasy;

import java.util.Scanner;

/**
 * @author abinash
 * In ths challenge, you are required to calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large.
 * 
 * Function Description :
 *   Complete the aVeryBigSum function in the editor below. It must return the sum of all array elements.
 *   
 *   aVeryBigSum has the following parameter(s):
 *     . int ar[n]: an array of integers
 *     
 *   Return :
 *     . long: the sum of all array elements
 *     
 *   Input Format :
 *     The first line of the input consists of an integer n.
 *     The next line contains n space-separated integers contained in the array
 *     
 *   Output Format : Return the integer sum of the elements in the array
 *   
 *   Constraints : 
 *   
 *     1 <= n <= 10
 *     0 <= ar[i] <10 to the power 10
 *     
 *   Sample Input : 5
 *                  1000000001 1000000002 1000000003 1000000004 1000000005
 *                  
 *   Output : 5000000015
 *   
 *   Note : 
 */
public class VeryBigSumProblem {
	
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter the size of the array : ");
			int size = scanner.nextInt();
			Long[] arr = new Long[size];
			System.out.println("Enter the elements of an array one by one : ");
		    for (int i = 0; i< arr.length ; i++) {
		    	Long element = scanner.nextLong();
		    	arr[i] = element;
		    }
		    System.out.println("Summation of all the elements in the array : " + aVeryBigSum(arr));
		} catch(Exception e) {
			
		} finally {
			scanner.close();
		}
	}
	
	/**
	 * Sums up all the elements in the array
	 * @param  arr, The input array
	 * @return sum, Total sum of all the elements in array
	 */
	static Long aVeryBigSum(Long[] arr) {
		Long sum = 0l;
		if (arr == null || arr.length == 0)
			return sum;
		
		for (Long element : arr) {
			sum += element;
		}
		return sum;
	}

}
