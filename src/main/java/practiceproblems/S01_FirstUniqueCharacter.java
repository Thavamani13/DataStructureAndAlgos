package practiceproblems;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class S01_FirstUniqueCharacter {

	/*
	 * Return the first unique character from the string if there is no unique
	 * character return -1;
	 *
	 * https://leetcode.com/problems/first-unique-character-in-a-string/
	 */

	@Test
	public void testcase1() {
		String str= "statistics";
		Assert.assertEquals(2, findFirstUniqueCharacUsingAscii(str));
 }

	@Test
	public void testcase2() {
		String str= "aabbccdd";
		Assert.assertEquals(-1, findFirstUniqueCharac(str));
 }

	@Test
	public void testcase3() {
		String str= "aabbccdde";
		Assert.assertEquals(8, findFirstUniqueCharac(str));
 }

	@Test
	public void testcase4() {
		String str= "";
		Assert.assertEquals(-1, findFirstUniqueCharac(str));
 }

	@Test
	public void testcase5() {
		String str= "a";
		Assert.assertEquals(1, findFirstUniqueCharac(str));
 }


	/*Add the occurance of each character in the map
	 * traverse through the string again and find which character has the occurance Value 1 --> return the index

	  if no match return -1;

	  time -->O(n)+O(n)
	  space_->O(1)
	  alphabet contains only 26 characters.
	*/
	private int findFirstUniqueCharac(String str) {
		if(str.length()==0) return -1;
		if(str.length()==1) return 1;

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char inputchar = str.charAt(i);
			map.put(inputchar, map.getOrDefault(inputchar, 0)+1);
		}

		for (int i = 0; i < str.length(); i++) {
			char inputchar = str.charAt(i);
			if(map.get(inputchar)==1) return i;
		}

		return -1;
	}

	private int findFirstUniqueCharacUsingAscii(String str) {
		if(str.length()==0) return -1;
		if(str.length()==1) return 1;    //statistics

		int[] count= new int[26];

		for (int i = 0; i < str.length(); i++) {
			int index = str.charAt(i)-'a';
			count[index]++;

		}

		for (int i = 0; i < str.length(); i++) {
			int index = str.charAt(i)-'a';
			if(count[index]==1) return i;
		}

		return -1;
    }


	private int findFirstUniqueInbuildFunc(String str) {
		if(str.length()==0) return -1;
		if(str.length()==1) return 0;    //statistics

		for (int i = 0; i < str.length(); i++) {
			char inputchar = str.charAt(i);
			if(str.indexOf(inputchar)==str.lastIndexOf(inputchar)) return i;
			}


		return -1;



}
}