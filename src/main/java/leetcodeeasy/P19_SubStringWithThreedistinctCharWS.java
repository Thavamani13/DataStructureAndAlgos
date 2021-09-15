package leetcodeeasy;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class P19_SubStringWithThreedistinctCharWS {

	@Test
	public void testcase1() {
		String s ="xyzzaz";
		findGoodSubStr(s);
	}

	@Test
	public void testcase2() {
		String s ="aababcabc";
		findGoodSubStr(s);
	}


	/*Define a map
	 *Add each character and its occurecne to the map
	 *When the window size becomes equal to 3
	 *    Check for the map size--> if all the characters are distinct, then map.size--> will be 3 --> increment the count
	 *
	 *   To shrink the window , get the left char , decrement its occurance by 1
	 *   and if the occurence becomes zero remove the left char from the map
	 *   and increment the left pointer

	   return the count. at the end of the iteration.
	 */

	private void findGoodSubStr(String s) {
		int windowstart = 0;
		int count = 0;
		Map<Character, Integer> inputmap = new HashMap<Character, Integer>();
		for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
			char inputchar = s.charAt(windowEnd);
			inputmap.put(inputchar, inputmap.getOrDefault(inputchar, 0)+1);

			while((windowEnd-windowstart)+1 ==3) {
				if(inputmap.size()==3) count++;
				char leftChar = s.charAt(windowstart);
				inputmap.put(leftChar, inputmap.get(leftChar)-1);
				if(inputmap.get(leftChar)==0) {
					inputmap.remove(leftChar);
				}

				windowstart++;
			}


		}

		System.out.println(count);

	}

}
