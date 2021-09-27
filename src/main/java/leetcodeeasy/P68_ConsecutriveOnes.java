package leetcodeeasy;

import org.junit.Test;

public class P68_ConsecutriveOnes {

	@Test
	public void testcase1() {
		int[] nums= {1,1,0,1,1,1};
		maxConsecutiveOnes(nums);
	}

	@Test
	public void testcase2() {
		int[] nums= {1,0,1,1,0,1};
		maxConsecutiveOnes(nums);
	}


	/*left-->0, right-->0
	 *if both left and right are equal to one --> move right  and find keep a track of max length
	 *if left is equal to 1 and right is zero
	 *        move left --> right
	 *
	 *if both left and right are equal to zero --> move left and move right

	 */
	private int maxConsecutiveOnes(int[] nums) {
		if (nums.length == 1 && nums[0] == 0)
			return 0;
		else if (nums.length == 1 && nums[0] == 1) {
			return 1;
		}

		int left = 0, right = 0;
		int max = Integer.MIN_VALUE;

		while (right < nums.length) {
			if (nums[left] == 1 && nums[right] == 1) {
				max = Math.max(max, right - left + 1);
				right++;
			}

			else if (nums[left] == 1 && nums[right] == 0) {
				left = right;
			}

			else if (nums[left] == 0 && nums[right] == 0) {
				left++;
				right++;
			}

		}

		System.out.println(max);
		return max == Integer.MIN_VALUE ? 0 : max;

	}

}
