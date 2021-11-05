package easy;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class P16_SumOFUniqueElements {
	
	@Test
	public void testcase1() {
		int[] nums= {1,2,3,2};
		findSum(nums);
	}

	private int findSum(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int inputVal = nums[i];
			map.put(inputVal, map.getOrDefault(inputVal, 0) + 1);
		}

		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			int inputVal = nums[i];
			if(map.get(inputVal)==1) {
				sum+=inputVal;
			}
			
		}
         
		System.out.println(sum);
		return sum;

	}

}
