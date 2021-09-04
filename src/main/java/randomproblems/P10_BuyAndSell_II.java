package randomproblems;

import org.junit.Test;

import junit.framework.Assert;

public class P10_BuyAndSell_II {

	@Test
	public void testcase1() {
		int[] prices = {7,1,5,3,6,4};
		Assert.assertEquals(7, findMaxProfit(prices));

	}

	@Test
	public void testcase2() {
		int[] prices = {1,2,3,4,5};
		Assert.assertEquals(4, findMaxProfit(prices));

	}

	@Test
	public void testcase3() {
		int[] prices = {7,6,4,3,1};
		Assert.assertEquals(0, findMaxProfit(prices));

	}




	private int findMaxProfit(int[] prices) {
		if(prices.length ==0) return 0;
		if(prices.length ==1) throw new RuntimeException("invalid input");

		int minPrice=prices[0];
		int maxProfitSum=0;

		//1,2,3,4,5

		for (int i = 1; i < prices.length; i++) {
			minPrice=Math.min(minPrice, prices[i]);

			if(prices[i]>minPrice) {
				maxProfitSum += prices[i]-minPrice;
				minPrice=prices[i];
			}

		}

		System.out.println(maxProfitSum);
		return maxProfitSum;

	}

}
