package easy;

import java.util.Arrays;

import org.junit.Test;

public class P39_FlipImage {
	
	//https://leetcode.com/problems/flipping-an-image/
	
	@Test
	public void testcase1() {
		int[][] imageArr={{1,1,0},{1,0,1},{0,0,0}};
		flipImage(imageArr);
	}

	
	private void flipImage(int[][] imageArr) {
		
		
		for (int i = 0; i < imageArr.length; i++) {

			int[] innerArr = imageArr[i];

			int left = 0, right = innerArr.length - 1;

			while (left <= right) {
				int temp = innerArr[left];
				innerArr[left] = innerArr[right];
				innerArr[right] = temp;
				left++;
				right--;
			}

			for (int j = 0; j < innerArr.length; j++) {
				if (innerArr[j] == 0) innerArr[j] = 1;
				else if (innerArr[j] == 1) innerArr[j] = 0;

			}

		}

		System.out.println(Arrays.deepToString(imageArr));
	}

}
