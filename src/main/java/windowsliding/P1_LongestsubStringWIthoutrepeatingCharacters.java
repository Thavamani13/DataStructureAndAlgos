package windowsliding;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class P1_LongestsubStringWIthoutrepeatingCharacters {

	/*
	 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
	 * 
	 * Input: s = "abcabcbb" Output: 3 Explanation: The answer is "abc", with the
	 * length of 3.
	 * 
	 * Input: s = "pwwkew" Output: 3 Explanation: The answer is "wke", with the
	 * length of 3. Notice that the answer must be a substring, "pwke" is a
	 * subsequence and not a substring.
	 * 
	 * 
	 * 
	 * 
	 */

	@Test
	public void testcase1() {
		String input = "abcabcbb";
		Assert.assertEquals(3,findLongestSubString(input));

	}

	@Test
	public void testcase2() {
		String input = "bbbbb";
		Assert.assertEquals(1,findLongestSubString(input));

	}

	@Test
	public void testcase3() {
		String input = "pwwkew";
		Assert.assertEquals(3,findLongestSubString(input));

	}
	
	@Test
	public void testcase4() {
		String input = "";
		Assert.assertEquals(0,findLongestSubString(input));

	}
	
	
	
	
	/*Traverse through the array , add each character to map  and its occurence
	 * Since , we have a condition of disticnct characters . Whenever the value becomes more than one .
	 *       We have to slide the window . Decrement the count of last character 
	 *       
	 *  When mapsize  lesser than (windowend + 1) - windowstart) shrink  
	 *  
	 *  
	 *  hmap.size() < ((windowend + 1) - windowstart)
	 *  
	 *  abcabcbb==>Map will have a=2 , b=1,c=1 , at index 3.
	 *  
	 *  Map size will be 3 . [3+1 - 0 ] 
	 *  
	 *  Mapsize 3 < 4 
	 *      		 	
	
	
	*/
	

	private int findLongestSubString(String input) {
		
		
		if(input.length()==0)return 0;
		
		int windowstart = 0;
		int max = Integer.MIN_VALUE;

		Map<Character, Integer> hmap = new LinkedHashMap<Character, Integer>();

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
}
