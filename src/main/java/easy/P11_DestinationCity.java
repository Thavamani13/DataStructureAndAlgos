package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class P11_DestinationCity {

	@Test
	public void testcase1() {
		List<List<String>> paths = new ArrayList<List<String>>();
		paths.add(Arrays.asList("London", "NewYork"));
		paths.add(Arrays.asList("NewYork", "Lima"));
		paths.add(Arrays.asList("Lima", "Sao Paulo"));
		Assert.assertEquals("Sao Paulo", findDestinationcity(paths));
	}

	private String findDestinationcity(List<List<String>> paths) {
		
		List<String> sourceList= new ArrayList<>();
		
		for (int i = 0; i < paths.size(); i++) {
			String source =paths.get(i).get(0);
			sourceList.add(source);
		}
		
		for (int i = 0; i < paths.size(); i++) {
			String dest =paths.get(i).get(1);
			if(!sourceList.contains(dest)) {
				System.out.println(dest);
				return dest;
			}
		}
		return "";
	}

}
