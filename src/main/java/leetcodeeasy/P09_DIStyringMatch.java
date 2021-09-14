package leetcodeeasy;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class P09_DIStyringMatch {

	@Test
	public void testcase1() {
		String s ="IDID";
		Assert.assertArrayEquals(new int[] {0, 4, 1, 3, 2}, findDIStringMAtch(s));
	}

	@Test
	public void testcase2() {
		String s ="III";
		Assert.assertArrayEquals(new int[] {0,1,2,3}, findDIStringMAtch(s));
	}

	@Test
	public void testcase3() {
		String s ="DDI";
		Assert.assertArrayEquals(new int[] {3,2,0,1}, findDIStringMAtch(s));
	}


	/*keep left at 0 and right as str.length
	 *Traverse through the input string .
	 *   if the input string is I --> assign the left value to outputarr and increment left
	 *   if the input string is D --> assign the right value to outputarr and decrement left
	 *
	 *   if the pointer reaches the endpoint(str.length) you can assign either left or right value .since both letf and right
	 *   points to the same value . break the looop
	 *
	 * return the array
	 *
	 * Time complexity --> O(n)
	 * Space Complexity-->O(n)
	 *
	 */
	private int[] findDIStringMAtch(String s) {
		int left=0,right=s.length();

		int[] outputArr = new int[s.length()+1];

		for (int i = 0; i <=s.length(); i++) {
			 if(i==s.length()) {
				 outputArr[i]=left;
				 break;
			 }

			 char inputChar = s.charAt(i);
			 if(inputChar=='I') {
				 outputArr[i]=left;
				 left++;
			 }

			 if(inputChar=='D') {
				 outputArr[i]=right;
				 right--;
			 }


		}

		System.out.println(Arrays.toString(outputArr));
		return outputArr;
	}

}
