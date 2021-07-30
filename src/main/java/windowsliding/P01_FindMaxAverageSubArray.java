package windowsliding;

import org.junit.Assert;
import org.junit.Test;

public class P01_FindMaxAverageSubArray {
	
	/*
	 * You are given an integer array nums consisting of n elements, and an integer k.
		Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.
		
		 
		
		Example 1:
		
		Input: nums = [1,12,-5,-6,50,3], k = 4
		Output: 12.75000
		Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
		Example 2:
		
		Input: nums = [5], k = 1
		Output: 5.00000
		
		https://leetcode.com/problems/maximum-average-subarray-i/		
		
		
	 * 
	 */
	
	/**
	 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 * 
	 * What is the input(s)?
       What is the expected output? 
	   Do I have constraints to
	 * solve the problem? 
	   Do I have all informations to go to next step!! How big is
	 * your test data set will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions
	   Positive :
	   Negative :
	   Edge :
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
		int[] input = {1,12,-5,-6,50,3};
		int k = 4;
		 Assert.assertTrue(findMaxAverage(input,k) == 12.75000);	
		
	}
	
	@Test
	public void testcase2() {
		int[] input = {5};
		int k = 1;
		 Assert.assertTrue(findMaxAverage(input,k) ==5.000);	
		
	}
	
	
	
	
	/*Declare double variable sum , currentsum 
	 *Traverse from 0th index to target index 
	 *   Find the initial sum of the window
	 *   
	 * Assign the sum value to Current sum , traverse from target to end of the loop
	 * 
	 * Add the next element value and drop the first element value 
	 * Keep a track on Max between sum and Current sum 
	 * 
	 * Return the average
	 * 
	 *    
	 * Time complexity --> O(n) .. Space -->O(1)	
	*/
	private double findMaxAverage(int[] input, int k) {
		
		double sum=0 , currentsum=0; 
		
		for (int i = 0; i <k; i++) {			
			sum = sum+input[i];
		}
		
		currentsum = sum;
		
		for (int i = k; i < input.length; i++) {
			currentsum = currentsum+input[i]-input[i-k];
			sum=Math.max(sum, currentsum);
		}
		
		System.out.println(sum/k);
		return sum/k;
	}	

}
