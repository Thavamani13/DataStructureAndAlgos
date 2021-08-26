package dailychallenge;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class P43_TwoSum {

	@Test
	public void testcase1() {
		int[] nums= {2,7,11,15};
		int target=9;
		findTwoSum(nums,target);
	}

	/*Define a  map , add input value and indices to the map
	 * Traverse through the map , check if the map contains {targetvalue-inputvalue}
	 *          if YES ->return {i,index of the (target -inputval)}
	 *          if NO -->add the element to map and its indices
	 *
	 * Time-->O(n)
	 * Space-->O(n)

	*/
	private int[] findTwoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			int inputval = nums[i];
			if (map.containsKey(target - inputval)) {
				return new int[] { i, map.get(target - inputval) };
			}

			map.put(inputval, i);

		}

		return new int[] {};

	}

}
