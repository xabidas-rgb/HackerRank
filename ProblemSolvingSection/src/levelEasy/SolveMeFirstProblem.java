package levelEasy;

import java.util.Scanner;

/**
 * @author abinash
 * Complete the function solveMeFirst to compute the sum of two integers
 * 
 * Function Prototype:
 *   int solveMeFirst(int a, int b);
 *   
 *   where, 
 *      a is the first integer input
 *      b is the second integer input
 *      
 *   Return values 
 *      sum of the above two integers
 *      
 *   Sample Input 
 *      a 2
 *      b 3
 *      
 *   Sample Output 
 *      5
 *      
 *   Explanation 
 *      The sum of the two integers a and b is computed as 2 + 3 = 5
 */
public class SolveMeFirstProblem {
	
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter the first number : ");
			int a = scanner.nextInt();
			System.out.println("Enter the second number : ");
			int b = scanner.nextInt();
			System.out.println("Summation of 2 numbers : " + solveMeFirst(a, b));
		} catch(Exception e) {
			System.out.println("Exception occurred !");
		} finally {
			scanner.close();
		}
	}
	
	
	/**
	 * Sums up two integers
	 * @param  a, the first number
	 * @param  b, the second number
	 * @return Summation of 2 numbers
	 */
	static int solveMeFirst(int a, int b) {
		return (a + b);
	}

}
