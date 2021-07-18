package dailychallenge;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class P22_BookStoreGrumpy {

	/*
	 * Today, the bookstore owner has a store open for customers.length minutes.
	 * Every minute, some number of customers (customers[i]) enter the store, and
	 * all those customers leave after the end of that minute. On some minutes, the
	 * bookstore owner is grumpy. If the bookstore owner is grumpy on the i-th
	 * minute, grumpy[i] = 1, otherwise grumpy[i] = 0. When the bookstore owner is
	 * grumpy, the customers of that minute are not satisfied, otherwise they are
	 * satisfied. The bookstore owner knows a secret technique to keep themselves
	 * not grumpy for X minutes straight, but can only use it once. Return the
	 * maximum number of customers that can be satisfied throughout the day.
	 * 
	 * Example 1: Input: customers = [1,0,1,2,1,1,7,5], grumpy = [0,1,0,1,0,1,0,1],
	 * X = 3 Output: 16 Explanation: The bookstore owner keeps themselves not grumpy
	 * for the last 3 minutes. The maximum number of customers that can be satisfied
	 * = 1 + 1 + 1 + 1 + 7 + 5 = 16.
	 */

	/**
	 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 * 
	 * Firstly We have to find the max sum of 3 consecutive numbers
	 * 
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
		int[] customs = { 1, 0, 1, 2, 1, 1, 7, 5 };
		int[] grumpy = { 0, 1, 0, 1, 0, 1, 0, 1 };

		int x = 3;

		findMaximumSatisfiedCustomers(customs, grumpy, x);

	}

	private void findMaximumSatisfiedCustomers(int[] customs, int[] grumpy, int x) {

		int customsum = 0; int output = 0;

		//Try to find the satisfied customers for the given condition . 
		for (int i = 0; i < customs.length; i++) {

			if (grumpy[i] == 0) {
				customsum = customs[i] + customsum;
			}
		}

		int currentwindowsum = 0;	
		
		/*
		 * //Find the no. of customers who will get satisfied , if the he is not grumpy
		 * 
		 * Consider a window is all zero , find the sum of current window . 
		 * 
		 * We have to consider  1 as zero and find sum . Exclude 
		 * Zeros because we have already used that to find the sum for the default condition.
		 * Since ,we have used 0 to find the sum
		 * for given condition.
		 * 
		 * 
		 */
		for (int i = 0; i < customs.length - 2; i++) {
			for (int j = i; j < (i + x) && j < grumpy.length; j++) {
				if (grumpy[j] == 1) {
					currentwindowsum = customs[j] + currentwindowsum;
				}
				output = currentwindowsum + customsum;
			}

			currentwindowsum = 0;

			int max = Integer.MIN_VALUE;

			System.out.println(Integer.max(max, output));

		}

	}

}
