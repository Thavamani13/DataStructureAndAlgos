package hashing;

import java.util.Arrays;

import org.junit.Test;

public class P01_FindApair {

	/*
	 * Find a pair with the given sum in an arr arr = [8, 7, 2, 5, 3, 1] , Pair
	 * found (8, 2) , Pair found (7, 3)
	 */

	/**
	 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 * 
	 * What is the input(s)? intarr[] What is the expected output? int arr[] Do I
	 * have constraints to solve the problem?
	 * 
	 * 
	 * Do I have all informations to go to next step!! How big is your test data set
	 * will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions Positive :Data
	 * contains single match , multiple matach Negative :Data does not have any
	 * match , Edge : empty array
	 * 
	 *
	 * Approaches : Bruteforce
	 * 
	 * 
	 */
	@Test
	public void testcase1() {
		int[] intarr = { 8, 7, 2, 5, 4, 1 };
		int sum = 10;
		findPairsUsingtwoPointer(intarr, sum);

	}

	@Test
	public void testcase2() {
		int[] intarr = { 8, 7, 2, 5, 3, 1 };
		int sum = 40;
		findPairsUsingtwoPointer(intarr, sum);

	}

	@Test
	public void testcase3() {
		int[] intarr = { 8, 7, 2, 5, 3, 1 };
		int sum = 10;
		findPairsUsingtwoPointer(intarr, sum);

	}

	@Test
	public void testcase4() {
		int[] intarr = { 8, 7, 2, 5, 3, 1 };
		int sum = 10;
		findPairsUsingtwoPointer(intarr, sum);

	}

	@Test
	public void testcase5() {
		int[] intarr = {};
		int sum = 10;
		findPairsUsingtwoPointer(intarr, sum);

	}

	@Test
	public void testcase6() {
		int[] intarr = { -2, -8, 10, 15, 22 };
		int sum = 8;
		findPairsUsingtwoPointer(intarr, sum);

	}

	/*
	 * Traverse from the given array --> outer loop starts at 0
	 * 
	 * Traverse through the entire array --> inner loop starts at 0 .
	 * 
	 * if the sum of the values from outer and inner loop matches to the target ,
	 * return the values .
	 * 
	 * Time complexity-->O(n2) and space complexity--> O(n)
	 * 
	 */
	private void findPairs(int[] intarr, int sum) {

		int count = 0, index = -1;

		if (intarr.length == 0)
			throw new RuntimeException("Invalid input");

		for (int i = 0; i < intarr.length; i++) {
			int left = intarr[i];
			for (int j = i + 1; j < intarr.length; j++) {
				int right = intarr[j];
				if (left + right == sum) {
					System.out.println(left + "," + right);

				}
			}

		}

	}
	
	/*Sort the array 
	
	
	
	*/
	private void findPairsUsingtwoPointer(int[] intarr, int sum) {
		Arrays.sort(intarr);
		
		int left=0 , right =intarr.length-1;
		
		while(left<right) {
			if(intarr[left]+intarr[right]==sum) {
				System.out.println(intarr[left] +","+intarr[right]);
				left++;
				right--;	
			}
			
			else if(intarr[left]+intarr[right] >sum) {
				right--;
			}
			
			else left++;
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}