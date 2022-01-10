package easy;

import org.junit.Test;

public class P90_FurthestHouse {
	
	//https://leetcode.com/problems/two-furthest-houses-with-different-colors/
	@Test
	public void testcase1() {
		int[] colours = {1,1,1,6,1,1,1};
		findMaxDistance(colours);
	}
	
	@Test
	public void testcase2() {
		int[] colours = {1,8,3,8,3};
		findMaxDistance(colours);
	}
	
	@Test
	public void testcase3() {
		int[] colours = {0,1};
		findMaxDistance(colours);
	}

	private int findMaxDistance(int[] colours) {
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < colours.length-1; i++) {
			for (int j = i+1; j < colours.length; j++) {
				if(colours[i]!=colours[j]) {
					max=Math.max(max, j-i);
				}
			}
			
			
		}
		System.out.println(max);
		return max==Integer.MIN_VALUE?0:max;
		
	}

}
