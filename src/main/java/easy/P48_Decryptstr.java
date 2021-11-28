package easy;

import org.junit.Test;

public class P48_Decryptstr {
	
	//https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/

	@Test
	public void testcase1() {
		String s = "10#11#12";
		decryptString(s);
	}

	private String decryptString(String s) {

		String result = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			char inputChar = s.charAt(i);

			if (inputChar == '#') {
				String subStr = s.substring(i - 2, i);
				result += (char)( Integer.parseInt(subStr) + 96);
				i -= 2;
			}

			else {
				result += (char) ((inputChar - '0') + 96);
			}

		}

		StringBuilder str = new StringBuilder(result);
		System.out.println(str.reverse().toString());
		return str.reverse().toString();

	}

}
