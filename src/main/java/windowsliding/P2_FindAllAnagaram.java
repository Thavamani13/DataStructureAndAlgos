package windowsliding;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

public class P2_FindAllAnagaram {

	/*
	 * https://leetcode.com/problems/find-all-anagrams-in-a-string/4 Given two
	 * strings s and p, return an array of all the start indices of p's anagrams in
	 * s. You may return the answer in any order.
	 * 
	 * 
	 * 
	 * Input: s = "cbaebabacd", p = "abc" Output: [0,6] Explanation: The substring
	 * with start index = 0 is "cba", which is an anagram of "abc". The substring
	 * with start index = 6 is "bac", which is an anagram of "abc".
	 * 
	 * Input: s = "abab", p = "ab" Output: [0,1,2] Explanation: The substring with
	 * start index = 0 is "ab", which is an anagram of "ab". The substring with
	 * start index = 1 is "ba", which is an anagram of "ab". The substring with
	 * start index = 2 is "ab", which is an anagram of "ab".
	 */

	@Test
	public void testcase1() {
		String input = "cbaebabacd";
		String p = "abc";
		findAllAnagrams(input, p);

	}

	@Test
	public void testcase2() {
		String input = "abab";
		String p = "ab";
		findAllAnagrams(input, p);

	}

	private void findAllAnagrams(String input, String p) {
		int target = p.length();

		int windowstart = 0;

		Map<Character, Integer> targetmap = new LinkedHashMap<Character, Integer>();

		Map<Character, Integer> inputmap = new LinkedHashMap<Character, Integer>();

		int count = 0;
		int[] outputarr= {};
		int index = 0;

		for (int i = 0; i < p.length(); i++) {
			targetmap.put(p.charAt(i), targetmap.getOrDefault(p.charAt(i), 0) + 1);
		}

		for (int windowend = 0; windowend < input.length(); windowend++) {
			char charr = input.charAt(windowend);

			inputmap.put(charr, inputmap.getOrDefault(charr, 0) + 1);

			if (windowend >= target - 1) {

				char leftchar = input.charAt(windowstart);

				if (targetmap.equals(inputmap)) {
					System.out.println(windowstart);
					count++;
					outputarr = new int[count];
					outputarr[index] = windowstart;
					index++;

				}

				inputmap.put(leftchar, inputmap.get(leftchar) - 1);

				if (inputmap.get(leftchar) == 0) {
					inputmap.remove(leftchar);
				}

				windowstart++;

			}

		}

		System.out.println(Arrays.toString(outputarr));
	}

}
