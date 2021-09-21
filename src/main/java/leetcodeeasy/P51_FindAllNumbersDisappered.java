package leetcodeeasy;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class P51_FindAllNumbersDisappered {

	@Test
	public void testcase1() {
		int[] intarr = {4,3,2,7,8,2,3,1};
		findDisppearedNums(intarr);
	}

	private void findDisppearedNums(int[] intarr) {
		List<Integer> outputlist = new ArrayList<Integer>();

		int[] ascii = new int[intarr.length+1];// since range starts from 0

		for (int i = 0; i < intarr.length; i++) {
			int inputVal =intarr[i];
			ascii[inputVal]++;
		}

		for (int i = 0; i < ascii.length; i++) {
			if(i!=0 && ascii[i]==0 ) {
				outputlist.add(i);
			}

		}

		System.err.println(outputlist);

	}

}
