package leetcodeeasy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class P12_NumOfSmallElements {

	@Test
	public void testcase1() {
		int[] nums = {8,1,2,2,3};
		findsmallerNumsOptimized(nums);

	}

	private int[] findsmallerNums(int[] nums) {
		int[] outputarr = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] < nums[i]) {
					count++;
				}

			}
			outputarr[i] = count;
		}

		return outputarr;
	}



	private int[] findsmallerNumsOptimized(int[] nums) {

		int[] clone = nums.clone(); //clone to re use the original array
		Arrays.sort(nums);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();// map the value with the index

		for (int i = 0; i < nums.length; i++) {
			if(!map.containsKey(nums[i])) {
				map.put(nums[i], i);  // if already contains no operation . no to overwrite the key with updated index
			}

		}
        System.out.println(map);
        for (int i = 0; i < clone.length; i++) {
			clone[i]=map.get(clone[i]);
		}

		System.out.println(Arrays.toString(clone));

		return clone;
	}

}