package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class P70_CanMakeAPFromSequence {
	//https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
	
	@Test
	public void testcase1() {
	  int[] arr = {3,5,1};
	  canMakeAPOrNot(arr);
	}

	private boolean canMakeAPOrNot(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		Arrays.sort(arr);

		for (int i = 0; i < arr.length - 1; i++) {
			int difference = arr[i + 1] - arr[i];
			set.add(difference);
		}
		return set.size() == 1;

	}

}
