package slidingwindow;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class P12_SubArr_K_AND_THRESHOLD {

	// https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/

	@Test
	public void testcase1() {
		int[] intarr = { 2, 2, 2, 2, 5, 5, 5, 8 };
		int k = 3, threashold = 4;
		findNumOfSubArr(intarr, k, threashold);

	}
	
	@Test
	public void testcase2() {
		int[] intarr = { 1,1,1,1,1 };
		int k = 1, threashold = 0;
		findNumOfSubArr(intarr, k, threashold);

	}
	@Test
	public void testcase3() {
		int[] intarr = {11,13,17,23,29,31,7,5,2,3};
		int k = 3, threashold = 5;
		findNumOfSubArr(intarr, k, threashold);

	}
	
	
	@Test
	public void testcase4() {
		int[] intarr = {7,7,7,7,7,7,7};
		int k =7, threashold = 7;
		findNumOfSubArr(intarr, k, threashold);

	}
	
	

	private void findNumOfSubArr(int[] intarr, int k, int threashold) {

		int windowStart = 0, count = 0, avg = 0, sum = 0;
		List<Integer> arrlist = new ArrayList<>();

		for (int windowEnd = 0; windowEnd < intarr.length; windowEnd++) {
			int inputVal = intarr[windowEnd];
			arrlist.add(inputVal);
			sum += inputVal;

			while (arrlist.size() == k) {
				avg = sum / k;
				if (avg >= threashold)count++;

				int leftVal = intarr[windowStart];
				sum -= leftVal;
				arrlist.remove(0);
				windowStart++;

			}

		}

		System.out.println(count);

	}

}
