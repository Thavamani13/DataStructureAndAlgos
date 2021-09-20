package leetcodeeasy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class P42_RankTransFormArray {

	@Test
	public void testcase1() {
		int [] intarr= {40,10,20,30};
		transformTheArr(intarr);

	}

	@Test
	public void testcase2() {
		int [] intarr= {100,100,100};
		transformTheArr(intarr);

	}

	@Test
	public void testcase3() {
		int [] intarr= {37,12,28,9,100,56,80,5,12};
		transformTheArr(intarr);

	}

	/*clone the given array to retain the order for further itertation
	 *Sort the given array  to find the rank using map
	 *Define the map , Add the integer as key and index+1 as value
	 *         if the input char is already available in the map ignore , move on
	 *
	 *Define output array
	 *Traverse through the clone array and check for the corresponding value from the map
	  Return the outputarr


	  ==> if you use inedex+1, third case will get incremental values

	*/
	private void transformTheArr(int[] intarr) {
		int[] clone = intarr.clone();
		Arrays.sort(intarr);
		int rank=0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i <intarr.length; i++) {
			int inputVal = intarr[i];
			if (!map.containsKey(inputVal)) {
				map.put(inputVal, rank+=1);
			}
		}

		int[] outputArr = new int[clone.length];
		for (int i = 0; i < clone.length; i++) {
			int inputVal = clone[i];
			outputArr[i] = map.get(inputVal);
		}
		System.out.println(Arrays.toString(outputArr));

	}

}
