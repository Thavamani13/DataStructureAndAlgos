package easy;

import org.junit.Test;

import junit.framework.Assert;

public class P82_AappearsBeforeBs {
	
	@Test
	public void testcase1() {
		String s ="aaabbb";
		Assert.assertEquals(true, AaapearsBeforeBs(s));
	}
	
	@Test
	public void testcase2() {
		String s ="abab";
		Assert.assertEquals(false, AaapearsBeforeBs(s));
	}
	
	@Test
	public void testcase3() {
		String s ="bbb";
		Assert.assertEquals(true, AaapearsBeforeBs(s));
	}
	
	@Test
	public void testcase4() {
		String s ="a";
		Assert.assertEquals(true, AaapearsBeforeBs(s));
	}

	private boolean AaapearsBeforeBs(String s) {
		
		if(!s.contains("a")) return true;
        if(!s.contains("b")) return true;
        
		int lastIndexOfA = s.lastIndexOf("a");
		int firstIndexOfB = s.indexOf("b");
		
        return lastIndexOfA<firstIndexOfB;

		
	}

}
