package easy;

import org.junit.Test;

import junit.framework.Assert;

public class P68_LongestIncreasingSubSequence {
	
	@Test
	public void testcase1() {
		int[] nums= {1,3,5,4,7};
		Assert.assertEquals(3, findLongestIncreasingSubseq(nums));
	}
	
	@Test
	public void testcase2() {
		int[] nums= {2,2,2,2,2};
		Assert.assertEquals(1, findLongestIncreasingSubseq(nums));
	}

	
	@Test
	public void testcase3() {
		int[] nums= {1,3,5,4,2,3,4};
		Assert.assertEquals(3, findLongestIncreasingSubseq(nums));
	}
	private int findLongestIncreasingSubseq(int[] nums) {
		
		int index = 0, max = Integer.MIN_VALUE;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[i-1]) {
				max = Math.max(max, (i-index) + 1);
			}

			else if ( nums[i]<=nums[i-1]) {
				index = i;
				max = Math.max(max, (i - index) + 1);
			}
		}

		System.out.println( max);
		return max==Integer.MIN_VALUE?1:max;
	}

}
