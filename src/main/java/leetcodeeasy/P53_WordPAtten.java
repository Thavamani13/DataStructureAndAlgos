package leetcodeeasy;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class P53_WordPAtten {

	@Test
	public void testcase1() {
		String pattern="abba";
		String s ="dog cat cat dog";
		Assert.assertEquals(true, isMAtchingOrNot(pattern,s));
	}

	@Test
	public void testcase2() {
		String pattern="abba";
		String s ="dog cat cat fish";
		Assert.assertEquals(false, isMAtchingOrNot(pattern,s));
	}

	@Test
	public void testcase3() {
		String pattern="aaaa";
		String s ="dog cat cat dog";
		Assert.assertEquals(false, isMAtchingOrNot(pattern,s));
	}

	@Test
	public void testcase4() {
		String pattern="abba";
		String s ="dog dog dog dog";
		Assert.assertEquals(false, isMAtchingOrNot(pattern,s));
	}

	/*Define a map
	 *split the given string
	 *Traverse through the parttern and string array simultaneously
	 *     Add character from pattern as KEY
	 *     Add String as Value
	 *
	 *Conditions :
	 *    if both key and value is not availabe in the map add to it
	 *    if input key is already avaialble
	 *              Make sure the input string value is equal to the existing KEY -> if not return false
	 *    if the input string Value is already available
	 *               Validate the input character is already available in map --> if not return false
	 *                  if not available means , we cannot map the same value to another key --> hence return false


	    return true by default

	*/
	private boolean isMAtchingOrNot(String pattern, String s) {

		Map<Character, String> map = new HashMap<Character, String>();
		String[] split = s.split(" ");
		if (split.length != pattern.length()) return false;

		for (int i = 0; i < split.length; i++) {
			char inputCharKey = pattern.charAt(i);
			String inputVal = split[i];

			if (!map.containsKey(inputCharKey) && !map.containsValue(inputVal)) {
				map.put(inputCharKey, inputVal);
			}

			else if (map.containsKey(inputCharKey) && !map.get(inputCharKey).equalsIgnoreCase(inputVal)) {
				return false;
			}

			else if (map.containsValue(inputVal) && !map.containsKey(inputCharKey)) {
				return false;
			}

		}

		return true;
	}

}
