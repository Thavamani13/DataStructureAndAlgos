package assessment2;

import org.junit.Test;

import junit.framework.Assert;

public class P4_CharacterReprogramming {

	/*
	 * A control device has 4 buttons that can be used to move a character around a
	 * screen in 4 directions: Up (U), Down (D), Left (L), and Right (R). The
	 * movement needs to be optimized by deleting unnecessary instructions while
	 * maintaining the same destination. Given the original set of instructions,
	 * what is the maximum number that can be deleted and still have the character
	 * reach the destination? Note: The instructions that are deleted do not need to
	 * be contiguous.
	 */

	/*
	 * Given an original set of instructions s = 'URDR', the final destination is 2
	 * units to the right of the initial position after the character moves up,
	 * right, down, and right. If 'U' and 'D' are deleted, the destination remains
	 * the same. The answer 2 will be returned.
	 */
	@Test
	public void testcase1() {
		String str = "URDR";
		Assert.assertEquals(2, findDeletionRequired(str));
	}

	@Test
	public void testcase2() {
		String str = "RRR";
		Assert.assertEquals(0, findDeletionRequired(str));

	}

	@Test
	public void testcase3() {
		String str = "DD";
		Assert.assertEquals(0, findDeletionRequired(str));

	}
	
	@Test
	public void testcase4() {
		String str = "RUDRL";
		Assert.assertEquals(4, findDeletionRequired(str));

	}
	
	/*Traverse through the given string 
	 * If the Character is U or D increment the count by 1 , else decrement by 1.
	 * Find the difference between string length and SUM
	 * return the [stringlen - SUM]	
	 * 
	 * Time complexity --> O(n) space complexity --> O(1)
	*/
	private int findDeletionRequired(String str) {

		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'R' || str.charAt(i) == 'U') {
				sum += 1;
			}

			else
				sum -= 1;
         }

		sum = Math.abs(sum);
		System.out.println((str.length() - sum));
		return str.length() - sum;

	}

}
