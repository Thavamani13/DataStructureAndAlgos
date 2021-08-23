package practiceproblems;

import org.junit.Test;

import junit.framework.Assert;

public class S06_LongestEvenLengthWord {

	/*
	 * Find the longest even length word if there are multiple occuracne , return
	 * the first one
	 */

	@Test
	public void testcase1() {
		String str= "Time to Write Great Code";
		Assert.assertEquals("Time", findLongestEvenLengthWord(str));
	}



	@Test
	public void testcase2() {
		String str= "aabbc aabb jkl aabbcc xyz";
		Assert.assertEquals("aabbcc", findLongestEvenLengthWord(str));

	}
	@Test
	public void testcase3() {
		String str= "abc def jkl hij xyz";
		Assert.assertEquals("", findLongestEvenLengthWord(str));

	}

	@Test
	public void testcase4() {
		String str= "";
		Assert.assertEquals("", findLongestEvenLengthWord(str));

	}

	@Test
	public void testcase5() {
		String str= "abcdef";
		Assert.assertEquals("abcdef", findLongestEvenLengthWord(str));

	}

	/*Split the given string
	 * Declare the max length as Integer.min value
	 * If the split string length is even --> find the max length between, maxlen and current string.
	 *
	 * Traverse through the split string and check if the string length is matches with the maxlen or not
	 *        if yes --> return word
	 *        else return empty string
	 *
	 *  Time -->O(n)+O(n)
	 *  space-->O(n)

	*/
	private String findLongestEvenLengthWord(String str) {
		if(str.length()==0) return "";

		int maxlen=Integer.MIN_VALUE;
		String[] splitstr = str.split(" ");
		for (int i = 0; i < splitstr.length; i++) {
			if(splitstr[i].length()%2==0) {
				maxlen=Math.max(maxlen, splitstr[i].length());
			}

		}

		for (int i = 0; i < splitstr.length; i++) {
			if(splitstr[i].length()==maxlen) return splitstr[i];
		}
		return "";
	}
}
