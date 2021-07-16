package dailychallenge;

import org.junit.Test;

public class P21_CaloriesCalculation {

	/*
	 * A dieter consumes calories[i] calories on the i-th day. For every consecutive
	 * sequence of k days, they look at T, the total calories consumed during that
	 * sequence of k days: If T < lower, they performed poorly on their diet and
	 * lose 1 point; If T > upper, they performed well on their diet and gain 1
	 * point; Otherwise, they performed normally and there is no change in points.
	 * Return the total number of points the dieter has after all calories.length
	 * days.
	 * 
	 * Note that: The total points could be negative.
	 * 
	 * Example 1: Input: calories = [1,2,3,4,5], k = 1, lower = 3, upper = 3 Output:
	 * 0 Explaination: calories[0], calories[1] < lower and calories[3], calories[4]
	 * > upper, total points = 0.
	 * 
	 * Example 2: Input: calories = [3,2], k = 2, lower = 0, upper = 1 Output: 1
	 * Explaination: calories[0] + calories[1] > upper, total points = 1.
	 * 
	 * Example 3: Input: calories = [6,5,0,0], k = 2, lower = 1, upper = 5 Output: 0
	 * Explaination: calories[0] + calories[1] > upper, calories[2] + calories[3] <
	 * lower, total points = 0.
	 */

	/**
	 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 * 
	 * Since we have to solve this by SlideWindow . We have to take k into
	 * consideration for window size.
	 * 
	 * Add the sum of Calories for the K consecutive Days and compare the result
	 * with the boundary conditions [Upper and lower]
	 * 
	 * Calculate the points *
	 * 
	 * 
	 * What is the input(s)? int[] , int k , int upper and int lower, What is the
	 * expected output? int points Do I have constraints to solve the problem? Do I
	 * have all informations to go to next step!! How big is your test data set will
	 * be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions
	 * 
	 * Positive:Conatins all boundary conditions[Increase , decrease points and no
	 * change] Negative: EdgeCase:
	 * 
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
		int calories[] = { 1, 2, 3, 4, 5 };
		int k = 1;
		int lower = 3, upper = 3;

		findPointsByWindowSliding(calories, k, upper, lower);
	}

	@Test
	public void testcase2() {
		int calories[] = { 3, 2 };
		int k = 2;
		int lower = 0, upper = 1;

		findPointsByWindowSliding(calories, k, upper, lower);
	}

	@Test
	public void testcase3() {
		int calories[] = { 6, 5, 0, 0 };
		int k = 2;
		int lower = 1, upper = 5;

		findPointsByWindowSliding(calories, k, upper, lower);
	}

	/*
	 * loop through the given array upto index k Find the sum of the initial window
	 * -- > Compare with the lower , higher values and Calculate points and keep a
	 * track of it
	 *
	 * Move the window , follow the above steps to get the sum of current window and
	 * Calculate the points based on codition.
	 * 
	 * Iterate the process till the end of the loop . Return --> Points at the end
	 * of iteration
	 * 
	 * 
	 * 
	 * 
	 *
	 * 
	 * 
	 */

	private int findPointsByWindowSliding(int[] calories, int k, int upper, int lower) {

		int windowsum = 0, points = 0;

		for (int i = 0; i < k; i++) {
			windowsum = windowsum + calories[i];
		}

		if (windowsum < lower) {
			points = points - 1;
		}

		else if (windowsum > upper) {
			points = points + 1;
		}

		for (int i = k; i < calories.length; i++) {

			windowsum = windowsum + calories[i] - calories[i - k];

			if (windowsum < lower) {
				points = points - 1;
			} else if (windowsum > upper) {
				points = points + 1;
			}

		}

		System.out.println(points);
		return points;

	}

}
