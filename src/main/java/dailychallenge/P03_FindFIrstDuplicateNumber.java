package dailychallenge;

import org.junit.Test;

import junit.framework.Assert;

public class P03_FindFIrstDuplicateNumber {

	// Find first duplicate number in an integer array not the most recurring one

	/**
	 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 * 
	 * What is the input(s)? -->intarr[] What is the expected output? int a Do I
	 * have constraints to solve the problem? Can I sort the given array or not .
	 * 
	 * Do I have all informations to go to next step!! How big is your test data set
	 * will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions
	 * 
	 * Postive: Array have only once duplicate element , multiple duplicate elements
	 * , First dupicate occurs at the end of the array ,
	 * 
	 * Negative :Does not have any duplicates ,
	 * 
	 * Edge case: Null Array .Array with single element
	 * 
	 * 3) Do I know how to solve it?
	 * 
	 * Yes - great, is there an alternate? No - Can I break down the problem into
	 * sub problems?
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Do I know alternate solutions as well?
	 * 
	 * Yes - What are those? No - That is still fine, proceed to solve by what you
	 * know !!
	 * 
	 * 6) If you know alternate solutions -> find out the O Notations (Performance)
	 * 
	 * Then, explain either both or the best (depends on the time)
	 * 
	 * Approach 1: Start with worst -> Improve (Optimize) -> End up with the best
	 * Approach 2: Write down the options and benefits and code the best
	 * 
	 * 7) Start always with Psuedo code
	 * 
	 * 8) Implement them in the code (editor)
	 * 
	 * 9) Test against the different data set
	 * 
	 * 10) If it fails, debug them to solve it !! /
	 */

	@Test
	public void testcase1() {

		int[] arr = { 1, 2, 3, 1, 5, 6, 7 };
		Assert.assertEquals(1, firstDuplicateBruteForce(arr));

	}

	@Test
	public void testcase2() {

		int[] arr = { 1, 2, -3, 4, 5, 6, -3 };
		Assert.assertEquals(-3, firstDuplicateBruteForce(arr));

	}

	@Test
	public void testcase3() {

		int[] arr = {};
		Assert.assertEquals(-1, firstDuplicateBruteForce(arr));

	}

	/*
	 * loop through the given array 
	 * Compare with next element If it matches
	 * return as duplicate value
	 */

	/*
	 * Time complexity--> O(n2) , space complexity -> O(1)
	 * 
	 */
	private int firstDuplicateBruteForce(int[] arr) {
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {

					System.out.println("Duplicate Number  " + arr[i]);

					return arr[i];

				}

			}

		}
		return -1;

	}

}
