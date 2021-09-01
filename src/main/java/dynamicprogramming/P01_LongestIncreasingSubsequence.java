package dynamicprogramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class P01_LongestIncreasingSubsequence {

	/*
	 * https://leetcode.com/problems/longest-increasing-subsequence/
	 */
	@Test
	public void testcase1() {
		int[] intarr= {-1,3,4,5,2,2,2,2};
		findLongestIncreasingSubSeq(intarr);
		Assert.assertEquals(4, findLongestIncreasingSubSeq(intarr));
	}

	@Test
	public void testcase2() {
		int[] intarr= {0,1,0,3,2,3};
		Assert.assertEquals(4, findLongestIncreasingSubSeq(intarr));
	}



	@Test
	public void testcase3() {
		int[] intarr= {10,9,2,5,3,7,101,18};
		Assert.assertEquals(4, findLongestIncreasingSubSeq(intarr));
	}


	@Test
	public void testcase4() {
		int[] intarr= {7,7,7,7,7,7,7};
		Assert.assertEquals(1, findLongestIncreasingSubSeq(intarr));
	}

	@Test
	public void testcase5() {
		int[] intarr= {1,3,6,7,9,4,10,5,6};
		Assert.assertEquals(6, findLongestIncreasingSubSeq(intarr));
	}

	/*Define the outputarr of same length and set the default value as one.
	 *
	 * set left=0,right =0 , move right intially.
	 *
	 * loop through the given array from left to right
	 *        if the left value is lesser than the right value
	 *                         increment the equivalent value from the output arr by 1 and assign to the current right.
	 *
	 *        if the left value is lesser than the right value and equivalent value from out put arr is lesser than
	 *        current equivalent value for the right element SKIP.
	 *
	 *        if the left value is greater than the right value  -->SKIP
	 *
	 *
	 *
	 *
	 *
	 * Time-->O(n2)  space -->O(n)
	 *


	*/
	private int findLongestIncreasingSubSeq(int[] intarr) {
		int[] outputarr= new int[intarr.length] ;

		for(int i=0;i<intarr.length;i++) {
			outputarr[i]=1;
		}


		int left = 0, right = 0;

		while (right < intarr.length) {
			if (right >= 1) {
				for (int i = left; i < right; i++) {
					if (intarr[right] > intarr[i]) {
						int temp = outputarr[i] + 1;
						outputarr[right] = Math.max(outputarr[right], temp);
					}
				}
				right++;

			}

			else {
				right++;
			}

		}

		Set<Integer> set = new HashSet<Integer>();
		System.out.println(Arrays.toString(outputarr));
		for (int i = 0; i < outputarr.length; i++) {
			set.add(outputarr[i]);
		}
		System.out.println(Collections.max(set));
		return Collections.max(set);

	}

}
