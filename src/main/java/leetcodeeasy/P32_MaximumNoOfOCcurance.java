package leetcodeeasy;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class P32_MaximumNoOfOCcurance {

	@Test
	public void testcase1() {
		String s ="aabcdgddk";
		Assert.assertEquals('d', findMaxOccurance(s));
	}

	private char findMaxOccurance(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < s.length(); i++) {
			char inputChar = s.charAt(i);
			map.put(inputChar, map.getOrDefault(inputChar, 0) + 1);
			max = Math.max(max, map.get(inputChar));
		}

		System.out.println(map);

		for (int i = 0; i < s.length(); i++) {
			char inputChar = s.charAt(i);
			if (map.get(inputChar) == max) {
				System.out.println(inputChar);
				return inputChar;
			}
		}
		return 0;

	}
}
