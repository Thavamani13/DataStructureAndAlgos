package easyTwo;

import org.junit.Test;

public class P19_SumOfDigits {
	// https://leetcode.com/problems/sum-of-digits-of-string-after-convert/
	@Test
	public void testcase1() {
		String s = "iiii";
		int k = 1;
		getLucky(s, k);
	}

	@Test
	public void testcase2() {
		String s = "leetcode";
		int k = 2;
		getLucky(s, k);
	}
	
	@Test
	public void testcase3() {
		String s = "zbax";
		int k = 2;
		getLucky(s, k);
	}

	/*
	 * Map 1 -26 for the number from a to z. get the ascii of the character and
	 * subtract 96
	 * Build a string 
	 * 
	 * Transformation
	 *    While k value is not equal to zero  , traverse the string and  sum up the value and decrement the K counter value
	 *    if the counter value k is equals to zero  return  value
	 *    else update the string and value to 0
	 * 
	 * 
	 * 
	 **/

	private int getLucky(String s, int k) {
          
		String str ="";
		for (int i = 0; i < s.length(); i++) {
			char inputchar = s.charAt(i);
			str+=inputchar-96;
		}
		
		System.out.println(str);
		
		int value=0;
		while (k!=0) {
			for (int i = 0; i < str.length(); i++) {
				value+=str.charAt(i)-'0';
			}
			k--;
			if(k==0) {
				System.out.println(value);
				return value;
			}
			else {
				str=String.valueOf(value);
				value=0;
				
			}
		}

		return Integer.parseInt(str);
	}

}
