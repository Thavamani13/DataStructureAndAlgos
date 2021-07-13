package dailychallenge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class P08_IntersectionOfArrays {

	/*
	 * Given two integer arrays nums1 and nums2, return an array of their
	 * intersection. Each element in the result must be unique and you may return
	 * the result in any order.
	 */

	/**
	 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 * 
	 * What is the input(s)? intarr[] What is the expected output? intarr[] Do I
	 * have constraints to solve the problem? Do I have all informations to go to
	 * next step!! How big is your test data set will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions
	 * 
	 * Postive:Commaon elements avaialable, common elements availabele at the end of
	 * the array Negative:No common elements available Edge:
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

	@Test
	public void testcase1() {
		int[] arr1 = { 1, 2, 6, 7 };
		int[] arr2 = { 2, 1 };

		Assert.assertArrayEquals(new int[] { 1, 2 }, interSectionUsingTwoPointer(arr1, arr2));
	}

	@Test
	public void testcase2() {
		int[] arr1 = { 1, 2, 2, 1 };
		int[] arr2 = { 2, 2 };

		Assert.assertArrayEquals(new int[] { 2, 2 }, interSectionUsingTwoPointer(arr1, arr2));
	}

	@Test
	public void testcase3() {
		int[] arr1 = { 4, 9, 5 };
		int[] arr2 = { 9, 4, 9, 8, 4 };

		Assert.assertArrayEquals(new int[] { 4, 9 }, interSectionUsingTwoPointer(arr1, arr2));
	}

	/*
	 * Loop through the given array Compare the each elemnet from the first array
	 * with all other elements with the second array . If the value matches add it
	 * to set Set will have the common values between two array Iterate through the
	 * set and assign the values to the defined array .
	 * 
	 * 
	 * Time complexity : O(n*m) +O(n) -->O(2n*m)-->O(n*m) Space complexity --> O(n)
	 * 
	 * 
	 * 
	 */
	private int[] findInterSectionUsingBruteForce(int[] arr1, int[] arr2) {

		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr2.length; j++) {

				if (arr1[i] == arr2[j]) {

					set.add(arr1[i]);
				}

			}
		}

		int[] newarr = new int[set.size()];

		int index = 0;

		for (Integer a : set) {
			newarr[index] = a;
			index++;

		}

		return newarr;

	}

	/*
	 * Add the elements from arr1 to set1 to remove the duplicate . Repeat the same
	 * for arr2. Retain all the values from set 2 to set1.
	 * 
	 * Iterate the set1 to return the common elements .
	 * 
	 * Time complexity : O(n) +O(m) + O(n+m) + O(n)-->O(n+m) Space Complexity :
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	private int[] intersectionUsingBruteForceTwo(int[] arr1, int[] arr2) {

		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();

		for (Integer a : arr1) {
			set1.add(a);
		}

		for (Integer b : arr2) {
			set2.add(b);
		}

		set1.retainAll(set2);

		int[] newarr = new int[set1.size()];

		int index = 0;
		for (Integer c : set1) {
			newarr[index] = c;
			index++;

		}

		System.out.println(Arrays.toString(newarr));

		return newarr;

	}

	/*
	 * sorting 2 array keep the pointer 1 at the start of the index arr1. keep the
	 * pointer 2 at the start of the index arr2.
	 * 
	 * if both values are equal -- increment both the pointer and return the values
	 * 
	 * If Left pointer value is lesser than right pointer value --> Increment right
	 * . Else -->increment right pointer++
	 * 
	 * Time complexity --> O(nlogn) +O(nlogn) finding the common element -->
	 * 
	 */

	private int[] interSectionUsingTwoPointer(int[] arr1, int[] arr2) {

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		int index = 0;

		int left = 0, right = 0;
		int[] newarr = new int[index];

		while (left < arr1.length && right < arr2.length) {

			if (arr1[left] < arr2[right]) {
				left++;
			} else if (arr1[left] == arr2[right]) {
				newarr[index] = arr1[left];

				left++;
				right++;

				index++;
			}

			else {
				right++;
			}

		}
		System.out.println(Arrays.toString(newarr));
		return newarr;

	}
}