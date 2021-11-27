package easy;

import org.junit.Test;

public class P42_Max69Numb {
	
	//https://leetcode.com/problems/maximum-69-number/

	@Test
	public void testcase1() {
		int num = 6699;
		findMaxNum(num);
	}

	private void findMaxNum(int num) {

		String str = String.valueOf(num);

		char[] charArr = str.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			char inputChar = charArr[i];
			if (inputChar == '6') {
				charArr[i] = '9';
				break;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < charArr.length; i++) {
			sb.append(charArr[i]);
		}

		String value = sb.toString();
		System.out.println(Integer.parseInt(value));

	}

}
