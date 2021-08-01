package queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Stack;

import org.junit.Test;

public class P01_ReverseArrayk {

	/*
	 * reverse elements k int[] intarr= {2,4,6,8,10}; output=[6,4,2,8,10]
	 */

	/**
	 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 *
	 * What is the input(s)? intarr[] What is the expected output? intarr[] Do I
	 * have constraints to solve the problem
	 *
	 * use quue/ stack
	 *
	 *
	 * Do I have all informations to go to next step!! How big is your test data set
	 * will be?
	 *
	 * 2) Test data set
	 *
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions Positive : k<
	 * arraysize Negative : k == arraysize Edge : empty array
	 *
	 *
	 * Approaches :
	 *
	 *
	 *
	 *
	 */
	@Test
	public void testcase1() {
		int[] intarr = { 2, 4, 6, 8, 10 };
		int k = 3;
	}

	@Test
	public void testcase2() {
		int[] intarr = { 2, 4, 6, 8, 10 };
		int k = 5;
		reverseArrayUsingQueue(intarr, k);
	}

	@Test
	public void testcase3() {
		int[] intarr = {};
		int k = 3;
		reverseArrayK(intarr, k);
	}

	@Test
	public void testcase4() {
		int[] intarr = { 1, 5, 6, 7 };
		int k = 5;
		reverseArrayK(intarr, k);
	}



	/*traverse through the given array till k-1 and add it to stack
	 * traverse through the given array
	 *          if the index is less than k , pop the value from stack and assign it to the index value
	 *          if greater leave the array with the default value
	 * time complexity--> O(n)	, space -->O(n)

	*/

	private int[] reverseArrayK(int[] intarr, int k) {

		if (k > intarr.length && intarr.length != 0)
			throw new RuntimeException("invalid input");

		if (intarr.length == 0 && k > 0)
			return new int[] {};

		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < k; i++) {
			stack.push(intarr[i]);
		}
		for (int i = 0; i < intarr.length; i++) {
			if (i < k) {
				intarr[i] = stack.pop();
			}
		}
		System.out.println(Arrays.toString(intarr));
		return intarr;

	}

	/*traverse through the given array and add it to the queue if index is lesser than k
	 * traverse through the given array
	 *                if the  index is lesser than k, assign the value from Queue [from last]
	 *                else leave the array as it is .
	 *






	*/
	private int[] reverseArrayUsingQueue(int[] intarr, int k) {
		ArrayDeque<Integer> arrdeq= new ArrayDeque<Integer>();

		for (int i = 0; i <k; i++) {
			arrdeq.offer(intarr[i]);
		}

		for (int i = 0; i < intarr.length; i++) {
			if(i<k) intarr[i]=arrdeq.pollLast();
		}
		System.out.println(Arrays.toString(intarr));
		return intarr;



	}
}