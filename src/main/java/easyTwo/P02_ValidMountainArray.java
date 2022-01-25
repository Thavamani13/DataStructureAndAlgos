package easyTwo;

import org.junit.Test;

import junit.framework.Assert;

public class P02_ValidMountainArray {
	
	@Test
	public void testcase1() {
		int[] intarr= {0,2,3,4,5,2,1,0};
		Assert.assertEquals(true, isMountainArrayOrNot(intarr));
	}
	
	@Test
	public void testcase2() {
		int[] intarr= {2,1};
		Assert.assertEquals(false, isMountainArrayOrNot(intarr));
	}
	
	@Test
	public void testcase3() {
		int[] intarr= {3,5,5};
		Assert.assertEquals(false, isMountainArrayOrNot(intarr));
	}
	
	@Test
	public void testcase4() {
		int[] intarr= {0,3,2,1};
		Assert.assertEquals(true, isMountainArrayOrNot(intarr));
	}

	/*Find the max Value index
	 *Do left search from max value index and validate its strictly decreasing or not 
	 *Do right search from maxValue and validate its strictly increasing or not 
	 *
	 *False conditions:
	 *    if the length of the array is less than 3 --> return false 
	 *    max Value index cannot be at the start or end of the array --> return false
	 *    
	*/
	private boolean isMountainArrayOrNot(int[] intarr) {
		
		if(intarr.length<3) return false;
		
		int max=Integer.MIN_VALUE, maxIndex=0;
		for (int i = 0; i < intarr.length; i++) {
			if(max!=intarr[i]) {
				max =Math.max(intarr[i], max);
				if(max==intarr[i]) {
					maxIndex=i;
				}
			}
			
	    }
		
		System.out.println(maxIndex);
		boolean leftSearch = leftSearch(maxIndex,intarr);
		boolean rightSearch = rightSearch(maxIndex,intarr);
		if(leftSearch==true && rightSearch==true) {
			return true;
		}
		
		return false;
	}

	private boolean rightSearch(int maxIndex, int[] intarr) {
		for (int i = maxIndex; i < intarr.length-1; i++) {
			if(intarr[i+1]>=intarr[i]) return false;
		}
		return true;
	}

	private boolean leftSearch(int maxIndex, int[] intarr) {
		for (int i = maxIndex; i >0; i--) {
			if(intarr[i-1]>=intarr[i]) return false;
		}
		return true;
	}

}
