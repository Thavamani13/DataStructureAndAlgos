package leetcodeeasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class P02_ShuFfleTheArray {

	@Test
	public void testcase1() {
		int[] nums= {2,5,1,3,4,7};
		int k =3;
		shuffleArrayOptimized(nums,k);
	}

	private int[] shuffleArray(int[] nums, int k) {
		List<Integer> arrlist = new ArrayList<Integer>();

		int left=0,right=k;

		while(right<nums.length) {
			arrlist.add(nums[left]);
			arrlist.add(nums[right]);
			left++;
			right++;
		}

	  int[] outputarr= new int[arrlist.size()];
      for (int i = 0; i < arrlist.size(); i++) {
    	  outputarr[i]=arrlist.get(i);
	  }

      System.out.println(Arrays.toString(outputarr));

      return outputarr;

	}

	private int[] shuffleArrayOptimized(int[] nums, int k) {
		int[] outputarr = new int[nums.length];
		int left = 0, right = k;

		while (right < nums.length ) {
			outputarr[left] = nums[left];
			int nextIndx=left+1;
			outputarr[nextIndx] = nums[right];
			left+=2;
			right++;
		}

		System.out.println(Arrays.toString(outputarr));
		return outputarr;
	}

}
