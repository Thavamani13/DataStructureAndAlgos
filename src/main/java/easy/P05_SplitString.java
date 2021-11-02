package easy;

import org.junit.Test;

import junit.framework.Assert;

public class P05_SplitString {
	
	//https://leetcode.com/problems/split-a-string-in-balanced-strings/
	
	@Test
	public void testcase1() {
		String s ="RLRRLLRLRL";
		Assert.assertEquals(4, findBalancedStrcount(s));
	}
	
	@Test
	public void testcase2() {
		String s ="RLLLLRRRLR";
		Assert.assertEquals(3, findBalancedStrcount(s));
	}

	private int findBalancedStrcount(String s) {
		int Lcount = 0, RCount = 0,blancedCount=0;
		
		for (int i = 0; i < s.length(); i++) {
			char inputChar = s.charAt(i);
			if (inputChar == 'L')
				Lcount++;
			else
				RCount++;
			if(Lcount==RCount) {
				blancedCount++;
			}
			
		}

		System.out.println(blancedCount);
		return blancedCount;
	}

}
