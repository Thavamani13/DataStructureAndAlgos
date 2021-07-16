package dailychallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class P23_MoveALLOddToRight {

	/**
	 * 
	 * 
	 * 
	 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 * 
	 * What is the input(s)? intarr[] What is the expected output? intarr[] Do I
	 * have constraints to solve the problem? Do I have all informations to go to
	 * next step!! How big is your test data set will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions
	 * 
	 * Positive : [0,1,2,3,4,5,7,96,12,18] Negative: [2,4,8,12,78]
	 * Edge:[42,56,13,17]
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
	 * 
	 * 
	 * 
	 */

	@Test
	public void testcase1() {

		int[] intarr = { 0, 1, 2, 3, 4, 5, 7, 96, 12, 18 };
		Assert.assertArrayEquals(new int[] { 0, 96, 2, 18, 4, 12, 7, 5, 3, 1 }, moveTorightSideUsingTwoPointer(intarr));

	}

	@Test
	public void testcase2() {

		int[] intarr = { 2, 4, 8, 12, 78 };
		Assert.assertArrayEquals(new int[] { 2, 4, 8, 12, 78 }, moveTorightSideUsingTwoPointer(intarr));

	}

	@Test
	public void testcase3() {

		int[] intarr = { 42, 56, 13, 17 };
		Assert.assertArrayEquals(new int[] { 56, 42, 17, 13 }, moveTorightSideUsingTwoPointer(intarr));

	}

	@Test
	public void testcase4() {

		int[] intarr = { 0, 1, 4, 3, 7 };
		Assert.assertArrayEquals(new int[] { 0, 4, 3, 1, 7 }, moveTorightSideUsingTwoPointer(intarr));

	}

	/*
	 * Loop through the given array find each number is odd
	 * 
	 * If it is oddd add in a seperate list , even add it in seperate list
	 * 
	 * Merge both list at the end of the iteration.
	 * 
	 * 
	 */

	private Integer[] moveTORightSide(int[] intarr) {

		List<Integer> oddlist = new ArrayList<Integer>();

		List<Integer> evenlist = new ArrayList<Integer>();

		for (int i = 0; i < intarr.length; i++) {

			if (intarr[i] % 2 != 0) {

				oddlist.add(intarr[i]);
			} else {

				evenlist.add(intarr[i]);
			}
		}

		System.out.println(evenlist.addAll(oddlist));

		return (Integer[]) evenlist.toArray();

	}

	/*
	 * sort the array Left pointer starts from 0th index and Right Pointer starts at
	 * the end of the array
	 * 
	 * If the left pointer points to even value keep moving the left pointer ,
	 * 
	 * If the left pointer points to the odd value and right pointer also points to
	 * the odd value decrement the right .
	 * 
	 * If left pointer points to odd value , swap the value between left and right
	 * pointers, keep moving the both pointers . *
	 * 
	 * 
	 */

	private int[] moveTorightSideUsingTwoPointer(int[] intarr) {

		Arrays.sort(intarr);

		int left = 0;
		int right = intarr.length - 1;

		while (left < right) {

			if (intarr[left] % 2 != 0 && intarr[right] % 2 == 0) {
				int temp = intarr[left];
				intarr[left] = intarr[right];
				intarr[right] = temp;

				left++;
				right--;
			}

			else if (intarr[left] % 2 != 0 && intarr[right] % 2 != 0) {

				right--;
			}

			else {
				left++;
			}

		}

		System.out.println(Arrays.toString(intarr));

		return intarr;

	}

}
