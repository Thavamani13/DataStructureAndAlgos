package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class P24_ReDistributeChars {
	
	//https://leetcode.com/problems/redistribute-characters-to-make-all-strings-equal/
	
	@Test
	public void testcase1() {
		String[] words= {"abc","aabc","bc"};
		makeEqual(words);
		
	}

	private boolean makeEqual(String[] words) {
			int n = words.length;
	
			int[] ascii = new int[26];
			List<Character> arrlist = new ArrayList<>();
	
			for (int i = 0; i < words.length; i++) {
				String word = words[i];
	
				for (int j = 0; j < word.length(); j++) {
					char inputchar = word.charAt(j);
					if (!arrlist.contains(inputchar)) {
						arrlist.add(inputchar);
					}
	
					ascii[inputchar - 'a']++;
	
				}
	
			}
	
			System.out.println(arrlist);
			System.out.println(Arrays.toString(ascii));
	
			for (int i = 0; i < arrlist.size(); i++) {
				Character inputchar = arrlist.get(i);
				int occurance = ascii[inputchar - 'a'];
	
				if (occurance % n != 0) {
					return false;
				}
	
			}
	
			return true;
	
		}
	
	
	
	 public boolean makeEqualUsingStringBuilder(String[] words) {
		 
		 int n = words.length;
		 List<Character> arrlist = new ArrayList<>();
		 StringBuilder str= new StringBuilder();
		 for (int i = 0; i < words.length; i++) {
			 str.append(words[i]);
		}
		 
		 String word = str.toString();
		 int[] ascii = new int[26];
		 
		 for (int i = 0; i < word.length(); i++) {
			 char inputchar = word.charAt(i);
			 if (!arrlist.contains(inputchar)) {
					arrlist.add(inputchar);
				}
			 ascii[inputchar - 'a']++;
		}
		 
		 
		 
		 
		 
		 
		 
		return false;

	}

}
