package windowsliding;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class P1_LongestsubStringWIthoutrepeatingCharacters {

	/*
	 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
	 * 
	 * Input: s = "abcabcbb" Output: 3 Explanation: The answer is "abc", with the
	 * length of 3.
	 * 
	 * Input: s = "pwwkew" Output: 3 Explanation: The answer is "wke", with the
	 * length of 3. Notice that the answer must be a substring, "pwke" is a
	 * subsequence and not a substring.
	 * 
	 * 
	 * 
	 * 
	 */

	@Test
	public void testcase1() {
		String input = "abcabcbb";
		Assert.assertEquals(3,findLongestSubString(input));

	}

	@Test
	public void testcase2() {
		String input = "bbbbb";
		Assert.assertEquals(1,findLongestSubString(input));

	}

	@Test
	public void testcase3() {
		String input = "pwwkew";
		Assert.assertEquals(3,findLongestSubString(input));

	}
	
	@Test
	public void testcase4() {
		String input = "";
		Assert.assertEquals(0,findLongestSubString(input));

	}
	
	

	private int findLongestSubString(String input) {
		
		
		if(input.length()==0)return 0;
		
		int windowstart = 0;
		int max = Integer.MIN_VALUE;

		Map<Character, Integer> hmap = new LinkedHashMap<Character, Integer>();

		for (int windowend = 0; windowend < input.length(); windowend++) {
			char charrr = input.charAt(windowend);
			hmap.put(charrr, hmap.getOrDefault(charrr, 0) + 1);

			while (hmap.size() < ((windowend + 1) - windowstart)) {
				char leftchar = input.charAt(windowstart);

				hmap.put(leftchar, hmap.get(leftchar) - 1);

				if (hmap.get(leftchar) == 0) {
					hmap.remove(leftchar);
				}

				windowstart++;

			}
			max = Math.max(max, (windowend - windowstart + 1));

		}
		System.out.println(max);
		return max;
	}
}
