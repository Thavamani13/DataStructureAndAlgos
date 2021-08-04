package stack;

import java.util.Stack;

import org.junit.Test;

import junit.framework.Assert;

public class P07_InfixToPostFix {

	/*
	 * https://www.techgig.com/practice/question /infix-to-postfix/
	 * ZTZSVU1QdHlHYnkrRXFXV2pkQXJ0M00zM1hZOHExSkpzemlqT2VnbWVlZk9oN0R3M2FCVVIxK2pzd0NwMEpSbg
	 * ==/1
	 *
	 *
	 *
	 */


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
	   Positive :
	   Negative :
	   Edge :
	 *
	 *
	 * Approaches :

	 *
	 *
	 *
	 */


	@Test
	public void testcase1() {
		String input="c^d-e";
		Assert.assertEquals("cd^e-", convertToPostFix(input));
	}

	@Test
	public void testcase2() {
		String input="^c^d";
		Assert.assertEquals("c^d^", convertToPostFix(input));
	}

	@Test
	public void testcase3() {
		String input="^d";
		Assert.assertEquals("d^", convertToPostFix(input));
	}




	/*Define a stack , output string
	 * Push each character from string to stack
	 *          1.if stack is empty, peek element is alpha character --> push to stack
	 *          2.if the peek element is special character[!is letter or digit] and input element is alpha character
	 *                         pop the peak element and save it in  temp character
	 *                         push  the incoming character to stack
	 *                         push the  temp character to stack
	 *
	 *         3. if both peek element and incoming character is also special character ,  push the incoming character to stack .
	 *
	 *
	 * return reverse ;
	 *
	 * time complexity-->  O(n)   + O(n)  +O(n) , space O(n)
	 *
	 *
	 * optimize the reversal part
	 *
	 *
	 *
	 * !Character.isLetterOrDigit(stack.peek())--> special character
	 *
	 * stack.peek().isAlphabetic(stack.peek())--->alpha character
	 *
	 *
	 *
	 *
	 *
	 * */
	private String convertToPostFix(String input) {
		String poppedstr = "";
		String output = "";
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < input.length(); i++) {
			char charrr = input.charAt(i);

			if (stack.isEmpty() || stack.peek().isAlphabetic(stack.peek())) {
				stack.push(charrr);
			} else if ((!Character.isLetterOrDigit(stack.peek()) && Character.isAlphabetic(charrr))
					|| ((!Character.isLetterOrDigit(stack.peek()) && Character.isAlphabetic(charrr)))) {
				char temp = stack.pop();
				stack.push(charrr);
				stack.push(temp);
			} else if ((!Character.isLetterOrDigit(stack.peek()) && !Character.isLetterOrDigit(charrr))
					|| (!Character.isLetterOrDigit(stack.peek()) && !Character.isLetterOrDigit(charrr))) {
				stack.push(charrr);
			}

		}

		System.out.println(stack);
		int size = stack.size();
		for (int i = 0; i < size; i++) {
			poppedstr += stack.pop();
		}
		System.out.println(poppedstr);

		for (int i = poppedstr.length() - 1; i >= 0; i--) {
			output += poppedstr.charAt(i);
		}

		System.out.println(output);

		return output;

	}

}
