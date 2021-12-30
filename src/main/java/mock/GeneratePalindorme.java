package mock;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class GeneratePalindorme {
	
	@Test
	public void testcase1() {
		int N=5,k=2;
		generatePalindromeStr(N,k);
	}
	
	@Test
	public void testcase2() {
		int N=3,k=2;
		generatePalindromeStr(N,k);
	}
	
	@Test
	public void testcase3() {
		int N=8,k=3;
		generatePalindromeStr(N,k);
	}
	
	@Test
	public void testcase4() {
		int N=2,k=1;
		generatePalindromeStr(N,k);
	}
	
	
	
	
	
	

	private void generatePalindromeStr(int n, int k) {
		Character[] charr = new Character[n];
		
		int left = 0, right = charr.length - 1;
		int index = 0;
		int asciiVal = 97;
		while (k != 0) {
			char c = (char) asciiVal;
			if (k > 1) {
				charr[left++] = c;
				charr[right--] = c;
				asciiVal++;
				k--;
			}

			else if (k == 1) {
				for (int i = left; i <= right; i++) {
					charr[left] = c;
					left++;
				}
				k--;
			}

		}

		String output = "";
		for (int i = 0; i < charr.length; i++) {
			output += charr[i];
		}
		System.out.println(output);
	}
}