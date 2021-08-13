package hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class P04_CheckEqualnumberOfOccurance {

	/*
	 * https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-
	 * occurrences/
	 */

	/*
	 * 	1.
	    Input(s)?  string
	    Output ?  boolean
	    Constraints ?

	2. Test data set

	        Positive : aabbcc , ababcc
	        Negative :aab
	        Edge     :a

	3. Known Approaches
	        Approach 1 : map
	        Approach 2 :

	4. O-Notations
			Approach 1 :

	5. Pseudocode
 *
 */

	@Test
	public void testcase1() {
		String s = "abacbc";
		Assert.assertEquals(true, isOccurancesAreEqual(s));
	}
	@Test
	public void testcase2() {
		String s = "ababa";
		Assert.assertEquals(false, isOccurancesAreEqual(s));
	}
	@Test
	public void testcase3() {
		String s = "a";
		Assert.assertEquals(true, isOccurancesAreEqual(s));
	}
	@Test
	public void testcase4() {
		String s = "";
		Assert.assertEquals(false, isOccurancesAreEqual(s));
	}

	private boolean isOccurancesAreEqual(String s) {
		if (s == null)
			throw new RuntimeException("invalid input");
		if (s.length() == 1)
			return true;

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			char inputchar = s.charAt(i);
			map.put(inputchar, map.getOrDefault(inputchar, 0) + 1);
		}

		Set<Integer> set = new HashSet<Integer>(map.values());
		if (set.size() == 1) {
			return true;
		}
		return false;
	}
}
