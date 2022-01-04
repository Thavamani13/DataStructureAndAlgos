package easy;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class P84_CheckIfNumbersAreAscending {
	//https://leetcode.com/problems/check-if-numbers-are-ascending-in-a-sentence/
	
	@Test
	public void testcase1() {
		String s ="1 box has 3 blue 4 red 6 green and 12 yellow marbles";
		Assert.assertEquals(true, isNumbersAreAscending(s));
	}
	
	@Test
	public void testcase2() {
		String s ="hello world 5 x 5";
		Assert.assertEquals(false, isNumbersAreAscending(s));
	}
	
	@Test
	public void testcase3() {
		String s ="sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s";
		Assert.assertEquals(false, isNumbersAreAscending(s));
	}

	private boolean isNumbersAreAscending(String s) {
		int max=Integer.MIN_VALUE;
		
		String[] splitArr = s.split(" ");
		for (int i = 0; i < splitArr.length; i++) {
			String inputStr = splitArr[i];
			if(Character.isDigit(inputStr.charAt(0))) {
				int value = Integer.parseInt(inputStr);
				if(value<=max) {
					return false;
				}
				else {
					max=Math.max(max, value);
				}
			}
		}
		
		return true;
	}

}
