package easy;

import org.junit.Test;

public class P56_CheckifAWordOccursAsPrefix {
	//https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/

	@Test
	public void testcase1() {
		String sentence = "i love eating burger";
		String searchWord = "burg";
		findWordIndex(sentence, searchWord);
	}

	@Test
	public void testcase2() {
		String sentence = "this problem is an easy problem";
		String searchWord = "pro";
		findWordIndex(sentence, searchWord);
	}
	
	@Test
	public void testcase3() {
		String sentence = "hellohello hellohellohello";
		String searchWord = "ell";
		findWordIndex(sentence, searchWord);
	}

	private int findWordIndex(String sentence, String searchWord) {

		String[] split = sentence.split(" ");
		int length = searchWord.length();

		for (int i = 0; i < split.length; i++) {
			String inputStr = split[i];

			if (inputStr.length() >= searchWord.length()) {
				String subStr = inputStr.substring(0, length);
				if (subStr.equalsIgnoreCase(searchWord)) {
					return i+1;
					
				}

			}

		}

        return -1;
	}

}