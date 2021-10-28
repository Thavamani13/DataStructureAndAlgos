package slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class LongestSubstrcontainsKDistinctchars {

	// https://www.techiedelight.com/find-longest-substring-containing-k-distinct-characters/

	@Test
	public void testcase1() {
		String s = "abcbdbdbbdcdabd";
		int k = 2;
		Assert.assertEquals("bdbdbbd", findLongestSubStr(s, k));

	}

	@Test
	public void testcase2() {
		String s = "abcbdbdbbdcdabd";
		int k = 3;
		Assert.assertEquals("bcbdbdbbdcd", findLongestSubStr(s, k));

	}

	@Test
	public void testcase3() {
		String s = "abcbdbdbbdcdabd";
		int k = 5;
		Assert.assertEquals("abcbdbdbbdcdabd", findLongestSubStr(s, k));

	}

	private String findLongestSubStr(String s, int k) {
		int max = Integer.MIN_VALUE;
		int windowstart = 0;
		List<String> arrlist = new ArrayList<String>();

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
			char inputChar = s.charAt(windowEnd);
			map.put(inputChar, map.getOrDefault(inputChar, 0) + 1);
			while (map.size() > k) {
				String substring = s.substring(windowstart, windowEnd);
				arrlist.add(substring);
				max = Math.max(max, substring.length());
				char leftChar = s.charAt(windowstart);
				map.put(leftChar, map.get(leftChar) - 1);
				if (map.get(leftChar) == 0) {
					map.remove(leftChar);
				}
				windowstart++;

			}

		}

		if (arrlist.isEmpty()) {
			return s;
		}

		for (String substr : arrlist) {
			if (substr.length() == max)
				return substr;

		}

		return s;

	}

}
