package dailychallenge;

import org.junit.Test;

public class P01_ReverseInteger {

	/**
	 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 * 
	 * We have to reverse the given integer
	 * 
	 * What is the input(s)? What is the expected output?
	 * 
	 * Input-->int a , output--> int b
	 * 
	 * Do I have constraints to solve the problem?
	 * 
	 * Range of integer ,
	 * 
	 * Do I have all informations to go to next step!! How big is your test data set
	 * will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions
	 * 
	 * Positive case: positive integer
	 * 
	 * Negative case: Negative integer
	 * 
	 * Edge case: Integer with single digit . *
	 * 
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
	 * Approach 2: Write down the options and benefits and code the best* 
	 * 
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

		int x = 101;

		reverseUsingBruteForce(x);
	}

	@Test
	public void testcase2() {

		int x = 123;

		reverseUsingBruteForce(x);
	}

	@Test
	public void testcase3() {

		int x = -48;

		reverseUsingBruteForce(x);
	}

	@Test
	public void testcase4() {

		int x = 1000;

		reverseUsingBruteForce(x);
	}

	private int reverseUsingBruteForce(int x) {

		int temp = x;

		int reverse = 0;

		while (x != 0) {
			int reminder = x % 10;
			reverse = (reverse * 10) + reminder;
			x = x / 10;
		}

		System.out.println("Reversed Integer" + reverse);
		return reverse;

	}

}
