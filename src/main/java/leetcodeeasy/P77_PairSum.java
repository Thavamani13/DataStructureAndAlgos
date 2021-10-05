package leetcodeeasy;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class P77_PairSum {
	
	@Test
	public void testcase1() {
		int[] intarr= {1,2,7,6,4,2};
		int target=8;
		findPairSum(intarr,target);
		
	}
	
	
	

	private void findPairSum(int[] intarr, int target) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for (int i = 0; i < intarr.length - 1; i++) {
			for (int j = i + 1; j < intarr.length; j++) {
				if (intarr[i] + intarr[j] == target) {
					List<Integer> sublist = new ArrayList<>();
					sublist.add(intarr[i]);
					sublist.add(intarr[j]);
					list.add(sublist);

				}

			}
		}

		System.out.println(list);
	}

}
