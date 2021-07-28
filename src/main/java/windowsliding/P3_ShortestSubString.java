package windowsliding;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class P3_ShortestSubString {

	/*
	 * Write a program to return the shortest substring having all the unique
	 * characters of the string Input: "abbcafcb" Output: "bcaf"
	 */

	@Test
	public void testcase1() {
		String input = "abbcafcb";
		findShortestSubString(input);

	}

	private String findShortestSubString(String input) {

		Set<Character> set = new HashSet<Character>();
		Map<Character, Integer> targetmap = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < input.length(); i++) {

			set.add(input.charAt(i));
		}

		for (Character character : set) {
			targetmap.put(character, 1);
		}

		int windowstart = 0;

		Map<Character, Integer> inputmap = new LinkedHashMap<Character, Integer>();

		for (int windowend = 0; windowend < input.length(); windowend++) {

			char charrr = input.charAt(windowend);

			inputmap.put(charrr, inputmap.getOrDefault(charrr, 0) + 1);

			while (inputmap.size() < ((windowend + 1) - windowstart)) {
				
				char leftchar = input.charAt(windowstart);

				if (inputmap.keySet().equals(targetmap.keySet())) {
					System.out.println(inputmap.keySet());

					System.out.println(inputmap.keySet().toString());
				}


				inputmap.put(leftchar, inputmap.get(leftchar) - 1);

				if (inputmap.get(leftchar) == 0) {
					inputmap.remove(leftchar);
				}

				windowstart++;

			}

		}

		return inputmap.keySet().toString();

	}

}
