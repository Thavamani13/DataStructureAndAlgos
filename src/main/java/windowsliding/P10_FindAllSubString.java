package windowsliding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class P10_FindAllSubString {

	/*
	 * Find all substring that contains all character of another string . In other
	 * words , Find all substring of the first string that are anagrams of second
	 * string
	 * 
	 * 
	 * https://www.techiedelight.com/find-substrings-string-permutation-given-
	 * string/
	 * 
	 */

	/*
	 * String input ="XYYZXZYZXXYZ" String Target="XYZ" Return the Anagaram present
	 * index
	 * 
	 * 
	 * 
	 *
	 * 
	 */

	@Test
	public void testcase1() {
		String input = "XYYZXZYZXXYZ";
		String target = "XYZ";
		findAllSubstring(input, target);

	}

	/*
	 * Define a target map , add all the characters and its occurances in target map
	 * . Traverse through my input string ,Add each element and its occurance into
	 * INPUT MAP.
	 * 
	 * When the difference between the index becomes eqaual to K-1 Check the input
	 * map is equal to target map . If yes --> print the index If No --> Decrement
	 * the last character count If the last character count becomes zeero -->Shrink
	 * the window.
	 * 
	 * 
	 * 
	 * 
	 */

	private void findAllSubstring(String input, String target) {

		

		Map<Character, Integer> targetmap = new HashMap<Character, Integer>();
		for (int i = 0; i < target.length(); i++) {
			targetmap.put(target.charAt(i), targetmap.getOrDefault(target.charAt(i), 0) + 1);
		}

		Map<Character, Integer> inputmap = new HashMap<Character, Integer>();

		int windowstart = 0;
		int k = target.length();
		for (int windowend = 0; windowend < input.length(); windowend++) {

			Character leftchar = input.charAt(windowstart);
			Character inputchar = input.charAt(windowend);

			inputmap.put(inputchar, inputmap.getOrDefault(inputchar, 0) + 1);

			while (((windowend - windowstart) + 1) == k) {

				if (inputmap.equals(targetmap)) {
					System.out.println(windowstart);
				}

					inputmap.put(leftchar, inputmap.get(leftchar) - 1);

					if (inputmap.get(leftchar) == 0) {
						inputmap.remove(leftchar);
					}

					windowstart++;

				}

			}
		}
	}

