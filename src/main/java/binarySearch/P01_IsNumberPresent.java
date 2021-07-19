package binarySearch;

import org.junit.Test;

import junit.framework.Assert;

public class P01_IsNumberPresent {

	/*
	 * Find the given target element is available or not in the given array .
	 * 
	 * If avaialable return true , not--> return false
	 * 
	 * example : Input: arr = [2,5,3,10] Output: true Explanation: N = 10
	 * 
	 */

	/**
	 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 * 
	 * If the target element available -->return true . If not-->return false
	 * 
	 * What is the input(s)? intarr[] , int k 
       What is the expected output? boolean
	   Do I have constraints to
	 * solve the problem? 
	 * Solve it using O(logn)
	   Do I have all informations to go to next step!! How big is
	 * your test data set will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions
	   Positive :Given element is available
	   Negative :Given element is not available
	   Edge :Null array 
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
		int[] intarr = { 2, 5, 3, 10 };
		int k = 10;
		Assert.assertEquals(true, findElementUsingBS(intarr, k));
	}
	@Test
	public void testcase2() {
		int[] intarr = { 2, 5, 3, 10 };
		int k = 15;
		Assert.assertEquals(false, findElementUsingBS(intarr, k));
	}
	@Test
	public void testcase3() {
		int[] intarr = {};
		int k = 10;
		Assert.assertEquals(false, findElementUsingBS(intarr, k));
	}
	@Test
	public void testcase4() {
		int[] intarr = {5};
		int k = 5;
		Assert.assertEquals(true, findElementUsingBS(intarr, k));
	}


	
	/*low-->0 , right--arrlen-1, mid =low+high/2.
	 * if mid ==target-->return true
	 * if mid < target, move low-->mid+1
	 * if mid >target , move high--->mid-1
	
	
	*/
	private boolean findElementUsingBS(int[] intarr, int k) {
		
		
		if (intarr.length==0) return false;
		
		if (intarr.length==1&& intarr[0] ==k) return true;
		
		int low = 0, high = intarr.length - 1;
		int mid = 0;

		while (low <= high) {
			mid = (low + high) / 2;

			if (intarr[mid] == k)
				return true;
			else if (intarr[mid] < k)
				low = mid + 1;
			else
				high = mid + 1;

		}

		return false;

	}

}
