package randomproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class P12_IntersectionOfTwoArrays {

	/*
	 * https://leetcode.com/problems/intersection-of-two-arrays-ii/
	 */

	@Test
	public void testcase1() {
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };
		Assert.assertArrayEquals(new int[] { 2, 2 }, findIntersection1(nums1, nums2));
	}

	@Test
	public void testcase2() {
		int[] nums1 = { 4, 9, 5};
		int[] nums2 = { 9, 4, 9, 84 };
		Assert.assertArrayEquals(new int[] {9,4}, findIntersection1(nums1, nums2));
	}








	private int[] findIntersection(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums1.length; i++) {
			int inputvalue = nums1[i];
			map.put(inputvalue, map.getOrDefault(inputvalue, 0)+1);
		}

		List<Integer> arrlist = new ArrayList<Integer>();
		for (int i = 0; i < nums2.length; i++) {
			int inputvalue = nums2[i];
			if(map.containsKey(inputvalue)) {
				arrlist.add(inputvalue);
				map.put(inputvalue, map.get(inputvalue)-1);
			}
		}

		int[] outputarr = new int[arrlist.size()];
		for (int i = 0; i < arrlist.size();i++) {
			outputarr[i]=arrlist.get(i);
		}

		System.out.println(Arrays.toString(outputarr));
		return outputarr;
	}




	private int[] findIntersection1(int[] nums1, int[] nums2) {
		List<Integer> arrlist = new ArrayList<Integer>();
		for (int i = 0; i < nums1.length; i++) {
			arrlist.add(nums1[i]);
		}

		System.out.println(arrlist);

		List<Integer> ouputarrlist = new ArrayList<Integer>();
		for (int i = 0; i < nums2.length; i++) {
			if (arrlist.contains(nums2[i])) {
				ouputarrlist.add(nums2[i]);
				arrlist.remove(arrlist.indexOf(nums2[i]));

			}
		}

		int[] outputarr = new int[ouputarrlist.size()];
		for (int i = 0; i <ouputarrlist.size(); i++) {
			outputarr[i] = ouputarrlist.get(i);
		}

		System.out.println(Arrays.toString(outputarr));
		return outputarr;

}


}
