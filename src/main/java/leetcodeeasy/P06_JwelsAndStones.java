package leetcodeeasy;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class P06_JwelsAndStones {

	@Test
	public void testcase1() {
		String jewels="aA";
		String stones="aAAbbbb";
		findCounts(jewels,stones);
	}

	@Test
	public void testcase2() {
		String jewels="a";
		String stones="AA";
		findCounts(jewels,stones);
	}


	private int findCounts(String jewels, String stones) {
		Set<Character> set  = new HashSet<Character>();
		int count=0;
		for (int i = 0; i < jewels.length(); i++) {
			set.add(jewels.charAt(i));
		}

		for (int i = 0; i < stones.length(); i++) {
			if(set.contains(stones.charAt(i))) {
				count++;
			}
		}

		System.out.println(count);
		return count;
	}

}
