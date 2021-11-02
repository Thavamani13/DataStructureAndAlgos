package easy;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class P07_WordPattern {
	
	//https://leetcode.com/problems/word-pattern/

	@Test
	public void testcase1() {
		String pattern = "abba";
		String s = "dog cat cat dog";
		findWordPattern(pattern, s);
	}

	private boolean findWordPattern(String pattern, String s) {
		Map<Character, String> map = new HashMap<Character, String>();
		String[] split = s.split(" ");
		if (pattern.length() != split.length)
			return false;
		for (int i = 0; i < split.length; i++) {
			char inputChar = pattern.charAt(i);
			String str = split[i];

			if (!map.containsKey(inputChar) && !map.containsValue(str)) {
				map.put(inputChar, str);
			}

			else if (map.containsKey(inputChar) && !map.get(inputChar).equalsIgnoreCase(str)) {
				return false;
			}

			else if (map.containsValue(str) && !map.containsKey(inputChar)) {
				return false;
			}

		}
		return true;

	}

}
