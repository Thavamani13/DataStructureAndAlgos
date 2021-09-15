package leetcodeeasy;

import java.util.Arrays;

import org.junit.Test;

public class P25_ReveVowels {

	@Test
	public void testcase1() {
		String s ="hello";
		reverseVowels(s);
	}

	@Test
	public void testcase2() {
		String s ="leetcode";
		reverseVowels(s);
	}


	private String reverseVowels(String s) {


		String vowels ="AEIOUaeiou";

		char[] charArray = s.toCharArray();
		int left=0, right=charArray.length-1;

		while(left<right) {
			char leftchar = charArray[left];
			char rightChar = charArray[right];

			if(!vowels.contains(""+leftchar)) left++;
			if(!vowels.contains(""+rightChar)) right--;

			if(vowels.contains(""+leftchar)  && vowels.contains(""+rightChar)) {
				char temp=charArray[left];
				charArray[left]=charArray[right];
				charArray[right]=temp;
				left++;
				right--;
			}

		}

		System.out.println(Arrays.toString(charArray));
		String output="";
		for (int i = 0; i < charArray.length; i++) {
			output+=charArray[i];
		}
		System.out.println(output);
		return output;
	}

}
