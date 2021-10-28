package slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class P03_MinWindowSubStr {
	
	//https://leetcode.com/problems/minimum-window-substring/
	@Test
	public void testcase1() {
		String s ="ADOBECODEBANC";
		String t ="ABC";
		findMinWindSubStr(s,t);
	}

	private void findMinWindSubStr(String s, String t) {
		Map<Character, Integer> targetMap = new HashMap<Character, Integer>();
		for (int i = 0; i < t.length(); i++) {
			char inputchar = t.charAt(i);
			targetMap.put(inputchar, targetMap.getOrDefault(inputchar, 0)+1);
			
		}
		
		
		int windowStart=0;
		Map<Character, Integer> sMap = new HashMap<Character, Integer>();
		List<String > arrlist = new ArrayList<String>();
		
		for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
			char inputchar = s.charAt(windowEnd);
			sMap.put(inputchar, sMap.getOrDefault(inputchar, 0)+1);
			
			while (sMap.containsKey(targetMap.keySet())) {
				char leftChar = s.charAt(windowStart);

				String substring = s.substring(windowStart, windowEnd + 1);
				arrlist.add(substring);

				sMap.put(leftChar, sMap.get(leftChar) - 1);
				if (sMap.get(leftChar) == 0) {
					sMap.remove(leftChar);
				}

				windowStart++;

			}

		}
		
		System.out.println(arrlist);

	}

}
