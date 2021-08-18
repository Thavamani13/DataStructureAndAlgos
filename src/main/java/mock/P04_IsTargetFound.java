package mock;

import org.junit.Test;

import junit.framework.Assert;

public class P04_IsTargetFound {


	@Test
	public void testcase1() {
		int[] intarr= {1,4,20,3,10,5};
		int target = 33;
		Assert.assertEquals(true, isTargetMatching(intarr,target));
	}

	@Test
	public void testcase2() {
		int[] intarr= {1,4,20,3,10,5};
		int target = 60;
		Assert.assertEquals(false, isTargetMatching(intarr,target));
	}

	@Test
	public void testcase3() {
		int[] intarr= {1,4,20,3,10,5};
		int target = 2;
		Assert.assertEquals(false, isTargetMatching(intarr,target));
	}

	@Test
	public void testcase5() {
		int[] intarr= {5,5,5};
		int target = 5;
		Assert.assertEquals(true, isTargetMatching(intarr,target));
	}


	@Test
	public void testcase4() {
		int[] intarr= {};
		int target = 2;
	}

    /*loop through the given array
	 *add the sum of each element to get the target value
	 *         if the sum exceeded than the target value shrink the window, and check for the match.
	 *         if the sum is equal to target value return true
	 *
	 * At the end of the iteration , return false
	 *
	 * Time -->O(n) ,space O(1)
*/
	private boolean isTargetMatching(int[] intarr, int target) {
		if(intarr.length==0) throw new RuntimeException("Invalid input");

		int windowstart = 0;
		int sum = 0;
		for (int windowend = 0; windowend < intarr.length; windowend++) {
			sum += intarr[windowend];
			if (sum == target) return true;
			while (sum > target) {
				 sum -=intarr[windowstart];
				if(sum==target) return true;
				windowstart++;
			}

		}
		return false;

	}

}
