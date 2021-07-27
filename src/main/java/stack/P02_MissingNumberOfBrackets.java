package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.junit.Test;

public class P02_MissingNumberOfBrackets {

	@Test
	public void testacase1() {
		String str = "((((";
		findMissingNumberOfBrackets(str);
	}

	@Test
	public void testacase2() {
		String str = "((())";
		findMissingNumberOfBrackets(str);
	}

	@Test
	public void testacase3() {
		String str = "";
		findMissingNumberOfBrackets(str);
	}

	@Test
	public void testacase4() {
		String str = "abcd1234";
		findMissingNumberOfBrackets(str);
	}

	private int findMissingNumberOfBrackets(String str) {
		if (str.length() == 0)
			throw new RuntimeException("Invalid input");

		if (!str.contains("(") || !str.contains("("))
			return 0;

		char[] charArray = str.toCharArray();
		int open = 0, close = 0;
		for (int i = 0; i < charArray.length; i++) {
			Character charrr = charArray[i];
			if (charrr == '(')
				open++;
			else
				close++;

		}
		System.out.println(Math.abs(open - close));
		return Math.abs(open - close);

	}

}
