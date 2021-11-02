package easy;

import org.junit.Test;

public class P01_DetectCapital {
	
	//https://leetcode.com/problems/detect-capital/
	
	@Test
	public void testcase1() {
		String word="USA";
		detectCapitalUse(word);
	}

	private boolean detectCapitalUse(String word) {		
		int caps = 0;
		int small = 0;
		for (int i = 0; i < word.length(); i++) {
			char inputchar = word.charAt(i);
			if (Character.isLowerCase(inputchar)) {
				small++;
			}

			else {
				caps++;
			}
		}

		if (small == word.length() && caps == 0) {
			return true;
		} else if (caps == word.length() && small == 0) {
			return true;
		}

		else if (caps == 1 && Character.isUpperCase(word.charAt(0))) {
			return true;
		}

		return false;

	}

}
