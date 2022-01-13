package easy;

import org.junit.Test;

public class P93_MaxScoreAfterSplittingAString {
	
	@Test
	public void testcase1() {
		String s ="011101";
		findMaxScore(s);
	}
	
	
	@Test
	public void testcase2() {
		String s ="00111";
		findMaxScore(s);
	}
	
	@Test
	public void testcase3() {
		String s ="1111";
		findMaxScore(s);
	}
	
	@Test
	public void testcase4() {
		String s ="01";
		findMaxScore(s);
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
