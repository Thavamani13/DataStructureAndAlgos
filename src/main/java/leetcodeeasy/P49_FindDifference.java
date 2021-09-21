package leetcodeeasy;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class P49_FindDifference {

	@Test
	public void testcase1() {
		String s ="abcd";
		String t ="abcde";
		Assert.assertEquals('e', findDifferenceUsingASCII(s, t));
	}


	@Test
	public void testcase2() {
		String s ="ae";
		String t ="aea";
		Assert.assertEquals('a', findDifferenceUsingASCII(s, t));
	}

	@Test
	public void testcase3() {
		String s ="a";
		String t ="aa";
		Assert.assertEquals('a', findDifferenceUsingASCII(s, t));
	}

	@Test
	public void testcase4() {
		String s ="";
		String t ="y";
		Assert.assertEquals('y', findDifferenceUsingASCII(s, t));
	}

	private char findDifference(String s, String t) {
		List<Character> arrlist = new ArrayList<Character>();
		for (int i = 0; i < s.length(); i++) {
			arrlist.add(s.charAt(i));
		}

		for (int i = 0; i < t.length(); i++) {
			if(arrlist.contains(t.charAt(i))) {
				arrlist.remove(arrlist.indexOf(t.charAt(i)) );
			}
			else if(!arrlist.contains(t.charAt(i))) {
				return t.charAt(i);
			}
		}

		return '0';
	}




	private char findDifferenceUsingASCII(String s, String t) {
		int[] ascii = new int[26];
		for (int i = 0; i < s.length(); i++) {
			ascii[s.charAt(i) - 'a']++;
		}

		for (int i = 0; i < t.length(); i++) {
			char inputchar = t.charAt(i);

			if (ascii[t.charAt(i) - 'a'] > 0) {
				ascii[t.charAt(i) - 'a']--;
				continue;
			} else if (ascii[t.charAt(i) - 'a'] == 0) {
				return inputchar;
			}
		}

		return '0';
	}

}
