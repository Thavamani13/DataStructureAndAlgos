package classroom;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.junit.Test;

public class P17_ValidPAranthesis {


	@Test
	public void testcase1() {
		String s ="()[]{}";
		isValidORNot(s);
	}


	@Test
	public void testcase2() {
		String s ="{[]}";
		isValidORNot(s);
	}






	/*Define the stack
	 *Define the map
	 *     Assign closing bracket as key and opening bracket as Value
	 *
	 *Traverse Through the string,
	 *      if the input character is of open type || stack is empty --> push to stack
	 *
	 *      if the peek element is not matching with the input character open bracket return false
	 *
	 *      else stack.pop
	 *
	 *
	 * at the end , return stack.isEmpty or not
	 *
	*/
	private boolean isValidORNot(String s ) {
		Stack<Character> stack = new Stack<Character>();

		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put(')', '(');
		map.put(']', '[');
		map.put('}', '{');

		for (int i = 0; i < s.length(); i++) {
			char inputChar = s.charAt(i);

			if (stack.isEmpty() || !map.containsKey(inputChar)) {
				stack.push(inputChar);
			}

			else if (stack.peek() != map.get(inputChar)) {
				return false;
			} else {
				stack.pop();
			}

		}

		return stack.isEmpty();

	}
}
