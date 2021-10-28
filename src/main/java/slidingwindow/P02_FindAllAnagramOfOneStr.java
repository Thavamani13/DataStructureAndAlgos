package slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class P02_FindAllAnagramOfOneStr {
	
	
	
	/*
	 * https://www.techiedelight.com/find-substrings-string-permutation-given-
	 * string/
	 * 
	 * https://leetcode.com/problems/permutation-in-string/
	 * 
	 * https://leetcode.com/problems/find-all-anagrams-in-a-string/
	 * 
	 * 
	 * 
	 * 
	 */
	
	@Test
	public void testcase1() {
		String first="XYYZXZYZXXYZ";
		String two="XYZ";
		findAllAnagrams(first,two);
				
	}
	
	
	/*Define a map for second string, add its occurances to it by iterating second string 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	
	
	
	
	*/
	private void findAllAnagrams(String first, String two) {
		Map<Character, Integer > twoMap= new HashMap<Character, Integer>();
		for (int i = 0; i < two.length(); i++) {
			char inputchar= two.charAt(i);
			twoMap.put(inputchar, twoMap.getOrDefault(inputchar, 0)+1);
		}
		
		
		/*
		 * String first="XYYZXZYZXXYZ"; 
		 * 
		 * String two="XYZ";
		 */
		
		List<String> arrlist = new ArrayList<String>();
		Map<Character, Integer> oneMap = new HashMap<Character, Integer>();
		int windowStart = 0;
		for (int windowEnd = 0; windowEnd < first.length(); windowEnd++) {
			char inputchar = first.charAt(windowEnd);
			oneMap.put(inputchar, oneMap.getOrDefault(inputchar, 0) + 1);

			while (two.length() == (windowEnd - windowStart + 1)) {
				if (oneMap.equals(twoMap)) {
					String substring = first.substring(windowStart, windowEnd+1);
					arrlist.add(substring);
				}

				char leftchar = first.charAt(windowStart);
				oneMap.put(leftchar, oneMap.get(leftchar) - 1);
				if (oneMap.get(leftchar) == 0) {
					oneMap.remove(leftchar);
				}

				windowStart++;

			}

		}
		
		System.out.println(arrlist);

	}

}
