package classroom;

import java.util.Arrays;

import org.junit.Test;

public class P18_SortColours {

	/*
	 * https://leetcode.com/problems/sort-colors/
	 */
	@Test
	public void testcase1() {
		int[] nums= {2,0,2,1,1,0};
		sortColors(nums);
	}

	/*Declare blue red and white
	 *Traverse through the array and increment the counter of the colour based upon the input value
	 *
	 *Traverse through the max
	 *   if the pointer is lesser than the red assign zzero
	 *   if the pointer is in between red and lesser than white value ->assign 1
	 *   if the pointer is greater than/equal to white value -->assign 2
	 *
	*/
	private int[] sortColors(int[] nums) {
		if(nums.length<=1) return nums;
		int blue=0,red=0,white=0;
		int max=0;

		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==0) red++;
			if(nums[i]==1) white++;
			if(nums[i]==2) blue++;

		}
		 max=blue+red+white;

		for (int i = 0; i < max; i++) {
			if (i < red) {
				nums[i] = 0;
			}
			else if (i >= red && i < red+white) {
				nums[i] = 1;
			}
			else if(i>=white){
				nums[i] = 2;
			}

		}

		System.out.println(Arrays.toString(nums));
		return nums;

	}

}
