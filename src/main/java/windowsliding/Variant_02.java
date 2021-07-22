package windowsliding;

import org.junit.Test;

import junit.framework.Assert;

public class Variant_02 {

	/*
	 * SmallestSubarrayGivenSum {4,2,2,7,8,1,2,8,10}; targetSum = 8;
	 * 
	 * Smallest SubArray which gives the sum value Equal or greater than Target SUm
	 * 
	 * WINDOW SIZE IS UNDEFINED
	 * 
	 */

	@Test
	public void testcase1() {
		int[] intarr = { 4, 2, 2, 7, 8, 1, 2, 8, 10 };
		int target = 8;

		Assert.assertEquals(1, findSmallestSubArray(intarr, target));
	}

	private int findSmallestSubArray(int[] intarr, int target) {

		int windowStart = 0;
		int windowsum = 0;
		int minsubarray = Integer.MAX_VALUE;

		for (int windowend = 0; windowend < intarr.length; windowend++) {
			windowsum += intarr[windowend];

			while (windowsum >= target) {
				minsubarray = Math.min(minsubarray, windowend - windowStart + 1);
				windowsum -= intarr[windowStart];
				windowStart++;

			}

		}

		return minsubarray;

	}

}
