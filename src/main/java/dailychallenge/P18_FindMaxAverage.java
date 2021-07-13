package dailychallenge;

import org.junit.Assert;
import org.junit.Test;

public class P18_FindMaxAverage {

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
	 * 
	 * 
	 * 
	 */

	@Test
	public void testcase1() {

		int arr[] = { 1, 12, -5, -6, 50, 3 };
		int target = 4;

		Assert.assertEquals(12.7500, findMaxAverageUsingSlidingWindow(arr, target));
	}

	/*
	 * Find the sum of first window , have it as your first window sum. In the next
	 * window , you will drop the first element from the first window and add the
	 * next element available next to kth position of first window .
	 * 
	 * It can be done through --> Adding the next value and subratcting the first
	 * element value from your current window.
	 * 
	 * Have it as your current sum . Compare the two values and keep the max between
	 * them a
	 * 
	 * Return the max avg --> maxsum /target
	 *
	 * 
	 */

	private double findMaxAverageUsingSlidingWindow(int[] arr, int target) {

		int windowsum = 0;

		for (int i = 0; i < target; i++) {
			windowsum = windowsum + arr[i];
		}

		int currentsum = windowsum;

		for (int i = target; i < arr.length; i++) {
			currentsum = currentsum + arr[i] - arr[i - target];
			windowsum = Math.max(currentsum, windowsum);
		}

		System.out.println(windowsum);

		double result = windowsum / target;

		System.out.println(result);

		return result;

	}

	/*
	
	
	
	
	*/
	public void findMaxAverageByTwoPointer(int[] arr, int target) {

	}

}
