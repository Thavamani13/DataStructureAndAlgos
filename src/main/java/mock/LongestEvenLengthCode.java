package mock;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class LongestEvenLengthCode {

	@Test
	public void testcase1() {
		String s="Time to write great code";
		Assert.assertEquals("Time", findLongestEvenStr(s));
	}

	private String findLongestEvenStr(String s) {
		String[] split = s.split(" ");
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int maxlen =Integer.MIN_VALUE;

		for (int i = 0; i < split.length; i++) {
			if(split[i].length()%2==0) {
				maxlen = Math.max(maxlen, split[i].length());
			}
		}

		for (int i = 0; i < split.length; i++) {
			if(split[i].length()==maxlen) return split[i];
		}



	return "";

	}

}
