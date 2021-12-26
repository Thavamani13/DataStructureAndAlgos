package easy;

import java.util.Iterator;

import org.junit.Test;

public class P74_CrwalerLogFolder {

	// https://leetcode.com/problems/crawler-log-folder/

	@Test
	public void testcase1() {
		String[] logs = { "d1/", "d2/", "../", "d21/", "./" };
		findMinMoveToMainFolder(logs);
	}
	
	@Test
	public void testcase2() {
		String[] logs = {"d1/","d2/","./","d3/","../","d31/"};
		findMinMoveToMainFolder(logs);
	}
	
	@Test
	public void testcase3() {
		String[] logs = {"d1/","../","../","../"};
		findMinMoveToMainFolder(logs);
	}

	private void findMinMoveToMainFolder(String[] logs) {

		int count = 0;
		for (int i = 0; i < logs.length; i++) {
			String inputStr = logs[i];
			String subsStr = "";
			for (int j = 0; j < inputStr.length(); j++) {
				char inputChar = inputStr.charAt(j);
				if((!Character.isAlphabetic(inputChar) &&(!Character.isDigit(inputChar)))) {
					subsStr+=inputChar;
				}
				
			}

			if (subsStr.equalsIgnoreCase("../") && count != 0) {
				count--;
			} else if (subsStr.equalsIgnoreCase("/")) {
				count++;
			}
			

		}

		System.out.println(count);
	}

}
