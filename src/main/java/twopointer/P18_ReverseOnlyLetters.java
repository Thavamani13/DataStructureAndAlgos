package twopointer;

import org.junit.Test;

public class P18_ReverseOnlyLetters {

	/*
	 * 	1.
	    Input(s)?
	    Output ?
	    Constraints ?

	2. Test data set

	        Positive :
	        Negative :
	        Edge     :

	3. Known Approaches
	        Approach 1 :
	        Approach 2 :

	4. O-Notations
			Approach 1 :

	5. Pseudocode
 *
 */
	@Test
	public  void testcse1() {
		String s ="ab-cd";
		reverseAlphabets(s);
	}
	@Test
	public  void testcse2() {
		String s ="";
		reverseAlphabets(s);
	}

	@Test
	public  void testcse3() {
		String s ="ab-cd";
		reverseAlphabets(s);
	}




	private String reverseAlphabets(String s) {
		char[] charArray = s.toCharArray();
		int left=0, right=s.length()-1;

		String str="";

		while(left<right) {
			char leftchar = charArray[left];
			char rightchar = charArray[right];

			if (Character.isAlphabetic(leftchar) && Character.isAlphabetic(rightchar)) {
				char temp = charArray[left];
				charArray[left] = charArray[right];
				charArray[right] = temp;
				left++;
				right--;
			}

			if (!Character.isAlphabetic(leftchar))
				left++;
			if (!Character.isAlphabetic(rightchar))
				right--;

		}

		for (int i = 0; i < charArray.length; i++) {
			str+=charArray[i];
		}

		System.out.println(str);
		return str;

	}

}
