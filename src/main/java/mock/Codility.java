package mock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class Codility {

	@Test
	public void testcase1() {
		int[] intarr= {-3,-14,-5,7,8,42,8,3};
		Assert.assertEquals("SUMMER", findSeason(intarr));
	}

	@Test
	public void testcase2() {
		int[] intarr= {2,-3,3,1,10,8,2,5,13,-5,3,-18};
		Assert.assertEquals("AUTUMN", findSeason(intarr));
	}



	private String findSeason(int[] intarr) {
		int size = intarr.length;
		int seasondays =size/4;
		int max =Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;

		List<Integer> arrlist = new ArrayList<Integer>();
		Map<Integer,String> map = new LinkedHashMap<Integer, String>();
		map.put(0, "WINTER");
		map.put(1, "SPRING");
		map.put(2, "SUMMER");
		map.put(3, "AUTUMN");

		int windowstart=0;
		for (int windowend = 0; windowend < intarr.length; windowend++) {
			max = Math.max(max, intarr[windowend]);
			min = Math.min(min, intarr[windowend]);
			while ((windowend - windowstart) + 1 == seasondays) {
				int diff = Math.abs(max - min);
				arrlist.add(diff);
				max = Integer.MIN_VALUE;
				min = Integer.MAX_VALUE;
				windowstart += seasondays;

			}

		}

		Integer maxvalue = Collections.max(arrlist);
		int maxvalueindex = arrlist.indexOf(maxvalue);
		System.out.println(maxvalueindex);
		System.out.println(map.get(maxvalueindex));
		String season = map.get(maxvalueindex);
		return season;

	}


}
