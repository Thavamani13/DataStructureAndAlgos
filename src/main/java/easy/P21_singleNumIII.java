package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class P21_singleNumIII {
	
	//https://leetcode.com/problems/single-number-iii/
	
	@Test
	public void testcase1() {
		int[] nums= {1,2,1,3,2,5};
		findSingleNums(nums);
		
  }

	private int[] findSingleNums(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] outputarr = new int[2];
		int index = 0;

		for (int i = 0; i < nums.length; i++) {
			int inputVal = nums[i];
			map.put(inputVal, map.getOrDefault(inputVal, 0) + 1);
		}

		for (int i = 0; i < nums.length; i++) {
			int inputVal = nums[i];
			if (map.get(inputVal) == 1) {
				outputarr[index] = inputVal;
				index++;

			}
		}

		System.out.println(Arrays.toString(outputarr));
		return outputarr;
	}

}
