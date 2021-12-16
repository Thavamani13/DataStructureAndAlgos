package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class P69_FindHighestAltitude {

	// https://leetcode.com/problems/find-the-highest-altitude/

	@Test
	public void testcase1() {
		int[] intarr = { -5, 1, 5, 0, -7 };
		findHighestAltitude(intarr);
	}

	@Test
	public void testcase2() {
		int[] intarr = { -4, -3, -2, -1, 4, 3, 2 };
		findHighestAltitude(intarr);
	}

	private int findHighestAltitude(int[] intarr) {
		int[] outputarr = new int[1];

		int sum = 0;
		for (int i = 0; i < intarr.length; i++) {
			int inputVal = intarr[i];
			sum += inputVal;
			if (sum > outputarr[0]) {
				outputarr[0]=sum;
			}

		}

		System.out.println(Arrays.toString(outputarr));
		return outputarr[0];
	}

}
