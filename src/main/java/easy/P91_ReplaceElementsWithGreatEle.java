package easy;

import java.util.Arrays;

import org.junit.Test;

public class P91_ReplaceElementsWithGreatEle {
	//https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
	
	@Test
	public void testcase1() {
		int[] arr = {17,18,5,4,6,1};
		replaceRighteleme(arr);
	}
	
	@Test
	public void testcase2() {
		int[] arr = {100};
		replaceRighteleme(arr);
	}

	private void replaceRighteleme(int[] arr) {
		int max=Integer.MIN_VALUE;
		int[] ouputarr = new int[arr.length];
		for (int i = arr.length-1; i >=0; i--) {
			if(i==arr.length-1) ouputarr[i]=-1;
			else {
				max=Math.max(max, arr[i+1]);
				ouputarr[i]=max;
			}
		}
		
		System.out.println(Arrays.toString(ouputarr));
	}

}
