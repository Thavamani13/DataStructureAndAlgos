package leetcodeeasy;

import org.junit.Test;

import junit.framework.Assert;

public class P07_SplitAString {

	@Test
	public void testcase1() {
		String s ="RLRRLLRLRL";
		Assert.assertEquals(4, findCounts(s));
	}

	@Test
	public void testcase2() {
		String s ="RLLLLRRRLR";
		Assert.assertEquals(3, findCounts(s));
	}

	@Test
	public void testcase3() {
		String s ="LLLLRRRR";
		Assert.assertEquals(1, findCounts(s));
	}

	@Test
	public void testcase4() {
		String s ="RLRRRLLRLL";
		Assert.assertEquals(2, findCounts(s));
	}


	/*Declare the count for each character L and R
	 *if the input char is L / R --> increment the respective character count
	 *   At the end of each increment, check for the equality of L AND R counts
	 *                if counts are equal increment the split count and  break
	 *                if counts are not equal go for further iteration
	*/
	private int findCounts(String s) {
		int Rcount=0;
		int LCount=0;

		int splitCount=0;
		for (int i = 0; i < s.length(); i++) {
			char inputChar = s.charAt(i);
			if(inputChar=='L') LCount++;
			if(inputChar=='R') Rcount++;

			while(Rcount==LCount) {
				splitCount++;
				break;

			}
		}

		System.out.println(splitCount);
		return splitCount;

	}

}
