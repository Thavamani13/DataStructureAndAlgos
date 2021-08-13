package hashing;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class P03_SumOfUniqueElements {
	/*
	 * https://leetcode.com/problems/sum-of-unique-elements/
	 */
	@Test
	public void testcase1() {
		int[] nums= {1,2,3,2};
		Assert.assertEquals(4, findSum(nums));
	}

	@Test
	public void testcase2() {
		int[] nums= {1,1,1,1};
		Assert.assertEquals(0, findSum(nums));
	}

	@Test
	public void testcase3() {
		int[] nums= {1,4,3,5};
		Assert.assertEquals(4, findSum(nums));
	}

	/*Define hashmap ,
	 * Traverse through the array and add occuracnes of each inteeger to the map
	 *
	 * Traverse through the given array
	 *               if the occurances  of an integer is equal to 1 sum up the integer value
	 * return sum

	*/
	private int findSum(int[] nums) {
		int sum=0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++){
            int inputvalue = nums[i];
            map.put(inputvalue,map.getOrDefault(inputvalue,0)+1);
        }

        for(int i=0;i<nums.length;i++){
            int inputvalue = nums[i];
            if(map.get(inputvalue)==1){
                sum+=inputvalue;
            }
        }


        return sum;

    }
}