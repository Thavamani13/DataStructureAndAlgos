package windowsliding;

import java.util.Arrays;

import org.junit.Test;

public class P14_FindSubArrayHavingTargetSum {

	/*
	 * Find a subarray having the given sum in an integer array
	 *
	 * {2, 6, 0, 9, 7, 3, 1, 4, 1, 10}, sum 15
	 *
	 * Subarray {6, 0, 9} exists with sum 15
	 */

	/**
	 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 *
	 * What is the input(s)? int arr[] , int target
       What is the expected output?  int subarr[]
	   Do I have constraints to
	 * solve the problem?
	   Do I have all informations to go to next step!! How big is
	 * your test data set will be?
	 *
	 * 2) Test data set
	 *
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions
	   Positive :one match , multiple match
	   Negative :no matches
	   Edge :one match with array length
	 *
	 *
	 * Approaches :	sliding window

	 *
	 *
	 *
	 */


	@Test
	public void testcase1() {
		int[] intarr= {2, 6, 0, 9, 7, 3, 1, 4, 1, 10};
		int k=15;
		findssubArray(intarr,k);

	}

	@Test
	public void testcase2() {
		int[] intarr= {2, 6, 0, 9, 7, 3, 1, 4, 1, 10};
		int k=43;
		findssubArray(intarr,k);

	}

	@Test
	public void testcase3() {
		int[] intarr= {2, 6, 0, 9, 7, 3, 1, 4, 1, 10};
		int k=58;
		findssubArray(intarr,k);

	}

	@Test
	public void testcase4() {
		int[] intarr= {2, 6, 0, 9, 7, 3, 1, 4, 1, 10};
		int k=11;
		findssubArray(intarr,k);

	}

	@Test
	public void testcase5() {
		int[] intarr= {-2,-4,-1};
		int k=-7;
		findssubArray(intarr,k);

	}







	private int[] findssubArray(int[] intarr, int k) {

		int windowstart = 0,sum = 0;

		int[] outputarr= new int[2];

		for (int windowend = 0; windowend < intarr.length; windowend++) {
			sum += intarr[windowend];
			while (sum >= k) {
				if (sum == k) {
					outputarr[0]=windowstart;
					outputarr[1]=windowend;
					System.out.println(Arrays.toString(outputarr));
					return outputarr;
				}

				else if (sum > k) {
					sum = sum - intarr[windowstart];
					windowstart++;
				}

			}

		}
		return new int[] {-1,-1};

	}
}
