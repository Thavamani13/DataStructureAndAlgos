package easy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.junit.Test;

public class SortByLastDigit {
	
	@Test
	public void testcase1() {
		int[] intarr= {305,998,774,236,881};
		sortArr(intarr);
	}

	private void sortArr(int[] intarr) {
		
		Map<Integer,Integer> map = new TreeMap<>();
		
		for (int i = 0; i < intarr.length; i++) {
			int inputVal=intarr[i];
			String inputStr = String.valueOf(inputVal);
			char lastChar = inputStr.charAt(inputStr.length()-1);
			Integer lastDigit = Integer.valueOf(""+lastChar);
			map.put(lastDigit, inputVal);
			
		}
		
		System.out.println(map);
		
		List<Integer> arrlist = new ArrayList<>();
	 
		
		Iterator<Entry<Integer, Integer>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Integer, Integer> next = iterator.next();
			Integer key = next.getKey();
			Integer value = next.getValue();
			arrlist.add(value);
			
		}
		
		System.out.println(arrlist);
	}

}
