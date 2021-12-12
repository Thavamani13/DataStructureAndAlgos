package easy;

import org.junit.Test;

public class P60_colorOfChessBoard {
	//https://leetcode.com/problems/determine-color-of-a-chessboard-square/

	@Test
	public void testcase1() {
		String coordinates = "a1";
		findIsWhite(coordinates);
	}
	
	
	/*
	 *  char inputChar = coordinates.charAt(0);
		int value = coordinates.charAt(1) - '0';

		if ((inputChar=='a'||inputChar=='c'||inputChar=='e'||inputChar=='g') && value % 2 != 0) {
			return false;
		}

		else if ((inputChar=='b'||inputChar=='d'||inputChar=='f'||inputChar=='h') && value % 2 == 0) {
			return false;
		}

		
		return true;
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	
	
	
	
	
	*/

	private boolean findIsWhite(String coordinates) {

		String blacksetOne = "aceg";
		String blacksetTwo = "bdfh";
		
		char inputChar = coordinates.charAt(0);
		int value = coordinates.charAt(1) - '0';

		if (blacksetOne.contains("" + inputChar) && value % 2 != 0) {
			return false;
		}

		else if (blacksetTwo.contains("" + inputChar) && value % 2 == 0) {
			return false;
		}

		
		return true;
	}

}
