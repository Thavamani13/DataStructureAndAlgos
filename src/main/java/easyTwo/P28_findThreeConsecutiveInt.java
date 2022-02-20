package easyTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class P28_findThreeConsecutiveInt {
	
	//https://leetcode.com/problems/find-three-consecutive-integers-that-sum-to-a-given-number/
	
	@Test
	public void testcase1() {
		int num=33;
		findConsecutiveNums(num);
	}

	private long[] findConsecutiveNums(int num) {
		
		long givenNum =num;
		if(givenNum%3==0) {
			long x= givenNum/3;
			return  new long[] {x-1,x,x+1};
		}
		
		
	    return new long[] {};
		
	}

}
