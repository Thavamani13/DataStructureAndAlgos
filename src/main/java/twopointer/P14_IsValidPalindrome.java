package twopointer;

import org.junit.Test;

public class P14_IsValidPalindrome {

	/*
	 * https://leetcode.com/problems/valid-palindrome/
	 */		/*
		 * 	1.
		    Input(s)?  String
		    Output ?  boolean
		    Constraints ?

		2. Test data set

		        Positive :
		        Negative :
		        Edge     :s

		3. Known Approaches
		        Approach 1 :
		        Approach 2 :

		4. O-Notations
				Approach 1 :

		5. Pseudocode
	 *
	 */

	@Test
	public void testcase1() {
		String s = "A man, a plan, a canal: Panama";
		isValidPalindrome(s);
	}



	private boolean isValidPalindrome(String s) {
		s = s.toLowerCase();

		int left=0, right =s.length()-1;

		while (left < right) {
			char leftchar = s.charAt(left);
			char rightchar = s.charAt(right);

			if (!Character.isAlphabetic(leftchar) || !Character.isDigit(leftchar)) {
				left++;
			} else if (!Character.isAlphabetic(rightchar) || !Character.isDigit(rightchar)) {
				right--;
			} else if (leftchar == rightchar) {
				left++;
				right--;
			} else {
				return false;
			}

		}

		return true;

	}

}
