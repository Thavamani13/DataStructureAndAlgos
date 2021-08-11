package twopointer;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class P12_SquareSortedArray {

	/*
	 * https://leetcode.com/problems/squares-of-a-sorted-array/ Input: nums =
	 * [-4,-1,0,3,10] Output: [0,1,9,16,100] Explanation: After squaring, the array
	 * becomes [16,1,0,9,100]. After sorting, it becomes [0,1,9,16,100]. Given an
	 * integer array nums sorted in non-decreasing order, return an array of the
	 * squares of each number sorted in non-decreasing order.
	 */

	/*
	   1.
	  	  Input(s) ?  int[]
		  Output ? outputarr int[]
		  Constraint(s) ?

	   2. Test data
			Positive :	only positive numbs
			Negative :
			Edge     :  mix up of postive and negative nums , empty array ,
			Edge     :

	   3.  Approaches :
			 Approach 1 :

	   4.  O - Notation
			 Approach 1 :

	   5.  Pseudocode

	 */



	@Test
	public void testcase1() {
		int[] intarr= {-4,-1,0,3,10};
		Assert.assertArrayEquals(new int[] {0,1,9,16,100}, getSquaredArrayusingTwoPointer(intarr));
	}

	@Test
	public void testcase2() {
		int[] intarr= {-7,-3,2,3,11};
		Assert.assertArrayEquals(new int[] {4,9,9,49,121}, getSquaredArrayusingTwoPointer(intarr));
	}



	/*Define the output array of same length as input array
	 * Assign the product of inputarray element (nums[i]*nums[i]) to outputarr[i]
	 * sort the output array and return
	 *
	 * time-->O(nlogn) , space -->(n)

	*/

	private int[] getSquaredArray(int[] intarr) {
		int[] outputarr = new int[intarr.length];

		for (int i = 0; i < intarr.length; i++) {
			outputarr[i] = intarr[i] * intarr[i];
		}

		Arrays.sort(outputarr);
		return outputarr;

	}

	/*define the output array
	 * left=0, right= arr.len-1;
	 * find the abs value of left pointer and right pointer
	 *              get the max of abs value between left and right pointer
	 *                      if the right pointer value is equal to max ---->assign the value and decrement the right pointer
	 *                      if the left  pointer value is equal to max ---->assign the value and decrement the right pointer
	 *

       //-7,-3,2,3,11

	*/
	private int[] getSquaredArrayusingTwoPointer(int[] intarr) {
		int[] outputarr = new int[intarr.length];
		int left = 0, right = intarr.length - 1;
		int max = Integer.MIN_VALUE;

		for (int i = outputarr.length - 1; i >=0; i--) {

			max = Math.max(Math.abs(intarr[left]), Math.abs(intarr[right]));
			if (intarr[right] == max) {
				outputarr[i] = intarr[right] * intarr[right];
				right--;
			} else {
				outputarr[i] = intarr[left] * intarr[left];
				left++;
			}

		}

		return outputarr;
	}


	}

