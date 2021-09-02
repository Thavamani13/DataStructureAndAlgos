package randomproblems;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class P01_BestTimeToBuyAndSellStock {


	/*
	 * 	1.
	    Input(s)?  intarr[]
	    Output ?  int
	    Constraints ?

	2. Test data set

	        Positive :
	        Negative :
	        Edge     :

	3. Known Approaches
	        Approach 1 : Bruteforce
	        Approach 2 :

	4. O-Notations
			Approach 1 :

	5. Pseudocode
 *
 */








	@Test
	public void testcase1() {
		int[] intarr= {7,1,5,3,6,4};
		Assert.assertEquals(5, findMAxProfit(intarr));
	}

	@Test
	public void testcase2() {
		int[] intarr= {7,6,3,2,1};
		Assert.assertEquals(0, findMAxProfit(intarr));
	}

	@Test
	public void testcase3() {
		int[] intarr= {7,8,4,1};
		Assert.assertEquals(1, findMAxProfit(intarr));
	}


	/*Loop through the given array ,
	 *  compare one value , with all other values from the array
	 *      if the other values are greater than the current value
	 *              *find difference between 2 values and retain the max value,Add the max value to set
	 *
	 *
	 * if the array is in decreasing order , no match can be found . in order to return 0 . Add 0 to the set by default.
	 *
	   return the max value from set at the end of the iteration .


	   Time-->O(n2)
	   Space-->O(n)
	*/

	private int findMAxProfit(int[] intarr) {
		if(intarr.length==1) return 0;
		int max=Integer.MIN_VALUE;
		Set<Integer> set = new HashSet<Integer>();
		set.add(0);

		for (int i = 0; i < intarr.length-1; i++) {
			for (int j = i+1; j < intarr.length; j++) {
				int diff=0;
				if(intarr[j]>intarr[i]) {
					diff= intarr[j]-intarr[i];
					max=Math.max(max, diff);
					set.add(max);
				}
			}}

		System.out.println(Collections.max(set));
		return Collections.max(set);

	}

}
