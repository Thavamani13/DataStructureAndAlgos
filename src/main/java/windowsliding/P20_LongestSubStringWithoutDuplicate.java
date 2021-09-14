package windowsliding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class P20_LongestSubStringWithoutDuplicate {


   @Test
	public void testcase1() {
		String str= "clementisacap";
		findLongestSubString(str);
}

	private String findLongestSubString(String str) {
		int windowstart = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		ArrayList<String> arrlist = new ArrayList<String>();
		int maxvalue =Integer.MIN_VALUE;

		for (int windowend = 0; windowend < str.length(); windowend++) {
			char inputchar = str.charAt(windowend);
			map.put(inputchar, map.getOrDefault(inputchar, 0) + 1);

			while (map.size() < (windowend - windowstart) + 1) {
				char leftchar = str.charAt(windowstart);
				String substring = str.substring(windowstart, windowend);
				arrlist.add(substring);

				map.put(leftchar, map.get(leftchar) - 1);
				if (map.get(leftchar) == 0) {
					map.remove(leftchar);
				}

				windowstart++;

			}

		}

		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arrlist.size(); i++) {
			set.add(arrlist.get(i).length());
		}

		int max = Collections.max(set);

		for (int i = 0; i < arrlist.size(); i++) {
			if (arrlist.get(i).length() == max) {
				System.out.println(arrlist.get(i));
				return arrlist.get(i);
			}
		}
		return str;

	}

}
