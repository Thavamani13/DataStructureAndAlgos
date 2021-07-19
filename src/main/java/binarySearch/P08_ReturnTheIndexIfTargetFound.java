package binarySearch;

import org.junit.Test;

import junit.framework.Assert;

public class P08_ReturnTheIndexIfTargetFound {

	/*
	 * Given a sorted array of distinct integers and a target value, return the
	 * index if the target is found.
	 * 
	 * If not, return the index where it would be if it were inserted in order. You
	 * must write an algorithm with O(log n) runtime complexity.
	 * 
	 * Example 1: Input: nums = [1,3,5,6], target = 5 Output: 2 Example 2: Input
	 * nums = [1,3,5,6], target = 2 Output: 1 Example 3: Input: nums = [1,3,5,6]
	 * target = 7 Output: 4 Example 4: Input: nums = [1,3,5,6], target = 0 Output: 0
	 */

	@Test
	public void testcase1() {
		int[] intarr = { 1, 3, 5, 6 };
		int k = 5;
		Assert.assertEquals(2, findIndexUsingBS(intarr, k));
	}

	@Test
	public void testcase2() {
		int[] intarr = { 1, 3, 5, 6 };
		int k = 2;
		Assert.assertEquals(1, findIndexUsingBS(intarr, k));
	}

	@Test
	public void testcase3() {
		int[] intarr = { 1, 3, 5, 6 };
		int k = 7;
		Assert.assertEquals(4, findIndexUsingBS(intarr, k));
	}

	@Test
	public void testcase4() {
		int[] intarr = { 1, 3, 5, 6 };
		int k = 0;
		Assert.assertEquals(0, findIndexUsingBS(intarr, k));
	}

	private int findIndexUsingBS(int[] intarr, int k) {
		int low = 0;
		int high = intarr.length - 1;

		while (low <= high) {
			
			int mid = (low + high) / 2;

			if (intarr[mid] == k ) return mid;

			if (intarr[mid] > k)  high = mid - 1;
		      
			else low = mid+ 1;

		}

		return low;
	}

}
