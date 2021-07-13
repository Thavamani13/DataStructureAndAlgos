package dailychallenge;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class P11_NextELementCount {

	/*
	 * Given an integer array arr, count how many elements x there are, such that x
	 * + 1 is also in arr. If there are duplicates in arr, count them separately.
	 * 
	 * Input: arr = [1,2,3] Output: 2 Explanation: 1 and 2 are counted cause 2 and 3
	 * are in arr. Input: arr = [1,1,3,3,5,5,7,7] Output: 0
	 * 
	 *
	 * 
	 * /** 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 * 
	 * What is the input(s)? What is the expected output? Do I have constraints to
	 * solve the problem? Do I have all informations to go to next step!! How big is
	 * your test data set will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions
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

		int[] arr = { 1, 2, 3 };

		Assert.assertEquals(2, countNextElementUsingBruteForce(arr));

	}

	@Test
	public void testcase2() {

		int[] arr = { 1, 1, 3, 3, 5, 5, 7, 7 };

		Assert.assertEquals(0, countNextElementUsingBruteForce(arr));

	}

	@Test
	public void testcase3() {

		int[] arr = { 1, 3, 2, 3, 5, 0 };

		Assert.assertEquals(3, countNextElementUsingBruteForce(arr));

	}

	@Test
	public void testcase4() {

		int[] arr = { 0, 5, 10, 6, 2, 6 };

		Assert.assertEquals(3, countNextElementUsingBruteForce(arr));

	}

	private int countNextElementUsingBruteForce(int[] arr) {

		Arrays.sort(arr);

		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 1; j < arr.length; j++) {

				if (arr[i] + 1 == arr[j]) {

					count++;

					break;

				}
			}
		}

		System.out.println(count);
		return count;

	}

}
