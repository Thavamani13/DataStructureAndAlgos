package windowsliding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class P07_SubArrayDIstinctElements {

	/*
	 * A[] = { 5, 2, 3, 5, 4, 3 }
	 * 
	 * The largest subarrays with all distinct elements are:
	 * 
	 * { 5, 2, 3 } { 2, 3, 5, 4 } { 5, 4, 3 }
	 */

	/**
	 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 * 
	 * What is the input(s)? int[] arr What is the expected output? intarr[] Do I
	 * have constraints to solve the problem? Do I have all informations to go to
	 * next step!! How big is your test data set will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions Positive :
	 * Negative : Edge :
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

		int[] intarr = { 5, 2, 3, 5, 4, 3 };
		findDistinctSubArrays(intarr);

	}

	public int findDistinctSubArrays(int[] intarr) {

		Map<Integer, Integer> hmap = new HashMap<Integer, Integer>();

		int windowstart = 0;

		int maxlen = Integer.MIN_VALUE;

		for (int windowend = 0; windowend < intarr.length; windowend++) {

			int inputvalue = intarr[windowend];

			hmap.put(inputvalue, hmap.getOrDefault(inputvalue, 0) + 1);

			while (hmap.size() < ((windowend + 1) - windowstart)) {

				int lastvalue = intarr[windowstart];

				int[] copyOfRange = Arrays.copyOfRange(intarr, windowstart, windowend);

				hmap.put(lastvalue, hmap.get(lastvalue) - 1);

				if (hmap.get(lastvalue) == 0) {
					hmap.remove(lastvalue);
				}

				windowstart++;

				System.out.println(Arrays.toString(copyOfRange));

			}

			maxlen = Math.max(maxlen, (windowend - windowstart) + 1);

		}

		return maxlen;

	}

}
