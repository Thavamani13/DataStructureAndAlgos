package stack;

import java.util.Stack;

import org.junit.Test;

import junit.framework.Assert;

public class P06_ReverseString {
	/**
	 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 *
	 * What is the input(s)? string
       What is the expected output?  string
	   Do I have constraints to
	 * solve the problem?
	   Do I have all informations to go to next step!! How big is
	 * your test data set will be?
	 *
	 * 2) Test data set
	 *
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions
	   Positive : valid string , string with special character , numbers, numbers alone , special characters alone
	   Negative :
	   Edge :single character , empty string
	 *
	 *
	 * Approaches :	using stack

	 *
	 *
	 *
	 */

	@Test
	public void testcase1() {
		String input="abcde";
		Assert.assertEquals("edcba", reverseUsingStack(input));

	}

	@Test
	public void testcase2() {
		String input="aaaa";
		Assert.assertEquals("aaaa", reverseUsingStack(input));

	}

	@Test
	public void testcase3() {
		String input="abc789";
		Assert.assertEquals("987cba", reverseUsingStack(input));

	}
	@Test
	public void testcase4() {
		String input="!89asQ";
		Assert.assertEquals("Qsa98!", reverseUsingStack(input));

	}

	@Test
	public void testcase5() {
		String input="";
		Assert.assertEquals("", reverseUsingStack(input));

	}

	@Test
	public void testcase6() {
		String input="a";
		Assert.assertEquals("a", reverseUsingStack(input));

	}

	/*Define the stack , traverse through the string push the elements into the stack
	 *
	 * Define a output string , pop the elements from the  stack and append with the output string , return output string
	 *
	 * time complexity-->O(n) +O(m)
	 * space -->O(n)

	*/
	private String reverseUsingStack(String input) {

		if (input.length() <= 1)
			return input;

		String output = "";
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < input.length(); i++) {
			char chharr = input.charAt(i);
			stack.push(chharr);
		}

		int size = stack.size();
		for (int i = 0; i < size; i++) {
			output += stack.pop();
		}

		System.out.println(output);
		return output;

	}

}
