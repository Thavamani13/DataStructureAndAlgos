package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class P98_CountElements {
	
	@Test
	public void testcase1() {
		int[] intarr= {11,7,2,15};
		findCounts(intarr);
	}
	
	@Test
	public void testcase2() {
		int[] intarr= {-3,3,3,90};
		findCounts(intarr);
	}
	
	@Test
	public void testcase3() {
		int[] intarr= {-71,-71,93,-71,40};
		findCounts(intarr);
	}

	
	private int findCounts(int[] intarr) {
		Arrays.sort(intarr);
		int count=0;
		
		for (int i = 1; i < intarr.length-1; i++) {
			int index=i;
			boolean leftSearch = leftSearch(index,intarr);
			boolean rightSearch = rightSearch(index,intarr);
			if(leftSearch==true && rightSearch==true) {
				count++;
			}
		}
		
		
		System.out.println(count);
		return count;
		
		
		
		
		
	}

	private boolean rightSearch(int index, int[] intarr) {
		
		for (int i = index; i <intarr.length-1; i++) {
			if(intarr[i+1]>intarr[i]) {
				return true;
			}
		}
		
		return false;
		
	}

	private boolean leftSearch(int index, int[] intarr) {
		
		for (int i = index; i >0; i--) {
			if(intarr[i]>intarr[i-1]) {
				return true;
			}
		}
		
		return false;
	}

}
