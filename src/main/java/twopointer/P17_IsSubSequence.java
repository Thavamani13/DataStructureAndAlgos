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
