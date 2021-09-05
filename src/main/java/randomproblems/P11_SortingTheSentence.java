package randomproblems;

import java.util.Arrays;

import org.junit.Test;

public class P11_SortingTheSentence {

	@Test
	public void testcase1() {
		String s ="is2 sentence4 This1 a3";
		sortTheSentence(s);
	}


	@Test
	public void testcase2() {
		String s ="Myself2 Me1 I4 and3";
		sortTheSentence(s);
	}





	/*Convert the given string to string array on basis of split it by space
	 * Define the outputarr of length same as StringArray
	 * Loop through the string array
	 *      Since the number is at located at the end of the each words , get the number from each words
	 *      convert the character to a integer format
	 *      Assign the word to the corresponding index in the output array, neglect the last character since its a number
	 *
	  At the end of the iteration , form a string from the OUTPUT string.

	  Time --> O(n)+O(n)-->O(2n)-->O(n)
	  Space-->
	     split-->O(n)
	     outputarr-->O(n)
	*/

	private void sortTheSentence(String s) {
		 String[] charArray = s.split(" ");
		 String[] outputarr = new String[charArray.length];

		 for (int i = 0; i <charArray.length; i++) {
			 char integerchar = charArray[i].charAt(charArray[i].length()-1);//last numeric value from each words
			 int indexvalue =integerchar-'0';//convert it into int
			 String outputstr=charArray[i].substring(0, charArray[i].length()-1);//get the string
			 outputarr[indexvalue-1]=outputstr;//assign
			 }

		 System.out.println(Arrays.toString(outputarr));

		 String output="";
		 for (int i = 0; i < outputarr.length; i++) {
			 if(i==outputarr.length-1) {
				output+=outputarr[i];
			}
			 else {
				 output+=outputarr[i]+" ";
			 }
		}


		System.out.println(output);

	}

}
