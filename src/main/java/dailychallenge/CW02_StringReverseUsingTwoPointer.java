package dailychallenge;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class CW02_StringReverseUsingTwoPointer {

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

		String s = "Hello";
		Assert.assertEquals("olleH", findReverseString(s));

	}

	/*
	 * Time complexity --> COnverting to chararray --> O(n), it also takes space
	 * complexity of O(n) as it creates a copy of String
	 * 
	 * Swapping till reaches the mid point --> O(n/2)
	 * 
	 * Time complexity -->O(n) -->Space complexity -->O(n)
	 * 
	 */
	private String findReverseString(String s) {

		char[] chararr = s.toCharArray();

		int left = 0, right = chararr.length - 1;

		while (left != right) {

			char temp = chararr[right];
			chararr[right] = chararr[left];
			chararr[left] = temp;

			left++;
			right--;

		}

		String reversestr = String.valueOf(chararr);
		System.out.println(reversestr);

		return reversestr;
	}

}
