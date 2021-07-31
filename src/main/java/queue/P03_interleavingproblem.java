package queue;

import java.util.ArrayDeque;

import org.junit.Test;

public class P03_interleavingproblem {

	@Test
	public void testcase1() {
		int[] intarr= {1,3,5,7,2,4,6,8};
		System.out.println(findinterleaving(intarr));

	}

	@Test
	public void testcase2() {
		int[] intarr= {1,2,3,4,11,12,13,14};
		System.out.println(findinterleaving(intarr));

	}

	private ArrayDeque<Integer> findinterleaving(int[] intarr) {
		int left=0,right=intarr.length/2;
		ArrayDeque<Integer> arrdeq= new ArrayDeque<Integer>();

		while (	right<intarr.length) {
			arrdeq.offer(intarr[left++]);
			arrdeq.offer(intarr[right++]);

		}

		return arrdeq;

	}

}
