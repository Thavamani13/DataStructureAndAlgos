package twopointer;

import org.junit.Test;

import junit.framework.Assert;

public class P17_IsSubSequence {

	@org.junit.Test
	public void testcase1() {
		String s ="abc";
		String t="ahbgdc";
		Assert.assertEquals(true, IsSubSequence(s,t));
	}

	@Test
	public void testcase2() {
		String s ="axc";
		String t="ahbgdc";
		Assert.assertEquals(false, IsSubSequence(s,t));

	}


	/*left and right at zero pointing to the different strings
	 *if left char and right character are equal
	 *                move left++, right++
	 *if not move right alone..
	 *
	 *At the end of the iteration , if my left pointer is at the end of the string1 ,
	 *                               --> it means , string 2 maintains the sequence of string 1 -->return true
	 *                               --->if not,
	 *                                       string 2  does not has the sequence of string 1 -->return false
	 *
	 *Time ->O(n) , space O(1)

	*/
	private boolean IsSubSequence(String s, String t) {
		int left=0 , right=0;

		while (left < s.length() && right < t.length()) {
			char leftchar = s.charAt(left);
			char rightchar = t.charAt(right);

			if (leftchar == rightchar) {
				left++;
			}
			right++;

		}

		return left == s.length();
	}

}
