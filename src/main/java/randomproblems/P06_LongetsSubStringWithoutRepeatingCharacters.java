package randomproblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class P06_LongetsSubStringWithoutRepeatingCharacters {

	/*
	 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
	 */

	@Test
	public void testcase1() {
		String input="abcabcbb";
		Assert.assertEquals(3, findLongestSubstringOptimized(input));
	}

	@Test
	public void testcase2() {
		String input="abcd";
		Assert.assertEquals(4, findLongestSubstringOptimized(input));
	}

	@Test
	public void testcase3() {
		String input="aaaaa";
		Assert.assertEquals(1, findLongestSubstringOptimized(input));
	}

	private int findLongestSubstring(String input) {
		if(input.length()==0)return 0;
		int windowstart = 0;
		int max = Integer.MIN_VALUE;
		Map<Character, Integer> hmap = new HashMap<Character, Integer>();

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




	/*	Define a set
	 * Loop through the string add the character to the set
	 * if the set contains the input character .
	 *            --> go ahead and remove the left character from the set and increment the left pointer to shrink the window
	 *            --> Retain the max between the max and window length
	 *
	 *  Time -->O(n) , space -->    O(1)
	 *
	 * */

	private int findLongestSubstringOptimized(String input) {
		if(input.length()==0)return 0;
		int windowstart = 0;
		int max = Integer.MIN_VALUE;

		Set<Character> set = new HashSet<Character>();
		for (int windowend = 0; windowend < input.length(); windowend++) {
			char inputchar= input.charAt(windowend);

			while(set.contains(inputchar)) {
				char leftchar= input.charAt(windowstart);
				set.remove(leftchar);
				windowstart++;
			}

			set.add(inputchar);
			max=Math.max(max, windowend-windowstart+1);
		}

		System.out.println(max);
		return max;
	}

}
