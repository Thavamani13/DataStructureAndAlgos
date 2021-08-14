package twopointer;

import org.junit.Test;

import junit.framework.Assert;

public class P16_ReverseVowelsInString {

   @Test
	public void testcase1() {
		String s ="leetcode";
		Assert.assertEquals("leotcede", reverseVowels(s));
	}

   @Test
  	public void testcase2() {
  		String s ="hello";
		Assert.assertEquals("holle", reverseVowels(s));
  	}
   @Test
 	public void testcase3() {
 		String s ="aA";
		Assert.assertEquals("Aa", reverseVowels(s));
 	}

   @Test
	public void testcase4() {
		String s ="a123Ab";
		Assert.assertEquals("A123ab", reverseVowels(s));
	}






	private String reverseVowels(String s) {
		String vowels = "aeiouAEIOU";

		String output ="";

		char[] charArray = s.toCharArray();
		int left = 0;
		int right = charArray.length - 1;

		while (left < right) {
			char leftchar = charArray[left];
			char rightchar = charArray[right];

			if (!vowels.contains("" + leftchar))
				left++;
			if (!vowels.contains("" + rightchar))
				right--;
			if (vowels.contains("" + leftchar) && vowels.contains("" + rightchar)) {
				char temp = charArray[left];
				charArray[left] = charArray[right];
				charArray[right] = temp;
				left++;
				right--;
			}

		}

		for (int i = 0; i < charArray.length; i++) {
			output+=charArray[i];
		}

		System.out.println(output);
		return output;

	}
}
