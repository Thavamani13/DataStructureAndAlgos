package easy;

import org.junit.Test;

import com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer;

public class P08_DistanceBetwenTwoArr {
	
	//https://leetcode.com/problems/find-the-distance-value-between-two-arrays/
	
	@Test
	public void testcase1() {
		int[] intarrOne= {4,5,8};
		int[] intarrTwo= {10,9,1,8};
		int d=2;
		findCounts(intarrOne,intarrTwo,d);
	}

	private int findCounts(int[] intarrOne, int[] intarrTwo,int d) {
		int count = 0;
		for (int i = 0; i < intarrOne.length; i++) {
			int leftVal = intarrOne[i];
			for (int j = 0; j < intarrTwo.length; j++) {
				int rightVal = intarrTwo[j];
				if (Math.abs(rightVal - leftVal) > d && j == intarrTwo.length - 1) {
					count++;
				} else if (Math.abs(rightVal - leftVal) <= d) {
					break;
				}

			}
		}

		System.out.println(count);
		return count;
	}

}
