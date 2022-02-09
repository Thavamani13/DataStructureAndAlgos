package easyTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class P21_findKUniqpairs {
	//https://leetcode.com/problems/k-diff-pairs-in-an-array/description/
	
	@Test
	public void testcase1() {
		int[] nums = {3,1,4,1,5};
		int k=2;
		findPairs(nums,k);
	}
	
	@Test
	public void testcase2() {
		int[] nums = {1,2,3,4,5};
		int k=1;
		findPairs(nums,k);
	}
	
	@Test
	public void testcase3() {
		int[] nums = {1,2,3,4,5};
		int k=0;
		findPairs(nums,k);
	}
	
	@Test
	public void testcase4() {
		int[] nums = {1,2,4,4,3,3,0,9,2,3};
		int k=4;
		findPairs(nums,k);
	}
	

	
	@Test
	public void testcase5() {
		int[] nums = {6,7,3,6,4,6,3,5,6,9};
		int k=3;
		findPairs(nums,k);
	}
	
	
	
	@Test
	public void testcase6() {
		int[] nums = {6,3,5,7,2,3,3,8,2,4};
		int k=2;
		findPairs(nums,k);
	}
	
	
	@Test
	public void testcase7() {
		int[] nums = {1,1,1,2,2};
		int k=0;
		findPairs(nums,k);
	}
	

	private int findPairs(int[] nums, int k) {
		Set<String> set = new HashSet<String>();
		
		Arrays.sort(nums);
		int left=0,right=1;
		while(right<nums.length) {
			if(Math.abs(nums[left]-nums[right])<k) {
				right++;
			}
			else if(Math.abs(nums[left]-nums[right])>k) {
				left++;
			}
			else {
				if(left!=right) {
					set.add(""+nums[left++]+nums[right++]);
				}
				else {
					right++;
				}
			}
		}
		System.out.println(set.size());	
		return set.size();
	}

}
