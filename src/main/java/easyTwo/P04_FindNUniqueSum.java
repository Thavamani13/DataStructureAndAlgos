package easyTwo;

import java.util.Arrays;

import org.junit.Test;

public class P04_FindNUniqueSum {
	//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
	@Test
	public void testcase1() {
		int n=5;
		findNUniqueSum(n);
	}
	
	@Test
	public void testcase2() {
		int n=3;
		findNUniqueSum(n);
	}
	
	@Test
	public void testcase3() {
		int n=1;
		findNUniqueSum(n);
	}
	
	@Test
	public void testcase4() {
		int n=4;
		findNUniqueSum(n);
	}
	
	/*Find quotient to define the starting range of the input 
	 * 
	 * if the remainder is not equal to zero : 
	 *             We can define the number range starts from -Quotient to +Quotient 
	 * if the reminder is eual to zero 
	 *             We have to neglect zero when we defind the range of numbers from -Quotient to +Quotient 
	 *             When we neglect zero it has to be filled up by the next element
	 *                          
	 * 
	 * 
	*/

	private void findNUniqueSum(int n) {
		int quotient=n/2;
		int NegVersion=-quotient;
		
		int remainder=n%2;
		
		int[] outputarr = new int[n];
		
		if(remainder!=0) {
			for (int i = 0; i <outputarr.length; i++) {
				outputarr[i]=NegVersion;
				NegVersion++;
			}
		}
		
		else {
			
			for (int i = 0; i <outputarr.length; i++) {
				if(NegVersion>=0) {
					outputarr[i]=NegVersion+1;
					NegVersion++;
				}
				else {
					outputarr[i]=NegVersion;
					NegVersion++;
				}
				
			}
		}
		
		System.out.println(Arrays.toString(outputarr));
	}

}
