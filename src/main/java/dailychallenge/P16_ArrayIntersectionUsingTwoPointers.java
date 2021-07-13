package dailychallenge;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class P16_ArrayIntersectionUsingTwoPointers {

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
		int[] arr1 = { 1, 2, 6, 7 };
		int[] arr2 = { 2, 1 };

		Assert.assertArrayEquals(new int[] { 1, 2 }, findInterSectionUsingTwoPointers(arr1, arr2));
	}

	private int[] findInterSectionUsingTwoPointers(int[] arr1, int[] arr2) {

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		int left = 0, right = 0;
		int[] newarr = new int[2];

		int index = 0;

		while (left < arr1.length && right < arr2.length) {

			if (arr1[left] < arr2[right]) {
				left++;
			} else if (arr1[left] == arr2[right]) {
				newarr[index] = arr1[left];

				left++;
				right++;

				index++;
			}

			else {
				right++;
			}

		}
		System.out.println(Arrays.toString(newarr));
		return newarr;

	}
}
