package dailychallenge;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class P17_ThreePointerTechnique {

	/*
	 * Given an array nums with n objects colored red, white, or blue, sort them
	 * in-place so that objects of the same color are adjacent, with the colors in
	 * the order red, white,4 and blue.
	 * 
	 * We will use the integers 0, 1, and 2 to represent the color red, white, and
	 * blue, respectively. You must solve this problem without using the library's
	 * sort function.
	 * 
	 * Input: nums = [2,0,2,1,1,0] Output: [0,0,1,1,2,2]
	 * 
	 * Input: nums = [2,0,1] Output: [0,1,2]
	 * 
	 * Input: nums = [0] Output: [0]
	 * 
	 * 
	 * 
	 */

	/**
	 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 * 
	 * What is the input(s)? What is the expected output? Do I have constraints to
	 * solve the problem? Do I have all informations to go to next step!! How big is
	 * your test data set will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions
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
	 */

	@Test
	public void testcase1() {
		int[] arr = { 2, 0, 2, 1, 1, 0 };
		Assert.assertArrayEquals(new int[] { 0, 0, 1, 1, 2, 2 }, sortUsingThreePointer(arr));

	}
	
	@Test
	public void testcase2() {
		int[] arr = { 2, 0, 2, 1, 1, 0 ,0,2};
		Assert.assertArrayEquals(new int[] { 0, 0,0,1, 1, 2, 2,2 }, sortUsingThreePointer(arr));

	}

	/*
	 * Time complexity --> Less than O (n)
	 * 
	 * Space complexity-->O(1)
	 * 
	 * psuedo code:
	 * 
	 * Low and mid poits to zero'th index and high will point towards the last element
	 * 
	 * Conditiions : 
	 * if the current index points to 0, swap low and mid , increment low and mid
	 * If the curent index points to 1, increment mid 
	 * If the current index points to 2 , swap mid and high --> decrement high 	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	private int[] sortUsingThreePointer(int[] arr) {

		int low = 0, mid = 0, high = arr.length - 1;

		while (mid < high) {

			if (arr[low] == 2 && arr[mid] == 2) {

				int temp = arr[high];
				arr[high] = arr[mid];
				arr[mid] = temp;

				high--;

			}

			else if (arr[low] == 0 && arr[mid] == 0) {

				int temp = arr[mid];
				arr[mid] = arr[low];
				arr[low] = temp;

				low++;
				mid++;

			}

			else
				mid++;

		}

		System.out.println(Arrays.toString(arr));
		return arr;

	}

}
