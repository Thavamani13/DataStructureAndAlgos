package contestproblems;

import java.util.Arrays;

import org.junit.Test;

public class P21_findPairs {

	@Test
	public void testcase1() {
		int[] nums = new int[] { 1, 3, 2, 1, 3, 2, 2 };
		numberOfPairs(nums);

	}

	@Test
	public void testcase2() {
		int[] nums = new int[] { 1, 1 };
		numberOfPairs(nums);

	}

	@Test
	public void testcase3() {
		int[] nums = new int[] { 0 };
		numberOfPairs(nums);

	}

	private void numberOfPairs(int[] nums) {
		Arrays.sort(nums);
		
		int left=0, right=1,count=0;
		int[] ouputArr = new int[2];
		
		
		while(right<nums.length) {
			int leftVal  = nums[left];
			int rightVal = nums[right];
			
			if(leftVal==rightVal) {
				count++;
				ouputArr[0]=count;
				left+=2;
				right+=2;
			}
			
			else {
				left++;
				right++;
			}
			
		}
		
		int leftOutNumCount=nums.length-(2*count);
		ouputArr[1]=leftOutNumCount;
		System.out.println(Arrays.toString(ouputArr));
         
          
	}

}
