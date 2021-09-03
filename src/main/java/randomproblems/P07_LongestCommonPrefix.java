package randomproblems;

import org.junit.Test;

import junit.framework.Assert;

public class P07_LongestCommonPrefix {

	@Test
	public void testcase1() {
		String[] input = {"flower","flow","flight"};
		Assert.assertEquals("fl", findLongestCommonPrefix(input));
	}

	@Test
	public void testcase2() {
		String[] input = {"flower","flow",};
		Assert.assertEquals("flow", findLongestCommonPrefix(input));
	}


	@Test
	public void testcase3() {
		String[] input = {"flower"};
		Assert.assertEquals("flower", findLongestCommonPrefix(input));
	}

	@Test
	public void testcase4() {
		String[] input = {"foower","fuow","fsight"};
		Assert.assertEquals("f", findLongestCommonPrefix(input));
	}

	@Test
	public void testcase5() {
		String[] input = {"cap","captain","capital"};
		Assert.assertEquals("cap", findLongestCommonPrefix(input));
	}




	/*Declare PrefixLength-->initially as first string length
	 *Start traversing from1 , through the String array and update the current max prefix length as minlength of previous string and current string
	 *
	 *Traverse upto max prefix length and check for the character equality.
	 *      leftchar--> cahracter from the first string
	 *      rightchar--> character from the second string
	 *
	 *      if there is a mismatch between the leftchar and right character , break the loop and max prefixlength can be upto j pointer.
	 *
	 *
	 * Finally return the substring from Firststring-->starts from  0 to updatedprefixlength.
	 *
	 *        -


	*/

	private String findLongestCommonPrefix(String[] input) {
		if(input.length==0) return "";
		if(input.length==1) {
			return input[0];
		}

		int maxPrefixLength=input[0].length();

		for (int i = 1; i < input.length; i++) {
			maxPrefixLength=Math.min(maxPrefixLength, input[i].length());

			for (int j = 0; j <maxPrefixLength; j++) {
				      char leftchar =  input[0].charAt(j);
				      char rightChar = input[i].charAt(j);

				      if(leftchar!=rightChar) {
				    	  maxPrefixLength =j;
				    	  break;
				      }

			}

		}

		System.out.println(input[0].substring(0, maxPrefixLength));
		return input[0].substring(0, maxPrefixLength);

	}

}
