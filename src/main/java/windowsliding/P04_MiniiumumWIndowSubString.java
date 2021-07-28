package windowsliding;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class P04_MiniiumumWIndowSubString {

	/*
	 * https://leetcode.com/problems/minimum-window-substring/
	 * 
	 * Given two strings s and t of lengths m and n respectively, return the minimum
	 * window substring of s such that every character in t (including duplicates)
	 * is included in the window. If there is no such substring, return the empty
	 * string "".
	 * 
	 * The testcases will be generated such that the answer is unique.
	 * 
	 * A substring is a contiguous sequence of characters within the string.
	 * 
	 * 
	 * Input: s = "ADOBECODEBANC", t = "ABC" Output: "BANC" Explanation: The minimum
	 * window substring "BANC" includes 'A', 'B', and 'C' from string t. *
	 * 
	 * 
	 * Input: s = "a", t = "aa" Output: "" Explanation: Both 'a's from t must be
	 * included in the window. Since the largest window of s only has one 'a',
	 * return empty string.
	 * 
	 * Input: s = "a", t = "a" Output: "a" Explanation: The entire string s is the
	 * minimum window.
	 * 
	 */

	/**
	 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 * 
	 * What is the input(s)? string input , string target What is the expected
	 * output? string Do I have constraints to solve the problem? Do I have all
	 * informations to go to next step!! How big is your test data set will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions Positive :
	 * Negative : Edge :
	 * 
	 * 3) Do I know how to solve it?
	 * 
	 * Yes - great, is there an alternate? No - Can I break down the problem into
	 * sub problems?
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Do I know alternate solutions as well?
	 * 
	 * Yes - What are those? No - That is still fine, proceed to solve by what you
	 * know !!
	 * 
	 * 6) If you know alternate solutions -> find out the O Notations (Performance)
	 * 
	 * Then, explain either both or the best (depends on the time)
	 * 
	 * Approach 1: Start with worst -> Improve (Optimize) -> End up with the best
	 * Approach 2: Write down the options and benefits and code the best
	 * 
	 * 7) Start always with Psuedo code
	 * 
	 * 8) Implement them in the code (editor)
	 * 
	 * 9) Test against the different data set
	 * 
	 * 10) If it fails, debug them to solve it !! /
	 * 
	 * 
	 * 
	 */

	@Test
	public void testcase1() {
		String input = "ADOBECODEBANC";
		String target = "ABC";
		findMinimumWindow(input, target);
	}

	/*
	 * @Test public void testcase2() { String input = "a"; String target = "a";
	 * findMinimumWindow(input, target); }
	 * 
	 * @Test public void testcase3() { String input = "a"; String target = "aa";
	 * findMinimumWindow(input, target); }
	 */

	/*
	 * loop through the target string , add the character and occuracne in target
	 * map .
	 * 
	 * 
	 * 
	 */
	private void findMinimumWindow(String input, String target) {

		Map<Character, Integer> targetmap = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < target.length(); i++) {
			targetmap.put(target.charAt(i), targetmap.getOrDefault(target.charAt(i), 0) + 1);
		}

		System.out.println(targetmap);

		int windowstart = 0;
		int minimumlength = Integer.MAX_VALUE;

		String output = "";

		Map<Character, Integer> inputmap = new LinkedHashMap<Character, Integer>();

		for (int windowend = 0; windowend < input.length(); windowend++) {

			char charr = input.charAt(windowend);
			inputmap.put(charr, inputmap.getOrDefault(charr, 0) + 1);

			while (inputmap.keySet().containsAll(targetmap.keySet())) {
				char leftchar = input.charAt(windowstart);

				Set<Character> keyset = inputmap.keySet();

				for (Character character : keyset) {
					output += character;
				}

				System.out.println(output);
				output = "";

				inputmap.put(leftchar, inputmap.get(leftchar) - 1);

				if (inputmap.get(leftchar) == 0) {
					inputmap.remove(leftchar);
				}

				windowstart++;
			}

		}

	}

}
