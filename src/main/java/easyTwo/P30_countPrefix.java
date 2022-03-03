package easyTwo;

import org.junit.Test;

public class P30_countPrefix {
	
	//https://leetcode.com/contest/weekly-contest-282/problems/counting-words-with-a-given-prefix/
	
	@Test
	public void testcase1() {
		String[] words = {"pay","attention","practice","attend"};
		String pref="at";
		countPrefix(words,pref);
	}

	private int countPrefix(String[] words, String pref) {
		 int count=0;
		 for (int i = 0; i < words.length; i++) {
             if(words[i].length()>=pref.length()){
                 String word =words[i].substring(0, pref.length());
			     if(word.equalsIgnoreCase(pref)) count++;
             }
			
		}
		System.out.println(count);
		return count;
	}

}
