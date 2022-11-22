package contestproblems;

import java.util.Arrays;

import org.junit.Test;

public class P19_FinalPRiceWithDiscount {
	
	//https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/description/
	
	@Test
	public void testcase1() {
		int[] intarr = new int[] {8,4,6,2,3};
		finalPrices(intarr);
	}
	
	@Test
	public void testcase2() {
		int[] intarr = new int[] {1,2,3,4,5};
		finalPrices(intarr);
	}
	
	@Test
	public void testcase3() {
		int[] intarr = new int[] {10,1,1,6};
		finalPrices(intarr);
	}

	private int[] finalPrices(int[] intarr) {
		
		if(intarr.length==1) return intarr;
		
		for (int i = 0; i < intarr.length-1; i++) {
			int leftVal= intarr[i];
			
			for (int j = i+1; j < intarr.length; j++) {
				int rightVal= intarr[j];
				if(rightVal<=leftVal) {
					intarr[i]=leftVal-rightVal;
					break;
				}
				
				if(rightVal>leftVal && j==intarr.length ) {
					intarr[i]=leftVal;
				}
				
				
			}
			
		}
		
		
		
		System.out.println(Arrays.toString(intarr));
		return intarr;
		
	}

}
