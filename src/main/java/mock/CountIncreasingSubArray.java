package mock;

import org.junit.Test;

import junit.framework.Assert;

public class CountIncreasingSubArray {

	@Test
	public void testcase1() {
		int[] intarr= {5,3,5,7,8};
		int k=3;
		Assert.assertEquals(2, findCounts(intarr,k));
	}

	@Test
	public void testcase2() {
		int[] intarr= {5,3,5,7,8};
		int k=2;
		Assert.assertEquals(3, findCounts(intarr,k));

	}
	@Test
	public void testcase3() {
		int[] intarr= {1,2,3,4,2,1,3};
		int k=2;
		Assert.assertEquals(4, findCounts(intarr,k));

	}

	@Test
	public void testcase4() {
		int[] intarr= {1,2,3,4,5};
		int k=3;
		Assert.assertEquals(3, findCounts(intarr,k));

	}

/*keep left and right at start of the index
	 * check if the right+1 value is greater than the right value
	 *                           if not --> move left to right
	 *                           if yes-->increment right, and check if right+1 is greater than right value.
	 *
	 *When the length of the subarray equals to 3
	 *              increment the counter and move left.
	 *
	 *
	*/
	private int findCounts(int[] intarr, int k) {

		//1,2,3,4,2,1,3

		//1,2,3,4,2,1,3
		//12345
		//5,3,5,7,8
		int count=0;
		int windowstart=0;
		for (int windowend = 1; windowend < intarr.length; windowend++) {
			if(intarr[windowstart]>intarr[windowend]) {
				windowstart=windowend;
			}
			while(intarr[windowstart]<intarr[windowend] && ((windowend-windowstart)+1==k)) {
				count++;
				windowstart++;
			}

		}

		System.out.println(count);
		return count;
	}

}
