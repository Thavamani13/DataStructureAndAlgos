package dailychallenge;

import org.junit.Test;

public class SlidingWindowProblem {

	@Test

	public void testcase1() {

		String x = "YazaAay";

		findNicerString(x);

	}

	private void findNicerString(String x) {

		char[] charArray = x.toCharArray();

		int left = charArray[0];
		int right = charArray[1];

		for (int i = 0; i < charArray.length; i++) {

			if (left != right) {

				left++;
				right++;
			}

			if (charArray[left] == charArray[right]) {

			}
		}

	}

}
