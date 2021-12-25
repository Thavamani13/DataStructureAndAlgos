package easy;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class P75_HeightChecker {

	@Test
	public void testcase1() {
		int[] heights = { 1, 1, 4, 2, 1, 3 };
		Assert.assertEquals(3, findMisMatch(heights));
	}

	private int findMisMatch(int[] heights) {
		int[] cloneArr = heights.clone();
		Arrays.sort(cloneArr);
		int count = 0;

		for (int i = 0; i < cloneArr.length; i++) {
			if (cloneArr[i] != heights[i]) count++;
		}
		return count;

	}

}
