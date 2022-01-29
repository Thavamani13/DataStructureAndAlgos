package easyTwo;

import java.util.Arrays;

import org.junit.Test;

public class P04_FindNUniqueSum2 {
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
	
	/*Define tha array of given "n"
	 * keep two pointers ,
	 *    Assign negative value of "n" to the left side and increment left pointer
	 *    Assign positive value of "n " to the right side and decrement right pointer
	 * 
	 *if left==right  assign 0 and incremnet / decrement any one pointer    
	  * 
	*/

	private int[] findNUniqueSum(int n) {
		int[] outputarr = new int[n];
		
		int left=0,right=outputarr.length-1;
		while(left<=right) {
			int value =n;
			if(left==right) {
				outputarr[left]=0;
				left++;
			}
			else {
				outputarr[left]=-value;
				outputarr[right]=value;
				left++;
				right--;
				
			}
			
			n--;
		}
		
		System.out.println(Arrays.toString(outputarr));
		return outputarr;
	}

}
