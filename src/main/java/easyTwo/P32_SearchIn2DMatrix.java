package easyTwo;

import org.junit.Test;

import junit.framework.Assert;

public class P32_SearchIn2DMatrix {
	//https://leetcode.com/problems/search-a-2d-matrix/
	
	@Test
	public void testcase1() {
		int[][] intarr=new int[][] {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int target=3;
		Assert.assertEquals(true, searchTargetElement(intarr,target));
	}

	private boolean searchTargetElement(int[][] intarr,int target) {
		for (int[] subArr : intarr) {
			for (int i : subArr) {
				if(target==i) return true;
			}
			
		}
		return false;
	}

}
