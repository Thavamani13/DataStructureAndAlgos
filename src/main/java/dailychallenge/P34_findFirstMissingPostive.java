package dailychallenge;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class P34_findFirstMissingPostive {

	/*
	 * Given an unsorted integer array nums, return the smallest missing positive
	 * integer.
	 *
	 * You must implement an algorithm that runs in O(n) time and uses constant
	 * extra space.
	 *
	 * Input: nums = [1,2,0] Output: 3
	 *
	 * Input: nums = [3,4,-1,1] Output: 2 Input: nums = [7,8,9,11,12] Output: 1
	 */

	/**
	 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 *
	 * What is the input(s)? intarr[] What is the expected output? int a Do I have
	 * constraints to solve the problem?
	 *
	 * solve using o(n) and use constant extra space
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
	 * Approaches : Bruteforce
	 *
	 *
	 *
	 *
	 */


	@Test
	public void testcase1() {
		int[] intarr = { 1, 2, 0 };
		findMissingNumber(intarr);

	}


	@Test
	public void testcase2() {
		int[] intarr = { 3, 4, -1, 1 };
		findMissingNumber(intarr);
	}

	@Test
	public void testcase3() {
		int[] intarr = { 7, 8, 9, 11, 12 };
		findMissingNumber(intarr);

	}

	@Test
	public void testcase4() {
		int[] intarr = { 1, 2 };// 3
		findMissingNumber(intarr);

	}

	@Test
	public void testcase5() {
		int[] intarr = { 1 };// 2
		findMissingNumber(intarr);

	}



	private void usingLessSpace(int[] intarr) {

		int j=1;
		for (int i = 0; i < intarr.length; i++) {

		}

	}

















	/*Define arraylist to add the numbers from 1 to  given array [arr.size+1]
	 * Define input arraylist  add elements from array to input array list .
	 *
	 * traverse through the arraylist,
	 *         if input  arraylist does not contains the value from arraylist  return arrlist.get(i);
	 *
	 *
	 * time --> o(n) + o(n) + O(n)
	 *
	 * space-->
	 *
	 *
	*/

	private int findMissingNumber(int[] intarr) {

		List<Integer> arrlist = new ArrayList<Integer>();
		for (int i = 1; i <= intarr.length + 1; i++) {
			arrlist.add(i);
		}


		List<Integer> inputarrlist = new ArrayList<Integer>();
		for (int i = 0; i < intarr.length; i++) {
			inputarrlist.add(intarr[i]);
		}

		for (int i = 0; i < arrlist.size(); i++) {
			if (!inputarrlist.contains(arrlist.get(i))) {
				System.out.println(arrlist.get(i));
				return arrlist.get(i);
			}

		}
		return 1;

	}

}
