package easyTwo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class P16_PArtitionArrTogivenPivot_R {
	
	//https://leetcode.com/problems/partition-array-according-to-given-pivot/
	
	@Test
	public void testcase1() {
		int[] nums= {9,12,5,10,14,3,10};
		int pivot =10;
		reArrange(nums,pivot);
	}
	
	@Test
	public void testcase2() {
		int[] nums= {-3,4,3,2};
		int pivot =2;
		reArrange(nums,pivot);
	}
	
	/*Create three array list
	 *Lesser
	 *Equal 
	 *Greater
	 *
	 *if < pivot , add to lesser arraylist 
	 *if = pivot , add to equal arraylist 
	 *if > pivot , add to greater arraylist 
	 *
	 *
	 * 
	 **/
	private int[] reArrange(int[] nums, int pivot) {
		List<Integer> less = new ArrayList<Integer>();
		List<Integer> equal = new ArrayList<Integer>();
		List<Integer> greater = new ArrayList<Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < pivot)
				less.add(nums[i]);
			if (nums[i] == pivot)
				equal.add(nums[i]);
			if (nums[i] > pivot)
				greater.add(nums[i]);
		}

		less.addAll(equal);
		less.addAll(greater);
		System.out.println(less);
		
		int[] arr = less.stream().mapToInt(i -> i).toArray();
		return arr;


	}

}
