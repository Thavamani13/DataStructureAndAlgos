package leetcodeeasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class P34_DestinationCity {

	@Test
	public void testcase1() {
		List<List<String>> paths = new ArrayList <List<String>>();
		paths.add(Arrays.asList("A","B"));
		paths.add(Arrays.asList("B","C"));
		Assert.assertEquals("C", findDestinationcity(paths));
	}

@Test
	public void testcas2() {
		List<List<String>> paths = new ArrayList <List<String>>();
		paths.add(Arrays.asList("London","NewYork"));
		paths.add(Arrays.asList("NewYork","Lima"));
		paths.add(Arrays.asList("Lima","Sao Paulo"));
		Assert.assertEquals("Sao Paulo", findDestinationcity(paths));
	}

	private String findDestinationcity(List<List<String>> paths) {

		List<String> sourceList = new ArrayList<String>();
		for (int i = 0; i < paths.size(); i++) {
			sourceList.add(paths.get(i).get(0));
		}

		System.out.println(sourceList);

		for (int i = 0; i < paths.size(); i++) {
			String destnationCity = paths.get(i).get(1);
			if (!sourceList.contains(destnationCity))
				return destnationCity;
		}
		return null;

	}



}