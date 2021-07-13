package dailychallenge;

import org.junit.Assert;
import org.junit.Test;

public class P06_PalindromeInteger {

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

		int x = 121;
		Assert.assertEquals(true, isPalindromeOrNotUsingBruteForce(x));

	}

	@Test
	public void testcase2() {

		int x = -478;
		Assert.assertEquals(false, isPalindromeOrNotUsingBruteForce(x));

	}

	@Test
	public void testcase3() {

		int x = -898;
		Assert.assertEquals(true, isPalindromeOrNotUsingBruteForce(x));

	}

	@Test
	public void testcase4() {

		int x = 0;
		Assert.assertEquals(true, isPalindromeOrNotUsingBruteForce(x));

	}

	private boolean isPalindromeOrNotUsingBruteForce(int x) {

		int temp = x;
		int reverse = 0;

		if (x >= 0 && x <= 9)
			return true;

		while (x != 0) {
			int reminder = x % 10;
			reverse = (reverse * 10) + reminder;
			x = x / 10;
		}

		System.out.println(reverse);

		if (reverse == temp) {
			return true;
		}

		return false;

	}

}
