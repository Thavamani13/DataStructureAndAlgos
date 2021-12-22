package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class P55_MinAbsDiff {

	// https://leetcode.com/problems/minimum-absolute-difference/

	@Test
	public void testcase1() {
		int[] intarr = { 4, 2, 1, 3 };
		findPairs(intarr);
	}

	@Test
	public void testcase2() {
		int[] intarr = { 1, 3, 6, 10, 15 };
		findPairs(intarr);
	}

	@Test
	public void testcase3() {
		int[] intarr = { 3, 8, -10, 23, 19, -4, -14, 27 };
		findPairs(intarr);

	}

	@Test
	public void testcase4() {
		int[] intarr = { 40, 11, 26, 27, -20 };
		findPairs(intarr);

	}

	private void findPairs(int[] intarr) {

		List<List<Integer>> resultlist = new ArrayList<List<Integer>>();

		int[] clone = intarr.clone();
		Arrays.sort(clone);

		int minAbsDiff = Integer.MAX_VALUE;

		for (int i = 0; i < intarr.length - 1; i++) {
			int leftValue = intarr[i];
			for (int j = i+1; j < intarr.length; j++) {
				int rightValue = intarr[j];
				minAbsDiff = Math.min(minAbsDiff, Math.abs(leftValue - rightValue));
			}
		}

		System.out.println(minAbsDiff);
		
		for (int i = 0; i < clone.length; i++) {
			int leftVal = clone[i];

			for (int j = 0; j < clone.length; j++) {
				int rightVal = clone[j];
				if (leftVal < rightVal && Math.abs(leftVal - rightVal) == minAbsDiff) {
					List<Integer> arrlist = new ArrayList<>();
					arrlist.add(leftVal);
					arrlist.add(rightVal);
					resultlist.add(arrlist);

				}

			}

		}

		System.out.println(resultlist);
	}

}
