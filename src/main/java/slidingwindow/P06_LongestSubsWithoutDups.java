package slidingwindow;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class P06_LongestSubsWithoutDups {
	//https://leetcode.com/problems/longest-substring-without-repeating-characters/

	@Test
	public void testcase1() {
		String s = "abcabcbb";
		findLongestSubtr(s);

	}

	private int findLongestSubtr(String s) {
		int max = Integer.MIN_VALUE;
		int windowStart = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
			char inputChar = s.charAt(windowEnd);
			map.put(inputChar, map.getOrDefault(inputChar, 0) + 1);

			while (map.size() < ((windowEnd - windowStart) + 1)) {
				char leftChar = s.charAt(windowStart);

				map.put(leftChar, map.get(leftChar) - 1);
				if (map.get(leftChar) == 0) {
					map.remove(leftChar);
				}
				windowStart++;

			}

			max = Math.max(max, windowEnd - windowStart + 1);

		}

		System.out.println(max);
        return max==Integer.MIN_VALUE?0:max;


	}

}
