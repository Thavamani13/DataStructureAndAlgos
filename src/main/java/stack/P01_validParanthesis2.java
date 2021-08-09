package stack;

import java.util.Stack;

import org.junit.Test;

import junit.framework.Assert;

public class P01_validParanthesis2 {
	/*
	 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
	 * ']', determine if the input string is valid.
	 *
	 * An input string is valid if:
	 *
	 * Open brackets must be closed by the same type of brackets. Open brackets must
	 * be closed in the correct order.
	 *
	 */


	/**
	 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 *
	 * What is the input(s)? String
       What is the expected output?  boolean
	   Do I have constraints to
	 * solve the problem?
	 *
	 *
	   Do I have all informations to go to next step!! How big is
	 * your test data set will be?
	 *
	 * 2) Test data set
	 *
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions
	   Positive : Contains Balanced Paranthesis
	   Negative :Contains Unbalanced paranthesis
	   Edge :
	 *
	 *
	 * Approaches :	Using Stack

	 *
	 *
	 *
	 */

	@Test
	public void testcase1() {
		String str = "()";
		Assert.assertEquals(true, findValidOrNot(str));
	}
	@Test

	public void testcase2() {
		String str = "()[]{}";
		Assert.assertEquals(true, findValidOrNot(str));

	}
	@Test

	public void testcase3() {
		String str = "(]";
		Assert.assertEquals(false, findValidOrNot(str));

	}

	@Test

	public void testcase4() {
		String str = "";
		Assert.assertEquals(false, findValidOrNot(str));

	}

	@Test

	public void testcase5() {
		String str = "[({()})[]}";
		Assert.assertEquals(false, findValidOrNot(str));

	}

	/*convert the given string to character array .	 *
	 * Define the stack
	 * Iterate through the character array
	 *        if my input character is open bracket push it to stack
	 *        if my input character is closed bracket
	 *                          check the immediate/previous character is closed bracket of same bracket type
	 *                                 if yes-->pop the peak element
	 *                                 if no -->return false
	 *
	 * At the end of the iteration , return true or false based on stack size .
	 *          if it is balanced , stack size will be empty -->true
	 *          if it is not balanced , stack will not be empty --> false
	 *
	 *
	 *
	*/

	private boolean findValidOrNot(String str) {

		if (str.isEmpty())
			throw new RuntimeException("invalid input");

		if(str.length()==1) return false;

	       Stack<Character> stack = new Stack<Character>();

			char[] charArray = str.toCharArray();

			for (int i = 0; i < charArray.length; i++) {
				char inputchar = charArray[i];
				if (inputchar == '{' || inputchar == '[' || inputchar == '(') {
					stack.push(inputchar);
				}
	            else if(stack.isEmpty()){
	                return false;
	            }

				else if (inputchar == '}' && stack.peek() != '{' ||
	                     inputchar == ']' && stack.peek() != '['||
	                     inputchar == ')' && stack.peek() != '(') {
					return false;
				}



	            else if (inputchar == '}' && stack.peek() == '{' ||
	                     inputchar == ']' && stack.peek() == '[' ||
	                     inputchar == ')' && stack.peek() == '(') {

					stack.pop();

				}
			}

			return stack.isEmpty();
		}

	}
