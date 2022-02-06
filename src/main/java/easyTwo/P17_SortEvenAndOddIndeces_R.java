package easyTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class P17_SortEvenAndOddIndeces_R {
	
	//https://leetcode.com/problems/sort-even-and-odd-indices-independently/

	@Test
	public void testcase1() {
		int[] nums = { 4, 1, 2, 3 };
		sor(nums);
	}

	@Test
	public void testcase2() {
		int[] nums = { 2, 1 };
		sor(nums);
	}

	@Test
	public void testcase3() {
		int[] nums = { 5, 39, 33, 5, 12, 27, 20, 45, 14, 25, 32, 33, 30, 30, 9, 14, 44, 15, 21 };
		sor(nums);
	}

	private int[] sor(int[] nums) {

		List<Integer> oddArrList = new ArrayList<Integer>();
		List<Integer> evenArrList = new ArrayList<Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0)
				evenArrList.add(nums[i]);
			else {
				oddArrList.add(nums[i]);
			}
		}

		Collections.sort(evenArrList);
		Collections.sort(oddArrList, Collections.reverseOrder());

		System.out.println(evenArrList);
		System.out.println(oddArrList);

		List<Integer> outputlist = new ArrayList<Integer>();

		int max = Math.max(evenArrList.size(), oddArrList.size());

		int index = 0;
		while (index < max) {
			if (index < evenArrList.size() && index < oddArrList.size()) {
				outputlist.add(evenArrList.get(index));
				outputlist.add(oddArrList.get(index));
				index++;
			}

			if (index < evenArrList.size() && index >= oddArrList.size()) {
				outputlist.add(evenArrList.get(index));
				index++;
			}

			if (index >= evenArrList.size() && index < oddArrList.size()) {
				outputlist.add(oddArrList.get(index));
				index++;
			}

		}

		int[] arr = outputlist.stream().mapToInt(i -> i).toArray();
		return arr;

	}

}
