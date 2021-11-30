package easy;

import java.util.Arrays;

import org.junit.Test;

public class P45_ReverseString {
	
	/*
	 * Reverse string without changing special characters position
	 * 
	 *  abc@gmail.com
	 */
	
	@Test
	public void testcase1() {
		String s ="abc@gmail.com";
		reverseString(s);
	}

	private void reverseString(String s) {
		
		char[] charArray = s.toCharArray();
		
		int left = 0, right = charArray.length - 1;
		while (left <= right) {
			char leftChar = charArray[left];
			char rightChar = charArray[right];

			if (Character.isAlphabetic(leftChar) && Character.isAlphabetic(rightChar)) {
				char temp =charArray[left];
				charArray[left] =charArray[right];
				charArray[right] = temp;
				left++;
				right--;
			}

			else if (!Character.isAlphabetic(leftChar) && Character.isAlphabetic(rightChar)) {
				left++;
			}

			else if (Character.isAlphabetic(leftChar) && !Character.isAlphabetic(rightChar)) {
				right--;
			}
			
			else {
				left++;
				right--;
			}

		}

		System.out.println(Arrays.toString(charArray));
		
		System.out.println(String.copyValueOf(charArray));
	}

}
