package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.junit.Test;

import junit.framework.Assert;

public class P01_validParanthesis {
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
	
	/*Convert the given string to char array 
	 *Define the Map , 
	 *   Add closing bracket as KEY and its respective open bracket as VALUE
	 *   
	 * Define a STACK   
	 * 
	 * Loopp through the given array : 
	 *      1.If the character is not available in the MAP , go ahead and addd it in the Stack.
	 *      2.Else , if the character is available in the MAP  as KEY 
	 *                  POP the character from stack and compare it with the value of MAP .
	 *                  If it does not match STOP  
	 * 
	 *      Case3 : If the STACK is empty before POP , STOP
	 *      
	 * Finally , return the boolean , if the stack is empty or not . 
	 * 
	 * Time complexity --> O(n)      space complexity--> O(n) + O(m)
	
	
	
	
	*/
	private boolean findValidOrNot(String str) {
		
		if (str.length()==0) throw new RuntimeException("Invalid input");		
		
		char[] charray = str.toCharArray();
		
		Map<Character, Character> map  = new HashMap<Character, Character>();
		map.put(')', '(');
		map.put(']', '[');
		map.put('}', '{');
		map.put('>', '>');
		
		Stack<Character> stack = new Stack<Character>();
		
		for (int i = 0; i < charray.length; i++) {
			
			Character charr = charray[i];
			
			if(!map.containsKey(charr)) {
				stack.push(charr);
			}	
			else if (stack.isEmpty()||stack.pop() !=map.get(charr)) {
				return false ; 
			}
		}	
		
		return stack.isEmpty();
	}
	
}
