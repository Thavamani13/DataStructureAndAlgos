package easy;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class P63_KthDistinctString {

	// https://leetcode.com/problems/kth-distinct-string-in-an-array/

	@Test
	public void testcase1() {
		String[] arr = { "d", "b", "c", "b", "c", "a" };
		int k = 2;
		findKthDistinctstr(arr, k);
	}

	private String findKthDistinctstr(String[] arr, int k) {
		int count = 1;
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < arr.length; i++) {
			String inputstr = arr[i];
			map.put(inputstr, map.getOrDefault(inputstr, 0) + 1);
		}

		for (int i = 0; i < arr.length; i++) {
			String inputstr = arr[i];
			if (map.get(inputstr) == 1 && count == k) {
				return inputstr;
			}

			else if (map.get(inputstr) == 1 && count < k) {
				count++;
			}
		}

		return "";
	}

}
