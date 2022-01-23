package easy;

import java.util.Arrays;

import org.junit.Test;

public class P97_CandiesWithDiscount {
	
	@Test
	public void testcase1() {
		int[] cost = {1,2,3};
		findMinCost(cost);
	}
	
	@Test
	public void testcase2() {
		int[] cost = {6,5,7,9,2,2};
		findMinCost(cost);
	}
	
	
	@Test
	public void testcase3() {
		int[] cost = {5,5};
		findMinCost(cost);
	}
	
	

	private int findMinCost(int[] cost) {
		Arrays.sort(cost);		
		int sum=0;
		int count=0;
		for (int i = cost.length-1; i >=0 ;i--) {
			count++;
			if(count<3) {
				sum+=cost[i];
				
			}
			else if(count==3) {
				count=0;
			}
		}
		
		System.out.println(sum);
		return sum;
	}

}
