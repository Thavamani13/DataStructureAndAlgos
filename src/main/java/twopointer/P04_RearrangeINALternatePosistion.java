package twopointer;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class P04_RearrangeINALternatePosistion {

	/*
	 * array of nums, contains equal no of positve and negative, rearrange in an
	 * order +ve and then -ve in alternate positions. Constraint: cannot use extra
	 * space eg : int[] input = {12, -90, -100, 15, 98, 99, -56, -2}; expected
	 * output {12, -90, 15, -100, 98,-56,99,-2}
	 */
	
	/**
	 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 * 
	 * What is the input(s)? intarr[]
       What is the expected output? intarr[]
	   Do I have constraints to
	 * solve the problem? 
	 * 
	 * DOnt use extra space
	   Do I have all informations to go to next step!! How big is
	 * your test data set will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions
	   Positive : mix up of positive and negative numbers
	   Negative :FIrst half of the arrays are postive / FIrst half of the arrays are Negative
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
		int[] intarr = { 12, -90, -100, 15, 98, 99, -56, -2 };
		Assert.assertArrayEquals( new int[] {12, -90, 15, -100, 98, -56, 99, -2}, rearrangeUsingTwoPointer(intarr));
	}

	@Test
	public void testcase2() {
		int[] intarr = { -25, -90, -100, 40, 50, 60 };
		Assert.assertArrayEquals( new int[] {40, -90, 60, -25, 50, -100}, rearrangeUsingTwoPointer(intarr));
	}

	@Test
	public void testcase3() {
		int[] intarr = { 25, 90, 100, -40, -50, -60 };
		Assert.assertArrayEquals( new int[] {25, -50, 100, -40, 90, -60}, rearrangeUsingTwoPointer(intarr));
	}
	
	@Test
	public void testcase4() {
		int[] intarr = {-25, 90, -100, 40, -50, 60 };
		Assert.assertArrayEquals( new int[] {90, -25, 40, -100, 60, -50}, rearrangeUsingTwoPointer(intarr));
	}
	
	
	
	

	/* Keep left pointer-->even index  , right pointer-->odd index
	 * if the even index value is postive .. move left+2
	 * If the odd  index value is negtaive ..moe right+2
	 * if even index value is negative and odd index value is postive , swap the values between them and increment left / right
	 * If both are positive--> move left alone
	 * If both are negative -->moev right alone
	 * 
	
	
	 Time complexity --> O(n) Space Complexity--> O(1)
	
	
	*/

	private int[] rearrangeUsingTwoPointer(int[] intarr) {
		
		
		if (intarr.length<2) throw  new RuntimeException("Invalid input");		

		int left = 0;
		int right = 1;
		
		while (left < intarr.length - 1 && right < intarr.length) {

			if (intarr[left] > 0)				
				left+=2;					    

			else if (intarr[right] < 0)
				right+=2;

			else if (intarr[left] < 0 && intarr[right] > 0) {

				int temp = intarr[left];
				intarr[left] = intarr[right];
				intarr[right] = temp;

				left+=2;//even index
				right+=2;//odd index

			}

			else if (intarr[left] > 0 && intarr[right] > 0)
				left +=2;

			else if (intarr[left] < 0 && intarr[right] < 0)
				right+=2;

		}

		System.out.println(Arrays.toString(intarr));
		return intarr;
	}

}
