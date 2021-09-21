package leetcodeeasy;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class P45_MajorityElement {

	@Test
	public void testcase1() {
		int[] intarr= {3,2,3};
		Assert.assertEquals(3, findMajorityElementusingAscii(intarr));
	}

	@Test
	public void testcase2() {
		int[] intarr= {2,2,1,1,1,2,2};
		Assert.assertEquals(2, findMajorityElement(intarr));
	}

	/*
	 * length--> intarr length Majority element occurance--> greater
	 * thanintarr.length/2
	 *
	 * Define map-->add occuranceof each inteeger value
	 *
	 * travers through the array and check if the input val occurance is higher than
	 * occurance
	 *
	 * if yes-->return inputval
	 *
	 * time -->O(n)
	 * space-->O(n)
	 *
	 *
	 */

	private int findMajorityElement(int[] intarr) {
		int length = intarr.length;
		int occurance=length/2;

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < intarr.length; i++) {
			int inputVal=intarr[i];
			map.put(inputVal, map.getOrDefault(inputVal, 0)+1);
		}

		for (int i = 0; i < intarr.length; i++) {
			int inputVal=intarr[i];
			if(map.get(inputVal)>occurance) return inputVal;
		}

		return -1;
	}



	private int findMajorityElementusingAscii(int[] intarr) {
		int length = intarr.length;
		int occurance = length / 2;

		int[] ascii = new int[length];
		for (int i = 0; i < intarr.length; i++) {
			int inputVal = intarr[i];
			ascii[inputVal]++;
			if (ascii[inputVal] > occurance) {
				return inputVal;
			}
		}

		return -1;
	}

}
