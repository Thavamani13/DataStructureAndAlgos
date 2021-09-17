package leetcodeeasy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class P33_NumOfDiffDigitInString {

	@Test
	public void testcase1() {
		String s ="a123bc34d8ef34";
		Assert.assertEquals(3, findNumOfDiffDigits(s));
	}

	@Test
	public void testcase2() {
		String s ="leet1234code234";
		Assert.assertEquals(2, findNumOfDiffDigits(s));
	}

	@Test
	public void testcase3() {
		String s ="a1b01c001";
		Assert.assertEquals(1, findNumOfDiffDigits(s));
	}


	/*Split the string  using regex
	 *if teh string length is not equal to zero--> it can be a numeric value .
	 *     Trim the numeric string and convert to inteeger add it to the set
	 *
	 *  return the set size .
	 *
	 *  Since input string length can be in the range of 0 to1000,
	 *       we need data type to store the 1000 digit nums -->hence instead of integer use double
	 *
	 *
	*/

	private int findNumOfDiffDigits(String s) {
		 String[] splitStr = s.split("[a-z]");
			System.out.println(Arrays.toString(splitStr));
			Set<Double> set  = new HashSet<Double>();

			for (String string : splitStr) {
				if(string.length()!=0) {
					String trim = string.trim();
					double value = Double.parseDouble(trim);
					set.add(value);
				}

			}

			System.out.println(set.size());
			return set.size();
		}}