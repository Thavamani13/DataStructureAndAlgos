package windowsliding;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class P21_subStringOfKDistinctCharacters {

	/*
	 * 	1.
	    Input(s)?  String s , int k
	    Output ?  int count
	    Constraints ?

	2. Test data set

	        Positive :string contains only one nicesubstring
	        Negative :String contains multiple nicesubstring
	        Edge     : no nice substring

	3. Known Approaches
	        Approach 1 :Sliding window
	        Approach 2 :

	4. O-Notations
			Approach 1 :

	5. Pseudocode
 *
 */


	@Test
	public void testcase1() {
		String s ="xyzzaz";
		int k =3;
		Assert.assertEquals(1, findCountOfGoodSubString(s, k));
	}

	@Test
	public void testcase2() {
		String s ="aababcabc";
		int k =3;
		Assert.assertEquals(4, findCountOfGoodSubString(s, k));
	}

	@Test
	public void testcase3() {
		String s ="aababbab";
		int k =3;
		Assert.assertEquals(0, findCountOfGoodSubString(s, k));
	}

	@Test
	public void testcase4() {
		String s ="aa";
		int k =3;
	}


	/*define a map .
	 *Traverse through the string , add each character and its occurance to the map.
	 *When the difference between 2 pointers becomes 3 ,
	 *       Check if the map size is 3 , if yes increase the count
	 *
	 *       if not , decrement the occurance of the left character by 1
	 *                if the occurance of the left character becomes zero , reomove the character from the map .
	 *
	 *               Increment your left pointer --> to shrink the window
	 *
	 *               Time--> O(n)
	 *               space -->O(n)



	*/

	private int findCountOfGoodSubString(String s, int k) {
		if(s.length()<k) throw new RuntimeException("invalid input");


		int windowstart = 0;
		int count = 0;

		Map<Character, Integer> inputmap = new HashMap<Character, Integer>();
		for (int windowend = 0; windowend < s.length(); windowend++) {
			char inputchar = s.charAt(windowend);
			inputmap.put(inputchar, inputmap.getOrDefault(inputchar, 0) + 1);

			while (k == ((windowend - windowstart) + 1)) {
				char leftchar = s.charAt(windowstart);
				if (inputmap.size() == k) {
					count++;
				}

				inputmap.put(leftchar, inputmap.get(leftchar) - 1);
				if (inputmap.get(leftchar) == 0) {
					inputmap.remove(leftchar);

				}
				windowstart++;

			}

		}
		System.out.println(count);
		return count;

	}

}
