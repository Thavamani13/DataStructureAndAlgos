package dailychallenge;

import org.junit.Assert;
import org.junit.Test;

public class CW01_TwoSUmUsingTwoPointer {

	/*
	 * Two pointer in opposite direction works effectively for the Sorted Array.
	 * 
	 * Conditions: leftpointer-->starts at 0th index , Right Pointer starts at last
	 * index
	 * 
	 * Case1: If LEFT +RIGHT ==SUM return indeces
	 * 
	 * Case2: If LEFT +RIGHT < sum a.MOve Left towards right ----> left++ Increment
	 * left *
	 * 
	 * Case3: If LEFT +RIGHT >SUM a.Move RIGHT towards left ----> right-- Decrement
	 * Right
	 * 
	 * 
	 * End the loop if Both pointer meets at same index [left<=right]
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
		int[] arr = { 1, 4, 5, 8, 11, 12, 16, 21 };
		int target = 19;

		Assert.assertArrayEquals(new int[] { 3, 4 }, findTwoSumUsingTwoPointer(arr, target));
	}

	@Test
	public void testcase2() {
		int[] arr = { 1, 4, 5, 8, 11, 12, 16, 21 };
		int target = 10;

		Assert.assertArrayEquals(new int[] { 2, 2 }, findTwoSumUsingTwoPointer(arr, target));
	}

	@Test
	public void testcase3() {
		int[] arr = { 1, 4, 5, 8, 11, 12, 16, 21 };
		int target = 42;

		Assert.assertArrayEquals(new int[] { 7, 7 }, findTwoSumUsingTwoPointer(arr, target));
	}

	@Test
	public void testcase4() {
		int[] arr = { 1, 4, 5, 8, 11, 12, 16, 21 };
		int target = 2;

		Assert.assertArrayEquals(new int[] { 0, 0 }, findTwoSumUsingTwoPointer(arr, target));
	}

	@Test
	public void testcase5() {
		int[] arr = { 1, 4, 5, 8, 11, 12, 16, 21 };
		int target = 45;

		Assert.assertArrayEquals(new int[] { -1, -1 }, findTwoSumUsingTwoPointer(arr, target));
	}

	/*
	 * Time complexity -> Bestcase --> O(1) ,Average-->O(n/2), Worst -->O(n) Not
	 * more than O(n) for sure
	 * 
	 * Space Complexity--> O(1) since we use one variable
	 */

	private int[] findTwoSumUsingTwoPointer(int[] arr, int target) {

		int left = 0, right = arr.length - 1;

		while (left <= right) {

			if (arr[left] + arr[right] == target) {

				return new int[] { left, right };
			}

			else if (arr[left] + arr[right] < target)

				left++;

			else
				right--;

		}

		return new int[] { -1, -1 };
	}

}