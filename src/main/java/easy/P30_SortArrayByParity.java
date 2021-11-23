package easy;

import java.util.Arrays;

import org.junit.Test;

public class P30_SortArrayByParity {
	
	//https://leetcode.com/problems/sort-array-by-parity/
	
	@Test
	public void testcase1() {
		int[] nums= {3,1,2,4};
		sortArr(nums);
	}

	
	
	
	/*move even to left side ,odd to right side 
	 * 
	 * 
	 * 
	 * 
	 * 
	
	*/
	
	private void sortArr(int[] nums) {
		
		int left=0,right=nums.length-1;
		
		while (left <= right) {
			int leftVal = nums[left];
			int rightVal = nums[right];

			if (leftVal % 2 == 0 && rightVal % 2 != 0) {
				left++;
				right--;
			}

			else if (leftVal % 2 != 0 && rightVal % 2 == 0) {
				int temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
				left++;
				right--;
			}

			else if (leftVal % 2 == 0 && rightVal % 2 == 0) {
				left++;

			}

			else if (leftVal % 2 != 0 && rightVal % 2 != 0) {
				right--;

			}

		}
		
		System.out.println(Arrays.toString(nums));

	}

}
