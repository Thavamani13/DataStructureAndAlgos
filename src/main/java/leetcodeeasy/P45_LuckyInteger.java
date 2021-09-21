package leetcodeeasy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class P45_LuckyInteger {

	/*
	 * https://leetcode.com/problems/find-lucky-integer-in-an-array/
	 */

	@Test
	public void testcase1() {
		int[] arr= {2,2,3,4};
		Assert.assertEquals(2, findLuckInteger(arr));
	}

	@Test
	public void testcase2() {
		int[] arr= {1,2,2,3,3,3};
		Assert.assertEquals(3, findLuckInteger(arr));
	}

	@Test
	public void testcase3() {
		int[] arr= {2,2,2,3,3};
		Assert.assertEquals(-1, findLuckInteger(arr));
	}

	@Test
	public void testcase4() {
		int[] arr= {5};
		Assert.assertEquals(-1, findLuckInteger(arr));
	}

	@Test
	public void testcase5() {
		int[] arr= {7,7,7,7,7,7,7};
		Assert.assertEquals(7, findLuckInteger(arr));
	}



	/*Traverse through the array
	 * Add the occurance of each integer
	 * Apply the iterator over the map.entry set
	 *    iterate the entry set get  key and get value
	 *    if both key and values are matches
	 *             --Add it to the maxlist
	 *
	 *
	 * return if the maxlist size==0, return 1
	 *             greater than 0 , return the maxelement from the ist
	 *
	 *
	 *  We can use the max variable as well instead of maxlist--> to track the max

	*/

	private int findLuckInteger(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			int inputVal=arr[i];
			map.put(inputVal, map.getOrDefault(inputVal, 0)+1);
		}

		List<Integer> maxList=new ArrayList<Integer>();
		//Iterator<Entry<Integer, Integer>> iterator = map.entrySet().iterator();

		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		Iterator<Entry<Integer, Integer>> iterator = entrySet.iterator();



		while (iterator.hasNext()) {
			Map.Entry<java.lang.Integer, java.lang.Integer> entry = iterator.next();
			Integer key = entry.getKey();
			Integer value = entry.getValue();
			if(key==value) {
				maxList.add(key);
			}

		}

	 return maxList.size()!=0?Collections.max(maxList):-1;
	}

}
