package easy;

import org.junit.Test;

public class P22_WordEqualsSummation {
	
	//https://leetcode.com/problems/check-if-word-equals-summation-of-two-words/

	@Test
	public void testcase1() {
		String firstWord = "acb";
		String secondWord = "cba";
		String targetWord = "cdb";
		isMatching(firstWord, secondWord, targetWord);

	}
	
	
	@Test
	public void testcase2() {
		String firstWord = "aaa";
		String secondWord = "a";
		String targetWord = "aab";
		isMatching(firstWord, secondWord, targetWord);

	}
	
	@Test
	public void testcase3() {
		String firstWord = "aaa";
		String secondWord = "a";
		String targetWord = "aaaa";
		isMatching(firstWord, secondWord, targetWord);

	}

	private boolean isMatching(String firstWord, String secondWord, String targetWord) {

		int sum = 0;

		StringBuilder wordone = new StringBuilder();
		for (int i = 0; i < firstWord.length(); i++) {
			int inputChar = firstWord.charAt(i);
			int j = inputChar - 'a';
			wordone.append(j);
		}

		StringBuilder wordTwo = new StringBuilder();
		for (int i = 0; i < secondWord.length(); i++) {
			int inputChar = secondWord.charAt(i);
			int j = inputChar - 'a';
			wordTwo.append(j);
		}

		StringBuilder target = new StringBuilder();
		for (int i = 0; i < targetWord.length(); i++) {
			int inputChar = targetWord.charAt(i);
			int j = inputChar - 'a';
			target.append(j);
		}

		int valueOne = Integer.parseInt(wordone.toString());
		int valueTwo = Integer.parseInt(wordTwo.toString());

		sum += valueOne + valueTwo;

		int targetVal = Integer.parseInt(target.toString());

		System.out.println(sum + "==" + targetVal);
		

		
		return sum == targetVal;
	}

}
