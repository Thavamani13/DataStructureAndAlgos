package easyTwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class P36_SortCharactersByFreq {
	
	@Test
	public void testcase1() {
		String s = "tree";
		sortCharByFreq(s);
	}

	private void sortCharByFreq(String s) {
		Map<Character,Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		
		List<Character> chaacterList = new ArrayList<Character>(map.keySet());
		
		//Sort on basis of frequency
		Collections.sort(chaacterList, ((ch1,ch2)->map.get(ch2)-map.get(ch1)));
		
		StringBuilder sb = new StringBuilder();
		for (Character character : chaacterList) {
			for (int i = 0; i < map.get(character); i++) {
				 sb.append(character);
			}
			
		}
		
		System.out.println(sb.toString());
	}

}
