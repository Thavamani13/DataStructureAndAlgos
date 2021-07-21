package binarySearch;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

import junit.framework.Assert;

public class P12_FormatString {

	/*
	 * String s="aabbccddde"
	 * 
	 * o/p-->a2b2c2d3e1
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	@Test
	public void testcase1() {

		String input = "aabbccddde";
		test(input);

	}

	@Test
	public void testcase2() {
		String input = "abce";
		test(input);
	}

	@Test
	public void testcase3() {

		String input = "cdfgdctag";
		test(input);
	}

	/*
	 * traverse through the array set the default occurance of the character to 1 if
	 * it occurs again increment using .getDefault
	 * 
	 * The map will have the character and its occurances
	 * 
	 * 
	 * Use entry set to get the Key and value
	 * 
	 * Retrive the key and value. append it to the string
	 * 
	 * 
	 * 
	 * 
	 */
	private void test(String input) {

		Map<Character, Integer> hmap = new LinkedHashMap<Character, Integer>();

		StringBuilder str = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {

			char charr = input.charAt(i);

			hmap.put(charr, hmap.getOrDefault(charr, 0) + 1);

		}

		System.out.println(hmap);

		Iterator<Entry<Character, Integer>> itr = hmap.entrySet().iterator();

		while (itr.hasNext()) {

			Entry<Character, Integer> next = itr.next();

			str.append(next.getKey() + "" + next.getValue());

		}

		System.out.println(str);

	}
}