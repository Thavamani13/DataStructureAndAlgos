package binarySearch;

import org.junit.Test;

import junit.framework.Assert;

public class P10_FindNumberOfOnes {

	/*
	 * Given the sorted array with 0's and One's . FInd the number of ones
	 * 
	 * 
	 */

	@Test
	public void testcase1() {
		int[] intarr = { 0, 0, 0, 1, 1, 1, 1 };
		Assert.assertEquals(4, findNumberOfOnesUsingBruteForce(intarr));
	}

	@Test
	public void testcase2() {

		int[] intarr = { 0, 0, 1 };
		Assert.assertEquals(1, findNumberOfOnesUsingBruteForce(intarr));
	}

	@Test
	public void testcase3() {
		int[] intarr = { 1, 1, 1, 1, 1 };
		Assert.assertEquals(5, findNumberOfOnesUsingBruteForce(intarr));

	}

	/*
	 * low--> 0 , high-->arrlen-1,
	 * 
	 * loop through the array until low crosses high
	 * 
	 * if mid value is One , move high to mid-1 , to check the occurances of the 1
	 * in the left side.
	 * 
	 * If mid value is Zero , move low to mid+1 , to find the first occurance of 1.
	 * 
	 * If both low and mid value becomes One , return the difference between
	 * arrlength annd low. *
	 * 
	 * 
	 * 
	 */

	private int finNumberOfOnes(int[] intarr) {

		int low = 0, mid = 0, high = intarr.length - 1;

		// { 0, 0, 0, 1, 1, 1, 1 };

		while (low <= high) {
			mid = (low + high) / 2;

			if (intarr[mid] == 1)
				high = mid - 1;

			else if (intarr[mid] == 0)
				low = mid + 1;

			else if (intarr[low] == 1 && intarr[mid] == 1)
				return intarr.length - low;
		}
		System.out.println(intarr.length - low);
		return intarr.length - low;

	}

	/*
	 * left --> 0 , right -->arr.len-1 If left value is equal to zero , increament
	 * left++4 If Left pointer value is equal to 1 , find the difference between
	 * arr.len -left
	 * 
	 */

	private int findNumberOfOnesUsingTwoPointer(int[] intarr) {

		int left = 0, right = intarr.length - 1;

		while (left <= intarr.length) {
			if (intarr[left] == 0)
				left++;

			else {
				return intarr.length - left;
			}
		}
		System.out.println(intarr.length - left);
		return 0;

	}

	private int findNumberOfOnesUsingBruteForce(int[] intarr) {

		int count = 0;
		for (int i = 0; i < intarr.length; i++) {
			if (intarr[i] == 1) {
				count = intarr.length - i;				
				return count;
			}
		}

		return 0;

	}

}
