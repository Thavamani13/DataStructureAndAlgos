package leetcodeeasy;

import org.junit.Test;

public class P04_SubAndProdOfInteger {


	@Test
	public void testcase1() {
		int x = 234;
		findDiffBetwProdAndSum(x);
	}

	@Test
	public void testcase2() {
		int x = 5;
		findDiffBetwProdAndSum(x);
	}

	@Test
	public void testcase3() {
		int x = 120;
		findDiffBetwProdAndSum(x);
	}


	/*Divide the given num untill it becomes zero to get the last digit
	 *   once you get the last digit --> find the product and sum simultaneously
	 *
	 * At the end  of the iteration , return diff between prod - sum


	*/
	private int findDiffBetwProdAndSum(int x) {
		if(1<=x  && x<=9) return 0;

		int product=1,sum=0;
		while(x!=0) {
			int reminder = x % 10;
			int quotient = x / 10;
			product *= reminder;
			sum += reminder;
			x = quotient;
		}

		System.out.println(product -sum);


		return 0;
	}

}
