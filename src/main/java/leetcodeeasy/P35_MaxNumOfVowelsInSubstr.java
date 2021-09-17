package leetcodeeasy;

import org.junit.Test;

import junit.framework.Assert;

public class P35_MaxNumOfVowelsInSubstr {

	@Test
	public void testcase1() {
       String s ="abciiidef";
       int k=3;
       Assert.assertEquals(3, fiindMAxNoOfVowels(s, k));
	}

	@Test
	public void testcase2() {
       String s ="aeiou";
       int k=2;
       Assert.assertEquals(2, fiindMAxNoOfVowels(s, k));
	}

	@Test
	public void testcase3() {
       String s ="leetcode";
       int k=3;
       Assert.assertEquals(2, fiindMAxNoOfVowels(s, k));
	}

	@Test
	public void testcase4() {
       String s ="rhythms";
       int k=4;
       Assert.assertEquals(0, fiindMAxNoOfVowels(s, k));
	}


	@Test
	public void testcase5() {
       String s ="tryhard";
       int k=4;
       Assert.assertEquals(1, fiindMAxNoOfVowels(s, k));
	}


/*	Define the voweels String
	 * Traverse through the given string and track the maximum vowels you get within windowlength of k
	 *          Track the max bewteen count and maxvalue
	 *
	 * once you reaches to the window length of k
	 *       get into while loop to shrink the window
	 *       get the leftmost character
	 *       if your leftmost character is a vowel you have to decrement the count ,
	 *       shrink the window by moving left pointer  windowStart++;
	 *
	 *
		*/

	private int fiindMAxNoOfVowels(String s, int k) {
		String vowels="aeiou";
		int windowStart=0;
		int max=Integer.MIN_VALUE;
		int count=0;
		for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
			 char inputChar = s.charAt(windowEnd);
			 if (vowels.contains("" + inputChar)) {
				 count++;
			}
			 max = Math.max(count, max);
			 while (((windowEnd - windowStart) + 1) == k) {
				char leftChar = s.charAt(windowStart);
				if (vowels.contains("" + leftChar)) {
					count--;
				}
				windowStart++;

			}

		}

		System.out.println(max);
		return max;

	}

}
