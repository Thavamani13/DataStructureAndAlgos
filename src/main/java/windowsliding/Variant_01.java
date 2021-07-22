package windowsliding;

import org.junit.Test;

import junit.framework.Assert;

public class Variant_01 {
	
	/**
	 * Find the max sum subarray of a fixed size K
	 *
	 * Example input:
	 * [4, 2, 1, 7, 8, 1, 2, 8, 1, 0]
	 * 
	 * K=3
	 * 
	 * DEFINED WINDOW SIZE
	 *
	 */
	
	/**
	 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 * 
	 * What is the input(s)? intarr[] int target
       What is the expected output? int 
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
		int[] intarr= {4, 2, 1, 7, 8, 1, 2, 8, 1, 0};
		int k =3;
		
		Assert.assertEquals(16, findMaxSubArray(intarr,k));
		
	}
	
	
	/*find the sum of elements till it reaches the window size K.
	 *Once it reaches , find the MAX between the windowSUm and Your maxsum . Keep the MaxSum .
	 *Drop the first element .
	
	
	*/
	private int findMaxSubArray(int[] intarr, int k) {
		
		int maxSum=Integer.MIN_VALUE;
		int windowSum=0;
		
		for (int i = 0; i < intarr.length; i++) {
			 windowSum +=intarr[i];
			 
			 if(i>=k-1) {
				 maxSum=Math.max(maxSum, windowSum);
				 windowSum-=intarr[i-(k-1)];
			 }
		}
		
		return maxSum;
		
	}
	
	
	
	
	
	
	
	
	

}
