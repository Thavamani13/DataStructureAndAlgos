package easy;

import org.junit.Test;

public class P10_SumAndProdOFInteger {
	// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

	@Test
	public void testcase1() {
		int n = 234;
		findProdAndSum(n);
	}

	private int findProdAndSum(int n) {

		String s = String.valueOf(n);
		int sum = 0, product = 1, res;
		for (int i = 0; i < s.length(); i++) {
			char inputchar = s.charAt(i);
			int value = inputchar - '0';
			sum = sum + value;
			product = product * value;
		}

		res = product - sum;
		return res;
	}

}
