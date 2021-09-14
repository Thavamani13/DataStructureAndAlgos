package classroom;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class P20_LongestSubString {

	@Test
	public void testcase1() {
		String s="abcabcbb";
		findLongestSubStringUsingMap(s);
	}

	@Test
	public void testcase2() {
		String s="bbbbb";
		findLongestSubStringUsingMap(s);
	}

	@Test
	public void testcase3() {
		String s="pwwkew";
		findLongestSubStringUsingMap(s);
	}


	/*Define the set
	 *Traverse through the inputs and see if it contains in the set ,
	 *       if yes --> shrink the window and increment the left pointer
	 *       otherwise -->add the input char to the input and track the maximum length

	  At the end of the iteration , return the max count
	*/
	private int findLongestSubString(String s) {
		int windowstart = 0;
		int max = Integer.MIN_VALUE;
		Set<Character> set = new HashSet<Character>();

		for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
			char inputchar = s.charAt(windowEnd);

			while (set.contains(inputchar)) {
				char leftchar = s.charAt(windowstart);
				set.remove(leftchar);
				windowstart++;
			}

			set.add(inputchar);
			max = Math.max(max, windowEnd - windowstart + 1);
			}

		System.out.println(max);
		return max;
	}


	private int findLongestSubStringUsingMap(String s) {
		int windowstart = 0;
		int max = Integer.MIN_VALUE;
		Map<Character, Integer> map = new  HashMap<Character, Integer>();

		for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
			char inputchar = s.charAt(windowEnd);
			map.put(inputchar, map.getOrDefault(inputchar, 0)+1);


			while (map.size()<(windowEnd-windowstart+1)) {
				char leftChar = s.charAt(windowstart);
				map.put(leftChar, map.get(leftChar)-1);
				if(map.get(leftChar)==0) {
					map.remove(leftChar);
				}
				windowstart++;
			}


			max = Math.max(max, windowEnd - windowstart + 1);

		}

		System.out.println(max);
		return max;
	}

}
