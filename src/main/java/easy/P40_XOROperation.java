package easy;

import org.junit.Test;

public class P40_XOROperation {
	
	//https://leetcode.com/problems/xor-operation-in-an-array/
	@Test
	public void testcase1() {
		int n =5 , start=0;
		performXorOperation(n,start);
	}
	
	@Test
	public void testcase2() {
		int n =4 , start=3;
		performXorOperation(n,start);
	}
	
	@Test
	public void testcase3() {
		int n =1 , start=7;
		performXorOperation(n,start);
	}
	
	

	private int performXorOperation(int n, int start) {
		int[] nums = new int[n];
		
		int count=0;
		for (int i = 0; i < nums.length; i++) {
			nums[i]=start+2*i;
			count^=nums[i];
		}
		
		System.out.println(count);
		
		return count;
		
	
	}

}
