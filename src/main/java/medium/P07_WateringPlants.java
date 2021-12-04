package medium;

import org.junit.Test;

public class P07_WateringPlants {

	@Test
	public void testcase1() {
		int[] plants = { 2, 2, 3, 3 };
		int capacity = 5;
		findSteps(plants, capacity);
	}

	@Test
	public void testcase2() {
		int[] plants = { 1, 1, 1, 4, 2, 3 };
		int capacity = 4;
		findSteps(plants, capacity);
	}
	
	@Test
	public void testcase3() {
		int[] plants = { 7,7,7,7,7,7,7 };
		int capacity =8 ;
		findSteps(plants, capacity);
	}

	private void findSteps(int[] plants, int capacity) {

		int resetVal = capacity;

		int steps = 0;
		for (int i = 0; i < plants.length; i++) {
			int inputVal = plants[i];

			if (capacity >= inputVal) {
				capacity -= inputVal;
				steps++;
			} 
			
			else if (capacity < inputVal) {
				capacity = resetVal;
				steps += (i + (i + 1));
				capacity -= inputVal;
			}

		}

		
		System.out.println(steps);
	}

}
