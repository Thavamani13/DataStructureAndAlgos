package easy;

import org.junit.Test;

public class P59_MaxDepthOfParanthesis {
	
	@Test
	public void testcase1() {
		String s ="(1+(2*3)+((8)/4))+1";
		findCounts(s);
	}
	
	@Test
	public void testcase2() {
		String s ="(1)+((2))+(((3)))";
		findCounts(s);
	}
	
	@Test
	public void testcase3() {
		String s ="1+(2*3)/(2-1)";
		findCounts(s);
	}
	
	@Test
	public void testcase4() {
		String s ="1";
		findCounts(s);
	}

	private int findCounts(String s) {
		
		int openCount=0,max=Integer.MIN_VALUE;
		for (int i = 0; i < s.length(); i++) {
			char inputChar = s.charAt(i);
			if(inputChar=='(') openCount++;
			if(inputChar==')') openCount--;
			max=Math.max(max, openCount);
		}
		
		System.out.println(max);
		return max;
	}

}
