package assessment2;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class P1_MinimumDifferenceSum {

	/*
	 * Given an array of n integers, rearrange them so that the sum of the absolute
	 * differences of all adjacent elements is minimized. Then, compute the sum of
	 * those absolute differences. Example n = 5 arr = [1, 3, 3, 2, 4] If the list
	 * is rearranged as arr' = [1, 2, 3, 3, 4], the absolute differences are |1 - 2|
	 * = 1, |2 - 3| = 1, |3 - 3| = 0, |3 - 4| = 1. The sum of those differences is 1
	 * + 1 + 0 + 1 = 3. Function Description Complete the function minDiff in the
	 * editor below. minDiff has the following parameter: arr: an integer array
	 * Returns: int: the sum of the absolute differences of adjacent elements
	 * Constraints 2 ≤ n ≤10 0 ≤ arr[i] ≤ 10 , where 0 ≤ i < n
	 */

	/**
	 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 * 
	 * What is the input(s)? intarr[]
	 * What is the expected output? int a 
	 * Do I have constraints to
	 * solve the problem? Do I have all informations to go to next step!! How big is
	 * your test data set will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions
	 * Positive :Postive number with duplicates /without duplicates 
	 * Negative : Negative Number with duplicates/without duplicates
	 * Edge :Less than two numbers 
	 * 
	 *
	 * Approaches :
	 * 
	 * BruteForce-->
	 * 
	 * Sliding Window-->
	 * 
	 * 
	 */

	@Test
	public void testcase1() {
		int[] intarr = { 1, 3, 3, 2, 4 };
		Assert.assertEquals(3, findMinimumDifferenceSum(intarr));

	}

	@Test
	public void testcase2() {
		int[] intarr = { 1 };
		Assert.assertEquals(0, findMinimumDifferenceSum(intarr));

	}

	@Test
	public void testcase3() {
		int[] intarr = {};
		Assert.assertEquals(0, findMinimumDifferenceSum(intarr));

	}

	@Test
	public void testcase4() {
		int[] intarr = { 5, 1, 3, 7, 3 };
		Assert.assertEquals(6, findMinimumDifferenceSum(intarr));

	}

	@Test
	public void testcase5() {
		int[] intarr = { 3, 2 };
		Assert.assertEquals(1, findMinimumDifferenceSum(intarr));

	}

	@Test
	public void testcase6() {
		int[] intarr = { -1, -3, -4 };
		Assert.assertEquals(3, findMinimumDifferenceSum(intarr));

	}

	/*
	 * Sort the given array . Find the difference between the next and current
	 * element Keep adding the difference value to the Sum Return the SUM.
	 * 
	 * Time complexity --> O(nlogn)+ O(n) Space--> O(n)
	 */
	private int findMinimumDifferenceSum(int[] intarr) {
		if (intarr.length <= 1)
			return 0;

		Arrays.sort(intarr);

		int sum = 0;
		for (int i = 0; i < intarr.length - 1; i++) {
			int difference = Math.abs(intarr[i + 1] - intarr[i]);
			sum += difference;
		}
		System.out.println(sum);
		return sum;

	}

	

}
