package dailychallenge;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Assert;
import org.junit.Test;

public class P07_MajorityElement {

	/**
	 * 2)Given an array nums of size n, return the majority element. Oneu may assume
	 * that the majority element always exists in the array. The majority element is
	 * the element that appears more than ⌊n / 2⌋ times.
	 * 
	 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 * 
	 * At any point of time, there can be only one element which wil have the
	 * occurances more than n/2 times
	 * 
	 * What is the input(s)? -->intarr[] What is the expected output? int a Do I
	 * have constraints to solve the problem? Do I have all informations to go to
	 * next step!! How big is your test data set will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions
	 * 
	 * POsitive:element has more than n/2 occurance, sorted array and non sorted
	 * array Negative:No element has more than n /2 occurance , return default
	 * integer 0 Edge:Null array , Array contains duplicate values ,
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
	 */

	@Test
	public void testcase1() {

		int[] arr1 = { 1, 2, 2, 2, 2, 4, 1, 2, 2, 2 };

		Assert.assertEquals(2, findMajorityElementUsingMap(arr1));

	}

	@Test
	public void testcase2() {

		int[] arr1 = { 1, 2, 3, 4, 3, 1, 1, 1, 1, 1 };

		Assert.assertEquals(1, findMajorityElementUsingMap(arr1));

	}

	@Test
	public void testcase3() {

		int[] arr1 = { 2, 2, 1, 4, 3, 1, 1, 1, 1, 1 };

		Assert.assertEquals(1, findMajorityElementUsingMap(arr1));

	}

	@Test
	public void testcase4() {

		int[] arr1 = { 2, 2, 1, 4, 3, 6, 7, 1, 8, 1 };

		Assert.assertEquals(-1, findMajorityElementUsingMap(arr1));

	}

	/*
	 * Traverse through the loop , compare each element with every other element in
	 * the array . If it matches keep increase the count. If the count value is
	 * greater than the required occurance return the element
	 * 
	 */
	/*
	 * Time complexity--> O(n^2) SpaceComplexity -->
	 * 
	 */
	private int findMajorityElementsUsingBruteForce(int[] arr) {

		int count = arr.length / 2;

		for (int i = 0; i < arr.length; i++) {

			int occurancecount = 0;

			for (int j = 0; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					occurancecount++;
				}

			}
			if (occurancecount > count) {
				System.out.println(arr[i]);
				return arr[i];
			}

		}
		return -1;

	}

	/*
	 * find the n/2 count based on given array size . Traverse through the array and
	 * find the occuracne of each element and add it to the hasmap . Set the default
	 * occurance as 1 and increase if it have multiple occurance. If the value is
	 * greater than n/2 return the key . *
	 * 
	 * 
	 * Time complexity -->O(1)+ O(n)
	 * 
	 * Space complexity --> O(n)
	 */

	private int findMajorityElementUsingMap(int[] arr) {

		int count = arr.length / 2;

		Map<Integer, Integer> hmap = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {

			hmap.put(arr[i], hmap.getOrDefault(arr[i], 0) + 1);
		}

		Iterator<Entry<Integer, Integer>> itr = hmap.entrySet().iterator();

		while (itr.hasNext()) {
			Map.Entry<java.lang.Integer, java.lang.Integer> entry = (Map.Entry<java.lang.Integer, java.lang.Integer>) itr
					.next();

			if (entry.getValue() > count) {

				System.out.println(entry.getKey());

				return entry.getKey();
			}

		}

		return -1;
	}

}
