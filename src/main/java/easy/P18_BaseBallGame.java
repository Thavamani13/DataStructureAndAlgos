package easy;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class P18_BaseBallGame {
	
	//https://leetcode.com/problems/baseball-game/
	
	@Test
	public void testcase1() {
		String[] ops= {"5","2","C","D","+"};
		findScore(ops);
	}
	
	@Test
	public void testcase2() {
		String[] ops= {"5","-2","4","C","D","9","+","+"};
		findScore(ops);
	}
	
	@Test
	public void testcase3() {
		String[] ops= {"1"};
		findScore(ops);
	}

	private int findScore(String[] ops) {
		int score = 0;

		List<Integer> arrlist = new ArrayList<Integer>();

		for (int i = 0; i < ops.length; i++) {
			String inputStr = ops[i];

			if (inputStr == "C") {
				// remove last score
				arrlist.remove(arrlist.size() - 1);
			}
			else if (inputStr == "D") {
				int previousVal = arrlist.get(arrlist.size() - 1);
				arrlist.add(2 * previousVal);

			} else if (inputStr == "+") {
				int sumVal = (arrlist.get(arrlist.size() - 1) + arrlist.get(arrlist.size() - 2));
				arrlist.add(sumVal);
			}

			else {
				int inputVal = Integer.parseInt(inputStr);
				arrlist.add(inputVal);
			}

		}

		for (int j = 0; j < arrlist.size(); j++) {
			score += arrlist.get(j);
		}
		System.out.println(score);
		return score;

	}

}
