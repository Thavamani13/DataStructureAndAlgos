package easy;

import org.junit.Test;

public class P93_MaxScoreAfterSplittingAString {
	
	//https://leetcode.com/problems/maximum-score-after-splitting-a-string/
	
	@Test
	public void testcase1() {
		String s ="011101";
		findMaxScoreOptimized(s);
	}
	
	
	@Test
	public void testcase2() {
		String s ="00111";
		findMaxScoreOptimized(s);
	}
	
	@Test
	public void testcase3() {
		String s ="1111";
		findMaxScoreOptimized(s);
	}
	@Test
	public void testcase4() {
		String s ="10";
		findMaxScoreOptimized(s);
	}
	
	
	
	private int findMaxScoreOptimized(String s) {
		int left=1,right=s.length()-1 ;
		int max= Integer.MIN_VALUE;
		
		while(left<=right) {
			int zeroCount=0,OneCount=0,sum=0;
			for (int i = 0; i < s.length(); i++) {
				char inputChar=s.charAt(i);
				if(i<left && inputChar=='0') zeroCount++;
				else if(i>=left && inputChar=='1') {
					OneCount++;
				}
			}
			sum=OneCount+zeroCount;
			max=Math.max(max, sum);
			left++;
			
		}
		
		System.out.println(max);
		return max;
		
	}

	private int findMaxScore(String s) {
		int left=1;
		int right=s.length()-1;
		int max=Integer.MIN_VALUE;
		
		while(left<=right) {
			String leftStr=s.substring(0, left);
			String rightStr=s.substring(left, s.length());
			int findMAx = findMAx(leftStr,rightStr);
			max=Math.max(max, findMAx);
			left++;
		}
		
		System.out.println(max);
		return max;
		
	}

	private int findMAx(String leftStr, String rightStr) {
		
		int zeroCount=0,oneCount=0,sum=0;
		for (int i = 0; i < leftStr.length(); i++) {
			if(leftStr.charAt(i)=='0')zeroCount++;
		}
		
		
		for (int i = 0; i < rightStr.length(); i++) {
			if(rightStr.charAt(i)=='1')oneCount++;
		}
		
		sum=zeroCount+oneCount;
		
		return sum;
		
	}

}
