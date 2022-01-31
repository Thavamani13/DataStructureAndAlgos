package easyTwo;

import org.junit.Test;

public class P11_RichestCustomerWealth {
	//https://leetcode.com/problems/richest-customer-wealth/
	
	@Test
	public void testcase1() {
		int[][] account= {{1,2,3},{3,2,1}};
		findMaxCustomerWealth(account);
	}
	
	@Test
	public void testcase2() {
		int[][] account= {{1,5},{7,3},{3,5}};
		findMaxCustomerWealth(account);
	}
	
	
	@Test
	public void testcase3() {
		int[][] account= {{2,8,7},{7,1,3},{1,9,5}};
		findMaxCustomerWealth(account);
	}
	
	

	private void findMaxCustomerWealth(int[][] account) {
		
		int max=Integer.MIN_VALUE;
		
		for (int[] accounts : account) {
			int sum=0;
			for (int amount : accounts) {
				sum+=amount;
			}
			
			max=Integer.max(sum, max);
		}
		
		System.out.println(max);
	}

	
}
