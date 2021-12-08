package easy;

import org.junit.Test;

public class P47_CountOfMatches {
	//https://leetcode.com/problems/count-of-matches-in-tournament/
	
	@Test
	public void testcase1() {
		int n =7;
		findNumOFMatches(n);
	}
	
	@Test
	public void testcase2() {
		int n =14;
		findNumOFMatches(n);
	}

	private void findNumOFMatches(int n) {
		int count = 0;

		while (n != 1) {

			if (n % 2 == 0) {
				int matches = n / 2;
				count += matches;
				n = matches;

			} else if (n % 2 != 0) {
				count += (n - 1) / 2;
				n = ((n - 1) / 2) + 1;
			}
		}

		System.out.println(count);
	}

}
