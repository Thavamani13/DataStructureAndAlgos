package classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class P19_GroupAnagarams {

	@Test
	public void tesctase1() {
		String[] strs= {"eat","tea","tan","ate","nat","bat"};
		grouping(strs);
	}


	/*Traverse through the string array and get each word
	 *Traverse through the each word and get each chracter and track its occurance

	  if my resultmap contains the inputmap
	        -->get the list of string
	        -->add the input string  to the list
	        -->update the map with [inputmap, list]

       else

          --> Add the word to the list
          -->update the map with [inputmap, list]


	*/
	private void grouping(String[] strs) {

	 Map<Map<Character, Integer>, List<String>>	 resultmap = new HashMap<Map<Character, Integer>, List<String>>();


		for (String word : strs) {
			Map<Character, Integer> inputmap = new HashMap<Character, Integer>();
			for (int i = 0; i < word.length(); i++) {
				inputmap.put(word.charAt(i), inputmap.getOrDefault(word.charAt(i), 0)+1);
			}

		if(resultmap.containsKey(inputmap)) {
			List<String> list = resultmap.get(inputmap);
			list.add(word);
			resultmap.put(inputmap, list);

		}
		else {
			List<String> groupList= new ArrayList<>(Arrays.asList(word));
			resultmap.put(inputmap, groupList);


		}


		}


		List<List<String>> resultList= new ArrayList<>(resultmap.values());
		System.out.println(resultList);

	}

}
