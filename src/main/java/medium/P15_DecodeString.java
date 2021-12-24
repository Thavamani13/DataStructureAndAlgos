package medium;

import java.util.Stack;

import org.junit.Test;

public class P15_DecodeString {
	
	@Test
	public void testcase1() {
		String s ="3[a]2[bc]";
		decodeStr(s);
	}

	private String decodeStr(String s) {
		StringBuilder sb = new StringBuilder();
		Stack<Integer> num = new Stack<>();
		Stack<StringBuilder> str = new Stack<>();
		int count = 0;
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			// 3[a]1 2[bc]
			if (Character.isDigit(s.charAt(i))) {
				count = 10 * count + s.charAt(i) - '0';
			} else if (s.charAt(i) == '[') {
				str.push(result);
				result = new StringBuilder();
				num.push(count);
				count = 0;
			} else if (s.charAt(i) == ']') {
				StringBuilder tmp = new StringBuilder();
				tmp = str.pop();
				int count1 = num.pop();
				for (int j = 0; j < count1; j++) {
					tmp.append(result);
				}
				result = tmp;
			} else {
				result.append(s.charAt(i));
			}
		}
		return result.toString();

	}

}
