package leetcodeeasy;

import org.junit.Test;

import junit.framework.Assert;

public class P48_FirstUniqueCharactInAString {

	@Test
	public void testcase1() {
		String s ="leetcode";
		Assert.assertEquals(0, findfirstUnique(s));
	}

	private int findfirstUnique(String s) {

		int[] ascii = new int[26];
		for (int i = 0; i < s.length(); i++) {
			ascii[s.charAt(i) - 'a']++;
		}

		for (int i = 0; i < s.length(); i++) {

			if (ascii[s.charAt(i) - 'a'] == 1) {
				return i;
			}
		}

		return -1;

	}

}
