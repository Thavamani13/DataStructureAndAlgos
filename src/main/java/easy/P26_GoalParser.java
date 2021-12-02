package easy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class P26_GoalParser {
	
	@Test
	public void testcase1() {
		String s ="G()(al)";
		parseString(s);
	}

	private void parseString(String s) {
		
		String sone=s.replace("()","o");
		String stwo =sone.replace("(al)", "al");
		System.out.println(stwo);
		
		Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
           char inputChar = s.charAt(i);
           map.put(inputChar,map.getOrDefault(inputChar,0)+1); 
        }
		
        Collection<Integer> values = map.values();
        values.size();
		
	}
	

}
