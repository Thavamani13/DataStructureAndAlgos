package easy;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class P20_SingleNumII {
	//https://leetcode.com/problems/single-number-ii/
	
	@Test
	public void testcase1() {
		int[] nums= {2,2,3,2};
		findSingleNum(nums);
	}

	private int findSingleNum(int[] nums) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			int inputVal = nums[i];
			map.put(inputVal, map.getOrDefault(inputVal, 0) + 1);
		}

		for (int i = 0; i < nums.length; i++) {
			int inputVal = nums[i];
			if (map.get(inputVal) == 1) {
				return inputVal;
			}
		}

		return 0;

	}

}
