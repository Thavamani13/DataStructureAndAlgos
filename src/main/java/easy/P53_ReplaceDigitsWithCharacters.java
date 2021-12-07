package easy;

import org.junit.Test;

public class P53_ReplaceDigitsWithCharacters {

	// https://leetcode.com/problems/replace-all-digits-with-characters/
	
	//https://leetcode.com/problems/shifting-letters/

	@Test
	public void testcase1() {
		String s = "a1c1e1";
		replace(s);
	}

	@Test
	public void testcase2() {
		String s = "a1b2c3d4e";
		replace(s);
	}

	private void replace(String s) {

		StringBuilder str = new StringBuilder();

		for (int i = 0; i < s.length(); i += 1) {
			char inputChar = s.charAt(i);

			if (i % 2 == 0 || i == 0) {
				str.append(inputChar);
			}

			else if (i % 2 != 0) {
				char previouChar = s.charAt(i - 1);
				int shiftVal = Integer.parseInt("" + inputChar);
				char replaceChar = (char) (previouChar + shiftVal);
				str.append(replaceChar);

			}

		}
		
		System.out.println(str.toString());

	}

}
