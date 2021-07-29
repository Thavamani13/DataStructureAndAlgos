package windowsliding;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class P09_FindDuplicatesWithinGivenTraget {

	/*
	 * Given an array and a positive number., check whether the array contains any
	 * duplicate elements within the range. If K is is more than the array’s size,
	 * the solution should check for duplicates in the complete array.
	 * 
	 * 
	 * 
	 * A[] = { 5, 6, 8, 2, 4, 6, 9 } K= 4 , no duplicates foud in target range
	 */

	/**
	 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 * 
	 * What is the input(s)? intarr[] What is the expected output? boolean Do I have
	 * constraints to solve the problem?
	 * 
	 * solve it using window sliding
	 * 
	 * Do I have all informations to go to next step!! How big is your test data set
	 * will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions Positive :
	 * Duplicates available in the target range , Negative :No duplicates found in
	 * target range Edge :Input array size is < than given target
	 * 
	 *
	 * Approaches :
	 * 
	 * 
	 * 
	 * 
	 */
	@Test
	public void testcase1() {
		int[] intarr = { 5, 6, 8, 2, 4, 6, 9 };
		int target = 4;
		Assert.assertEquals(false, findDuplicatesAvailableOrNot(intarr, target));
	}
	
	@Test
	public void testcase2() {
		int[] intarr = { 5, 6, 5, 2, 4, 6, 2 };
		int target = 4;
		Assert.assertEquals(true, findDuplicatesAvailableOrNot(intarr, target));
	}

	@Test
	public void testcase3() {
		int[] intarr = { 5, 2, 8 };
		int target = 4;
		Assert.assertEquals(false, findDuplicatesAvailableOrNot(intarr, target));
	}
	
	@Test
	public void testcase4() {
		int[] intarr = {- 2, 8, -8,-2};
		int target = 4;
		Assert.assertEquals(true, findDuplicatesAvailableOrNot(intarr, target));
	}
	
	@Test
	public void testcase5() {
		int[] intarr = {1, 8, 9,-2,2,1};
		int target = 6;
		Assert.assertEquals(true, findDuplicatesAvailableOrNot(intarr, target));
	}
	
	
	

	/*
	 * Add each value from intarray into the map .
	 * 
	 * If the [windowend - windowstart) + 1) == target] check for the duplicate Occurence
	 *               If there is duplicate,  map size will be less than target value so return true. 
	 *               If there is  no duplicate , go ahead decrement the Occurence of the left value and 
	 *                     if the 0ccurence becomes zero , move the value from the map.-->Shrink the window                   
	 *                     
	 *                     
	 * Time complexity--> O(n)   , space complexity-> O(n)
	
	
	
	
	*/
	private boolean findDuplicatesAvailableOrNot(int[] intarr, int target) {

		int windowstart = 0;
		Map<Integer, Integer> hmap = new HashMap<Integer, Integer>();

		for (int windowend = 0; windowend < intarr.length; windowend++) {
			int leftvalue = intarr[windowstart];
			int inputvalue = intarr[windowend];
			
			hmap.put(inputvalue, hmap.getOrDefault(inputvalue, 0) + 1);

			while (((windowend - windowstart) + 1) == target) {

				if (hmap.size() < target) {
					return true;
				}

				hmap.put(leftvalue, hmap.get(leftvalue) - 1);

				if (hmap.get(leftvalue) == 0) {
					hmap.remove(leftvalue);
				}

				windowstart++;

			}

		}
		return false;

	}

}
