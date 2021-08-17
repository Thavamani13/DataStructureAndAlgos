package hashing;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class P06_StringCompression {

	/*
	 * 	1.
	    Input(s)? String contains only lowercase and uppercase
	    Output ? String
	    Constraints ?

	2. Test data set

	        Positive :
	        Negative :
	        Edge     :

	3. Known Approaches
	        Approach 1 :
	        Approach 2 :

	4. O-Notations
			Approach 1 :

	5. Pseudocode
 *
 */

	@Test
	public void testcase1() {
		String s ="aabcccccaaa";
		Assert.assertEquals("a2b1c5a3", compressedStringUsingStringBuilder(s));
	}



	/*Define a map
	 * loop through the string , add the current charcter to map and its occurance as value
	 *       if the input character is   already available in the map ,
	 *             get the key and value , append with the output String
	 *
	 *        if the input character is   not  available in the map ,
	 *             add the key and increment its occurance.
	 *
	 *  At the end of the iteration , return the string which has the minium length betwen[inputstring , outputstring]
	 *
	 *
	 *




	*/
	private String findCompressedString(String s) {

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		String output = "";

		for (int i = 0; i < s.length(); i++) {
			char inputchar = s.charAt(i);
			if (map.isEmpty() || map.containsKey(inputchar)) {
				map.put(inputchar, map.getOrDefault(inputchar, 0) + 1);
			}

			else if  (!map.isEmpty() || !map.containsKey(inputchar))  {
				Set<Entry<Character, Integer>> entrySet = map.entrySet();
				Iterator<Entry<Character, Integer>> iterator = entrySet.iterator();
				while (iterator.hasNext()) {
					Entry<Character, Integer> next = iterator.next();
					output += next.getKey();
					output += next.getValue();
				}
				map.clear();
				map.put(inputchar, map.getOrDefault(inputchar, 0) + 1);
			}

		}

		if (output.length() < s.length()) {
			System.out.println(output);
			return output;
		}

		return s;

		}


	private String compressedStringUsingStringBuilder(String s) {
		int consecutivecounts=0;
		StringBuilder consecutivestring= new StringBuilder();

		//aabcccccaaa
		for (int i = 0; i < s.length(); i++) {
			consecutivecounts++;
			if (s.charAt(i + 1) != s.charAt(i) || i+1>=s.length()) {
				consecutivestring.append(s.charAt(i));
				consecutivestring.append(consecutivecounts);
				consecutivecounts = 0;
				}
			}

		return consecutivestring.toString().length() < s.length() ? consecutivestring.toString() : s;
		}

}
