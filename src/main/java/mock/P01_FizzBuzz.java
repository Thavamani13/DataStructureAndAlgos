package mock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class P01_FizzBuzz {

	/*use hashmap with two pointer

	*/
    @Test
	public void testcase1() {
		int n =3;
		findStringArrayUsngtTwoPointer(n);

	}


    @Test
	public void testcase2() {
		int n =5;
		findStringArray(n);

	}

    @Test
    public void testcase3() {
    	int n =15;
		findStringArray(n);

	}




	/*Define a map
	 *Define a list to add the ressultant values .
	 *Traverse upto n values
	 *     if i is divisible by 3 alone --> add fizz
	 *     if i is divisible by 5 alone--> add buzz
	 *     if i divisible by both 3 and 5--> add fizzbuzz
	 *     else add the i value
	 *
	 *
	 *     time --> O(n)
	 *     space-->O(n)


	*/
    private List<String> findStringArray(int n) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("3", "Fizz");
		map.put("5", "Buzz");
		map.put("15", "FizzBuzz");

		List<String> list = new ArrayList<String>();

		for (int i = 1; i <=n; i++) {
			if (i %3 == 0 && i % 5!= 0) {
				list.add(map.get("3"));
			} else if (i % 5 == 0 && i % 3 != 0) {
				list.add(map.get("5"));
			} else if (i % 3 == 0 && i % 5 == 0) {
				list.add(map.get("15"));
			} else {
				String s = "" + i;
				list.add(s);
			}

		}

		System.out.println(list);
		return list;

	}

	private List<String> findStringArrayUsngtTwoPointer(int n) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("3", "Fizz");
		map.put("5", "Buzz");
		map.put("15", "FizzBuzz");

		List<String> list = new ArrayList<String>();

		int left = 1, right = n; // 123

		while (left <= right) {
			if (left % 5 == 0 && left % 3 == 0) {
				list.add(map.get("15"));
				left++;
			}
			else if (left % 5 == 0) {
				list.add(map.get("5"));
				left++;
			}
			else if (left % 3 == 0) {
				list.add(map.get("3"));
				left++;
			}

			else {
				list.add(""+left);
				left++;
			}

			if (right % 5 == 0 && right % 3 == 0) {
				list.add(map.get("15"));
				right--;
			}
			else if (right % 5 == 0) {
				list.add(map.get("5"));
				right--;
			}
			else if (right % 3 == 0) {
				list.add(map.get("3"));
				right--;
			}
			else {
				list.add(""+right);
				right--;
			}

		}
        System.out.println(list);
		return list;

	}

}
