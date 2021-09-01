package dynamicprogramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class P02_FroggyJump {



	//STRICTLY DECREASING

	@Test
	public void example1() {
		int[] nums = {6,13,10,8,11,7,3,5,2};
		Assert.assertEquals(6, maxFrogJumps(nums));
	}



	@Test
	public void example2() {
		int[] nums = {6,4,5,4,3,2,1};
		Assert.assertEquals(6, maxFrogJumps(nums));
	}

	@Test
	public void example3() {
		int[] nums = {5,7,11,9,10,7,6,3,5,2,1};
		Assert.assertEquals(7, maxFrogJumps(nums));
	}

	@Test
	public void example4() {
		int[] nums = {5,7,16,9,10,15,14,13,12,7,6,3,5,2,1};
		Assert.assertEquals(10, maxFrogJumps(nums));
	}



	//6,13,10,8,11,7,3,5,2

	/*Define o/p array with givenarray size and set the default value as one
	 *
	 *Keep left and right at 0 . increment right to one ..since it wont satisfy any condition
	 *
	 *if(right>=1)we have to scan through all the left  elements , do the modification in the output array based on below condition.
	 *
	 *SINCE its STRICTLY DECREASING ORDER.
	 *
	 *    if my current element is lesser than the left element
	 *         look up the value from output arr for both the indeces[left ] and right
	 *         increment the look up value by
	 *           place the MAX value to the output arr[right]
	 *
	 *

      MY LEFT ELEMENT HAS TO BE LESSER THAN CURRENT ELEMENT [right]


      time->O(n2)
      space -->O(n)
	*/


    private int maxFrogJumps(int[] nums) {
    	//6,13,10,8,11,7,3,5,2
    	int[] outputarr =new int[nums.length];
    	for (int i = 0; i < outputarr.length; i++) {
    		outputarr[i]=1;
    	}

    	int left=0;
    	int right=0;

		while (right < nums.length) {

			if (right >= 1) {
				for (int i =left; i <right; i++) {
					if (nums[i]>nums[right]) {
						int temp = outputarr[i] + 1;
						outputarr[right] = Math.max(temp, outputarr[right]);
				    }

				 }
				right++;
			}

			else {
				right++;
			}

		}

    	Set<Integer> set = new HashSet<Integer>();
		System.out.println(Arrays.toString(outputarr));
		for (int i = 0; i < outputarr.length; i++) {
			set.add(outputarr[i]);
		}
		System.out.println(Collections.max(set));
		return Collections.max(set);





	}




}
