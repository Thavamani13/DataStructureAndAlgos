package easy;

import org.junit.Test;

public class P03_MAxConsecutiveOnes {

	@Test
	public void testcase1() {
		int[] intarr = { 1, 1, 0, 1, 1, 1 };
		findCounts(intarr);
	}

	@Test
	public void testcase2() {
		int[] intarr = { 1, 0, 1, 1, 0, 1 };
		findCounts(intarr);
	}

	private int findCounts(int[] intarr) {

		int left = 0;
		int right = 0;
		int max = Integer.MIN_VALUE;
		int count = 0;
		while (right < intarr.length) {
			int leftVal = intarr[left];
			int rightVal = intarr[right];

			if (leftVal == 1 && rightVal == 1) {
				count++;
				right++;
			}

			else if (rightVal == 0 && leftVal == 1) {
				max = Math.max(count, max);
				left = right;
				count=0;
			}

			else if (rightVal == 0 && leftVal == 0) {
				left++;
				right++;
			}
		}

		max = Math.max(count, max);
		System.out.println(max);
		return max;
	}

}
