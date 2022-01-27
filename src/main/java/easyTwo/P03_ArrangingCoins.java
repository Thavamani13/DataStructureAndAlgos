package easyTwo;

import org.junit.Test;

public class P03_ArrangingCoins {
	
	//https://leetcode.com/problems/arranging-coins/
	
	@Test
	public void testcase1() {
		int n =5;
		arrangeCoins(n);
	}
	
	@Test
	public void testcase2() {
		int n =8;
		arrangeCoins(n);
	}
	
	@Test
	public void testcase3() {
		int n =10;
		arrangeCoins(n);
	}
	
	/*Subtract the given Value"n" with the minusValue(startswith1)
	 *Reassign the subtracted value back to n and increment the counter  and minusValue.
	 *      Repeat the step two untill minusValue becomes greater than N. 
	 * 
	  * */
	private void arrangeCoins(int n) {
		int count=0,minusVal=1,remainingVal=0;
		
		while(minusVal<=n) {
			remainingVal=n-minusVal;
			n=remainingVal;
			minusVal++;
			count++;
			
		}
		
		System.out.println(count);
		
		
	}
		

}
