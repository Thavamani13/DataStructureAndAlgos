package twoPointer;

import java.util.Arrays;

import org.junit.Test;

public class P03_MoveAllZerosToRight {
	
	/* Move all zeros to right 
	 * int[] arr = { 1, 2, 0, 4, 3, 0, 5, 0 };
	 */
	
	/**
	 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 * 
	 * What is the input(s)? intarr[] 
       What is the expected output?  intarr[]
	   Do I have constraints to
	 * solve the problem?
	 * 
	 * Solve using 2 pointers 
	 *  
	   Do I have all informations to go to next step!! How big is
	 * your test data set will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions
	 * 
	   Positive :Zeros in the middle , zeros at first , zeros at the end 
	   Negative :No zeros 
	   Edge :Null array / array length 1 .
	 * 
	 * 3) Do I know how to solve it?
	 * 
	 * Yes - great, is there an alternate? No - Can I break down the problem into
	 * sub problems?
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Do I know alternate solutions as well?
	 * 
	 * Yes - What are those? No - That is still fine, proceed to solve by what you
	 * know !!
	 * 
	 * 6) If you know alternate solutions -> find out the O Notations (Performance)
	 * 
	 * Then, explain either both or the best (depends on the time)
	 * 
	 * Approach 1: Start with worst -> Improve (Optimize) -> End up with the best
	 * Approach 2: Write down the options and benefits and code the best
	 * 
	 * 7) Start always with Psuedo code
	 * 
	 * 8) Implement them in the code (editor)
	 * 
	 * 9) Test against the different data set
	 * 
	 * 10) If it fails, debug them to solve it !! /
	 * 
	 * 
	 * 
	 */
	
	
	@Test
	public void testcase1() {
		int[] intarr= {1, 2, 0, 4, 3, 0, 5, 0};
		moveZerosToLast(intarr);
	}
	
	
	@Test
	public void testcase2() {
		int[] intarr= {0,5,1,0,0,4,4};
		moveZerosToLast(intarr);
	}
	
	@Test
	public void testcase3() {
		int[] intarr= {};
		moveZerosToLast(intarr);
	}
	
	@Test
	public void testcase4() {
		int[] intarr= {4};
		moveZerosToLast(intarr);
	}
	
	@Test
	public void testcase5() {
		int[] intarr= {2,8,0,0,0,0,6,7};
		moveZerosToLast(intarr);
	}
	
	
	
	
	/*low--> 0 , right --> arr.len-1
	 * if right is 0 move right--> righ--
	 * if left is zero , swap the value between left and right and increment left , decrement right 
	 * otherwise increment left
	 * 
	 * COntinue the loop untill left is equal to right
	 * 
	 * Time complexity--> O(n) space -->O(1)
	
	*/
	private int[] moveZerosToLast(int[] intarr) {
		
		if (intarr.length==1 || intarr.length==0)  return intarr;
		
		
		int left=0, right=intarr.length-1;
				
		while (left<right) {
			
			if (intarr[right]==0) right--;
			
			if(intarr[left]==0) {
				
				int temp=intarr[left];
				intarr[left]=intarr[right];
				intarr[right]=temp;
				
				left++;
				right--;
			}
			
			else left++;
			
		}
		
		System.out.println(Arrays.toString(intarr));
		return intarr;
		
	}
}
