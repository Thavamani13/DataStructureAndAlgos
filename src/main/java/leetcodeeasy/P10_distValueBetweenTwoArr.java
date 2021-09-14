package leetcodeeasy;

import org.junit.Test;

import junit.framework.Assert;

public class P10_distValueBetweenTwoArr {

	@Test
	public void testcase1() {
		int[] arr1= {4,5,8};
		int[] arr2= {10,9,1,8};
		int d=2;
		Assert.assertEquals(2, findDistance(arr1,arr2,d));
	}


	@Test
	public void testcase2() {
		int[] arr1= {1,4,2,3};
		int[] arr2= {-4,-3,6,10,20,30};
		int d=3;
		Assert.assertEquals(2, findDistance(arr1,arr2,d));
	}

	@Test
	public void testcase3() {
		int[] arr1= {2,1,100,3};
		int[] arr2= {-5,-2,10,-3,7};
		int d=6;
		Assert.assertEquals(1, findDistance(arr1,arr2,d));
	}


	/*Define the outer loop . take each element from outer loop and and check with each otehr elements in inner loop
	 *Find abs difference between a elenment in outer loop  with all other elements in ineer loop
	 *       if the difference for the above values becomes greater than or equal to d -->increment count
	 *
	 *       if the difference for the above values becomes lesser than or equal to d -->break
	 *

	*/
	private int findDistance(int[] arr1, int[] arr2, int d) {
		int count=0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				int difference = Math.abs(arr1[i]-arr2[j]);
				if(difference<=d) {
					break;
				}
				if(difference>d && j==arr2.length-1) {
					count++;
				}
			}


		}

     System.out.println(count);
     return count;
	}


}
