package leetcodeeasy;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class P36_ValidAnagram {

	@Test
	 public void testcase1() {
		String s="anagram";
		String t="nagaram";
		Assert.assertEquals(true, isValidAnagramOrNot(s,t));
	}

	/*Define a ascii array
	 * Traverse through the string and increments  the character occurance , Do it for both the string
	 *
	      if both ascii array are equal return true, else false
	      Time -->O(n) , spaceO(26)-->O(1)
	*/

	private boolean isValidAnagramOrNot(String s, String t) {


		return Arrays.equals(findAscii(s), findAscii(t));
	}

	private int[] findAscii(String x) {
		int[] ascii = new int[26];
		for (int i = 0; i < x.length(); i++) {
			char inputchar = x.charAt(i);
			ascii[inputchar- 'a']++;
		}

		return ascii;

	}

}
