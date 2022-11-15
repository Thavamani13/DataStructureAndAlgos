package contestproblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class P18_NumberOfDistincatAverages {
	//https://leetcode.com/contest/biweekly-contest-91/problems/number-of-distinct-averages/
	
	@Test
	public void testcase1() {
		int[] nums = new int[] {4,1,4,0,3,5};
		distinctAverages(nums);
	}
	
	@Test
	public void testcase2() {
		int[] nums = new int[] {1,100};
		distinctAverages(nums);
	}
	
	@Test
	public void testcase3() {
		int[] nums = new int[] {9,5,7,8,7,9,8,2,0,7};
		distinctAverages(nums);
	}


	
	private void distinctAverages(int[] nums) {
		Arrays.sort(nums);
		int left=0,right=nums.length-1;
		Set<Float> set = new HashSet<Float>();
		while(left<right) {
			if(nums[left]!=nums[right]) {
				float avg=  (float) ((nums[left]+nums[right])/2.0);
				set.add(avg);
				left++;
				right--;
			}
			else {
				float avg= nums[left];
				set.add(avg);
				left++;
			}
		}
		
		System.out.println(set.size());
	}

}
