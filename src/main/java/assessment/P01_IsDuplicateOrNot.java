package assessment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import junit.framework.Assert;

public class P01_IsDuplicateOrNot {

	/**
	 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 * 
	 * What is the input(s)? What is the expected output? Do I have constraints to
	 * solve the problem? Do I have all informations to go to next step!! How big is
	 * your test data set will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions
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
	 */

	public void testcase1() {
		int[] arr = { 1, 2, 3, 1 };
		Assert.assertEquals(true, findDuplicateOrNotUsingSet(arr));
	}

	public void testcase2() {
		int[] arr = { 1, 2, 3, 4 };
		Assert.assertEquals(true, findDuplicateOrNotUsingMap(arr));
	}

	public void testcase3() {
		int[] arr = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		Assert.assertEquals(true, findDuplicateOrNotUsingMap(arr));
	}

	/*
	 * Time complexity --> O(n) Space complexity -->O(n)
	 * 
	 * 
	 */

	private boolean findDuplicateOrNotUsingSet(int[] arr) {

		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);

		}

		if (set.size() != arr.length) {
			return true;
		}

		return false;
	}

	private boolean findDuplicateOrNotUsingMap(int[] arr) {

		Map<Integer, Integer> hmap = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			hmap.put(arr[i], hmap.getOrDefault(hmap.get(arr[i]), 0) + 1);
		}

		Iterator<Entry<Integer, Integer>> itr = hmap.entrySet().iterator();

		while (itr.hasNext()) {
			Map.Entry<java.lang.Integer, java.lang.Integer> entry = (Map.Entry<java.lang.Integer, java.lang.Integer>) itr
					.next();

			if (entry.getValue() > 1) {
				System.out.println("The key for value " + " is " + entry.getKey());

				return true;

			}

		}

		return false;

	}
	
	
	private boolean isdupliacteUsingTwoPointers(int[] arr) {
		
		Arrays.sort(arr);
		
		int left=0;
		int right=left+1;
		
		
		
		return false;
		
	}

}
