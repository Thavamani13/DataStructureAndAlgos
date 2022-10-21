package contestproblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class P12_ContainsDuplicateII2 {
	
	//https://leetcode.com/problems/contains-duplicate-ii/
	
	@Test
	public void testcase1() {
		int[] nums = new int[] {1,2,3,1};
		int k=3;
		//containsNearbyDuplicate(nums,k);
		containsNearbyDuplicateByMap(nums,k);
	}
	
	@Test
	public void testcase2() {
		int[] nums = new int[] {1,0,1,1};
		int k=1;
		//containsNearbyDuplicate(nums,k);
		containsNearbyDuplicateByMap(nums,k);
	}
	
	@Test
	public void testcase3() {
		int[] nums = new int[] {1,2,3,1,2,3};
		int k=2;
		//containsNearbyDuplicate(nums,k);
		containsNearbyDuplicateByMap(nums,k);
	}

	private void containsNearbyDuplicateByMap(int[] nums, int k) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		System.out.println(map);
		
		
		
	}
	
}
	
	
	

	