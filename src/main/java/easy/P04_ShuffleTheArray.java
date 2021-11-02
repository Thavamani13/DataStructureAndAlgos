package easy;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class P04_ShuffleTheArray {
	
	@Test
	public void testcase1() {
		int[] intarr= {2,5,1,3,4,7};
		int n=3;
		Assert.assertArrayEquals(new int[] {2,3,5,4,1,7}, shuffleArray(intarr,n));
	}

	private int[] shuffleArray(int[] intarr, int n) {
		int[] outputarr = new int[intarr.length];

		int left = 0;
		int right = n;
		int index=0;
		while (right < intarr.length) {
			outputarr[index] = intarr[left];
			index++;
			outputarr[index] = intarr[right];
			index++;
			left++;
			right++;
		}

		System.out.println(Arrays.toString(outputarr));

		return outputarr;

	}

}
