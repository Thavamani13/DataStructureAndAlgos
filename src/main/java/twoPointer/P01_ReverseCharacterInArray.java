package twoPointer;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class P01_ReverseCharacterInArray {

	/*
	 * Input: s = ["h","e","l","l","o"] Output: ["o","l","l","e","h"]
	 * 
	 * 
	 * Input: s = ["H","a","n","n","a","h"] Output: ["h","a","n","n","a","H"]
	 */

	/**
	 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 * 
	 * Reverse the characters given in the character array
	 * 
	 * What is the input(s)? Chararr[] What is the expected output? chararr[] Do I
	 * have constraints to solve the problem?
	 * 
	 * Solve it using two pointers . Less than O(n) ,
	 * 
	 * Do I have all informations to go to next step!! How big is your test data set
	 * will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions Positive :Array
	 * has the elements to revers each characters Negative :[] array Edge :Duplicate
	 * characters all through the array
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
		char[] chararr = { 'h', 'e', 'l', 'l', 'o' };
		Assert.assertArrayEquals(new char[] {'o','l','l','e','h'}, reverseCharUsingTwoPointer(chararr));
	}
	
	@Test
	public void testcase2() {
		char[] chararr = { 'H', 'a', 'n', 'n', 'a','h' };
		Assert.assertArrayEquals(new char[] {'h','a', 'n', 'n', 'a','H'}, reverseCharUsingTwoPointer(chararr));
	}
	
	@Test
	public void testcase3() {
		char[] chararr = { 'H'};
		Assert.assertArrayEquals(new char[] {'H'}, reverseCharUsingTwoPointer(chararr));
	}
	
	@Test
	public void testcase4() {
		char[] chararr = {};
		Assert.assertArrayEquals(new char[] {}, reverseCharUsingTwoPointer(chararr));
	}
	
	/*Assign left-->0 , right-->arrlen-1
	 * swap the values untill left reaches to right
	 * 
	 * increment left++ , decreement right--;	
	
	*/
	private char[] reverseCharUsingTwoPointer(char[] chararr) {
		
		if(chararr.length==0) return new char[] {};
		
		if(chararr.length==1) return chararr;		
		
		int left = 0, right = chararr.length - 1;
		
		while (left <right) {
			
			char temp = chararr[left];
			chararr[left] = chararr[right];
			chararr[right] = temp;
			
			left++;
			right--;

		}
		System.out.println(Arrays.toString(chararr));
		return chararr;

	}

}
