package leetcodeeasy;

import org.junit.Test;

import junit.framework.Assert;

public class P30_IsSubSequence {

	@Test
	public void testcase1() {
		String s ="abc";
		String t="ahbgdc";
		Assert.assertEquals(true, isSubSequence(s,t));
	}

	@Test
	public void testcase2() {
		String s ="axc";
		String t="ahbgdc";
		Assert.assertEquals(false, isSubSequence(s,t));
	}

	/*left and right will be at zero th position of the respective arrays
	 * if both the values aree eaul move left++ ,right++
	 *    else move right alone
	 *
	 *At the end of the iteration
	 * validate -->left pointer reaches the end of the array  and return
	*/

	private boolean isSubSequence(String s, String t) {
		int left=0;
		int right=0;

		while (left < s.length() && right < t.length()) {
			if (s.charAt(left) == t.charAt(right)) {
				left++;
				right++;
			} else {
				right++;
			}

		}

		return left==s.length();

	}

}
