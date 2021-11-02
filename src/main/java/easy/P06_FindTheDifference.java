package easy;

import org.junit.Test;

public class P06_FindTheDifference {

	// https://leetcode.com/problems/find-the-difference/

	@Test
	public void testcase1() {
		String s = "abcd";
		String t = "abcde";
		finddifferenceWord(s, t);
	}

	private char finddifferenceWord(String s, String t) {
		// TODO Auto-generated method stub
		int[] ascii = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char inputChar = s.charAt(i);
			ascii[inputChar - 'a']++;
		}

		for (int i = 0; i < ascii.length; i++) {
			char inputChar = t.charAt(i);
			if (ascii[inputChar - 'a'] == 0) {
				System.out.println(inputChar);
				return inputChar;
			}

			else {
				ascii[inputChar - 'a']--;
			}
		}

		return ' ';
	}

}
