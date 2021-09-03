package randomproblems;

import java.util.Arrays;

import org.junit.Test;

public class P09_IsAnagram {

	@Test
	public void testcase1() {
		String s="anagram";
		String t="nagaram";
		isAnagramorNot(s,t);
	}

	private boolean isAnagramorNot(String s, String t) {
		if(s.length()!=t.length()) return false;

		int[] stringarray=new int[26];
		int[] targetarray=new int[26];

		for (int i = 0; i < s.length(); i++) {
			char inputchar = s.charAt(i);
			stringarray[inputchar-97]++;
		}

		for (int i = 0; i < t.length(); i++) {
			char inputchar = t.charAt(i);
			targetarray[inputchar-97]++;
		}
		System.out.println(Arrays.toString(stringarray));
		System.out.println(Arrays.toString(targetarray));


		return Arrays.equals(stringarray, targetarray);
	}

}
