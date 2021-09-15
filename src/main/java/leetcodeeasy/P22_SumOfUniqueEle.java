package leetcodeeasy;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class P22_SumOfUniqueEle {

	@Test
	public void testcase1() {
		int[] nums= {1,2,3,2};
		Assert.assertEquals(4, findSum(nums));
	}

	@Test
	public void testcase2() {
		int[] nums= {1,1,1,1,1};
		Assert.assertEquals(0, findSum(nums));
	}

	@Test
	public void testcase3() {
		int[] nums= {1,2,3,4,5};
		Assert.assertEquals(15, findSum(nums));
	}






	private int findSum(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int value = nums[i];
			map.put(value, map.getOrDefault(value, 0)+1);
		}
		int sum=0;
		for (int i = 0; i < nums.length; i++) {
			if(map.get(nums[i])==1) {
				sum+=nums[i];
			}
		}


		return sum;

	}

}
