package stack;

import java.util.Stack;

import org.junit.Test;

import junit.framework.Assert;

public class P03_RemoveAdjacentDuplicates {
	/* Remove Adjacent duplicates from the given string */

	/**
	 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 * 
	 * What is the input(s)? String What is the expected output? String Do I have
	 * constraints to solve the problem?
	 * 
	 * Using stack Do I have all informations to go to next step!! How big is your
	 * test data set will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions 
	 * 
	 * Positive :Adjacent elements occurs at middle, first and last .
	 * Negative :No Adjacent duplicate  Duplicates spread across the string 
	 * Edge :Duplicate elements in the entire
	 * string . *
	 *
	 * Approaches : Using stack
	 * 
	 * 
	 * 
	 * 
	 */

	@Test
	public void testcase1() {
		String str = "abbabcd";
		Assert.assertEquals("bcd", removeAdjDuplicates(str));
	}

	@Test
	public void testcase2() {
		String str = "";
		Assert.assertEquals("", removeAdjDuplicates(str));
	}

	@Test
	public void testcase3() {
		String str = "abcdefgh";
		Assert.assertEquals("abcdefgh", removeAdjDuplicates(str));
	}
	
	@Test
	public void testcase4() {
		String str = "z";
		Assert.assertEquals("z", removeAdjDuplicates(str));
	}
	
	@Test
	public void testcase5() {
		String str = "bbbbb";
		Assert.assertEquals("b", removeAdjDuplicates(str));
	}
	
	@Test
	public void testcase6() {
		String str = "bacbac";
		Assert.assertEquals("bacbac", removeAdjDuplicates(str));
	}
	
	
	
	
	
	
	
	

	/*
	 * Convert the string to chararray Traverse through the array and push it to the
	 * stack Keep pushing , if the peek element is not matching with incoming
	 * element. If it matches , pop OUT the peak element from the stack
	 * 
	 * At the end of the iteration . Return the string in reverse order . Since,
	 * stack returns the recently added element first .
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	private String removeAdjDuplicates(String str) {
		
		if(str.length()==0) return "";
		if(str.length()==1) return str;
		
		
		char[] charArray = str.toCharArray();

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < charArray.length; i++) {
			Character charr = charArray[i];
			if (stack.empty()||stack.peek()!=charr)  stack.push(charr);
			else stack.pop();
			}
		
		
		int stacksize = stack.size();		
		String temp="";
		for (int i = 0; i <stacksize;i++) {
			Character opchar = stack.get(i);
			temp+=opchar;
		}

		System.out.println(temp);
		return temp;
	}

}
