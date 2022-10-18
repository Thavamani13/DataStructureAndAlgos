package contestproblems;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class P01_CountNumberOFDistinctInteger {
	
	@Test
	public void testcase1() {
		int[] intarr = new int[] {1,13,10,12,31};
		countDistinctIntegers(intarr);
	}
	
	@Test
	public void testcase2() {
		int[] intarr = new int[] {2,2,2};
		countDistinctIntegers(intarr);
	}
	
	/*BruteForce:
	 * Iterate the given array and convert each number to string 
	 *   reverse the string 
	 *   convert the reversed string to number 
	 * 
	 * 
	 * 
	 * 
	*/
	
	private int countDistinctIntegers(int[] intarr) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < intarr.length; i++) {
			int inputVal=intarr[i];
			set.add(inputVal);
			
			String str = String.valueOf(inputVal);
			StringBuilder sb = new StringBuilder(str);
			String reversedStr = sb.reverse().toString();
			
			Integer intValue = Integer.valueOf(reversedStr);
			set.add(intValue);
		}
		System.out.println(set);
		
		return 0;
		
	}

}
