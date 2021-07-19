package binarySearch;

import org.junit.Test;

import junit.framework.Assert;

public class P02_FindSquareRoot {

	/*
	 * Find the Square root of the given number
	 * 
	 * Example . N=16 -->Output 4
	 * 
	 * N--14=-->Output -->3Square 9 less than 14 and 4Square 16 greater than 14
	 * -->So 3 is the answer
	 * 
	 * https://docs.google.com/spreadsheets/d/1pjtfZu9at0bjmc5EKn_ce34itQeapfGkDZL24NYpAZg/edit#gid=0
	 *
	 * 
	 */

	/**
	 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 * 
	 * Return the square root of the given number.
	 * 
	 * What is the input(s)? int a What is the expected output? int squareroot Do I
	 * have constraints to solve the problem?
	 * 
	 * -->Sovle it using O(logn)
	 * 
	 * Do I have all informations to go to next step!! How big is your test data set
	 * will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions 
	 * Positive :Exact  square root
	 * Negative : Not exact square root , return the previous least
	 * sqaure root of given num 
	 * Edge :Number less than 0
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
		int a = 25;
		Assert.assertEquals(5, findSquareRootUsingBS(a));

	}

	@Test
	public void testcase2() {
		int a = 21;
		Assert.assertEquals(4, findSquareRootUsingBS(a));
	}

	@Test
	public void testcase3() {
		int a = -25;
		Assert.assertEquals(-1, findSquareRootUsingBS(a));
	}

	
	/*
	
	
	
	*/
	private int findSquareRootUsingBS(int a) {

		if (a < 0)
			throw new RuntimeException("Invalid Number") ;
		if (a < 1)
			return 1;
		int low = 0, high = a / 2;

		int mid = 0;

		while (low <= high) {
			mid = (low + high) / 2;

		    if (mid * mid == a) return mid;

			else if (mid * mid > a) high = mid + 1;
			else if (mid * mid < a) low = mid + 1;
			else return mid;

		}

		return high;

	}
}