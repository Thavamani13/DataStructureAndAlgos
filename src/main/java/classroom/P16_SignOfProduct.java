package classroom;

import org.junit.Test;

import junit.framework.Assert;

public class P16_SignOfProduct {

	@Test
	public void testcase1() {
		int[] intarr= {-1,-2,-3,-4,3,2,1};
		Assert.assertEquals(1, findProd(intarr));
	}


	@Test
	public void testcase2() {
		int[] intarr= {-1,-2,0,-4,3,2,1};
		Assert.assertEquals(0, findProd(intarr));
	}


	/*Traverse through the array and find product

	*/
	private int findProduct(int[] intarr) {
		int product=1;
		for (int i = 0; i < intarr.length; i++) {
			if(intarr[i]==0) return 0;
			product*=intarr[i];
		}



		if(product>0) return 1;
		if(product>0) return -1;
		else {
			return 0;
		}

	}


	private int findProd(int[] intarr) {
		int minusValueCount=0;
		for (int i = 0; i < intarr.length; i++) {
			if(intarr[i]==0) return 0;
			if(intarr[i]<0) {
				minusValueCount++;
			}
		}
		return minusValueCount%2==0?1:-1;


	}
	}
