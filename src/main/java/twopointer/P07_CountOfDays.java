package twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class P07_CountOfDays {

	/*
	 * Given an array of integers temperatures represents the daily temperatures,
	 * return an array answer such that answer[i] is the number of days you have to
	 * wait after the ith day to get a warmer temperature. If there is no future day
	 * for which this is possible, keep answer[i] == 0 instead.
	 * 
	 * Input: temperatures = [73,74,75,71,69,72,76,73] Output: [1,1,4,2,1,1,0,0]
	 * 
	 * Input: temperatures = [30,40,50,60] Output: [1,1,1,0]
	 * 
	 * Input: temperatures = [30,60,90] Output: [1,1,0]
	 * 
	 * https://leetcode.com/problems/daily-temperatures/
	 */

	/**
	 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 * 
	 * What is the input(s)?intarr[] What is the expected output? intarr[] Do I have
	 * constraints to solve the problem?
	 * 
	 * 
	 * Do I have all informations to go to next step!! How big is your test data set
	 * will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions Positive :
	 * Negative : Edge :
	 * 
	 *
	 * Approaches :Two pointer
	 * 
	 * 
	 * 
	 * 
	 */
	@Test
	public void testcase1() {
		int[] temp = { 73, 74, 75, 71, 69, 72, 76, 73 };
		Assert.assertArrayEquals(new int[] { 1, 1, 4, 2, 1, 1, 0, 0 }, countDays(temp));
	}

	@Test
	public void testcase2() {
		int[] temp = { 30, 40, 50, 60 };
		Assert.assertArrayEquals(new int[] { 1, 1,1, 0}, countDays(temp));
	}

	@Test
	public void testcase3() {
		int[] temp = { 30, 60, 90 };
		Assert.assertArrayEquals(new int[] {1, 1, 0 }, countDays(temp));
	}

	@Test
	public void testcase4() {
		int[] temp = { 55, 38, 53, 81, 61, 93, 97, 32, 43, 78 };
		Assert.assertArrayEquals(new int[] { 3, 1, 1, 2, 1, 1, 0, 1, 1, 0 }, countDays(temp));
	}
	
	@Test
	public void testcase5() {
		int[] temp = { 89,62,70,58,47,47,46,76,100,70};
		Assert.assertArrayEquals(new int[] {8, 1, 5, 4, 3, 2, 1, 1, 0, 0}, countDays(temp));
	}
	
	
	
	/*
	 * 
	 * keep left pointer at index 0 ,right pointer at 1 .
	 * If right value is greater than left value 
	 *              Assign the index difference between right pointer and left pointer, to the O/p array .
	 * If the right value is lesser than the left value and right is not at the last index
	 *               keep moving the right pointer , untill right value becomes greater than left value
	 *               
	 * If the right value is lesser than the left value and right reaches the  last index
	 *               Assign 0 to the left , 
	 *               increment left pointer and increment right pointer by left+1
	 *               
	 * Time complexity-->O()             
	 * 
	 * Space complexity-->O(n)             
	 *               
	 *                         
	*/

	private int[] countDays(int[] temp) {

		int[] days = new int[temp.length];

		int left = 0;
		int right = 1;
		int diff = 0;

		while (left < right && right < temp.length) {

			if (temp[left] < temp[right]) {
				diff = right - left;
				days[left] = diff;
				left++;
				right = left + 1;

				diff = 0;
			}

			else if (temp[left] >= temp[right] && right != temp.length - 1)
				right++;

			else if (temp[left] > temp[right] && right == temp.length - 1) {
				days[left] = 0;
				left++;
				right = left + 1;

			}

		}

		System.out.println(Arrays.toString(days));

		return days;

	}

}
