package leetcodeeasy;

import org.junit.Test;

public class P12_sumTwoDigit {


	@Test
	public void testcase1() {
		int [] nums = {1,1000,80,-91};
		findsum(nums);
	}

	private void findsum(int[] nums) {
		int sum=0;
		for (int i = 0; i < nums.length; i++) {
			 int inputVal =nums[i];
			 if((nums[i] >(9) && nums[i]<=99)||(nums[i] <(-9) && nums[i]>=-99)) {
				 sum+=inputVal;
			 }
		}

		System.out.println(sum);

	}
}
