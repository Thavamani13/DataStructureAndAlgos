package medium;

import org.junit.Test;

public class P19_WateringPlantsII {

	// https://leetcode.com/problems/watering-plants-ii/
	@Test
	public void testcase1() {
		int[] plants = { 2, 2, 3, 3 };
		int CapacityA = 5;
		int capacityB = 5;
		WateringPlants(plants, CapacityA, capacityB);

	}

	@Test
	public void testcase2() {
		int[] plants = { 2, 2, 3, 3 };
		int CapacityA = 3;
		int capacityB = 4;
		WateringPlants(plants, CapacityA, capacityB);

	}

	@Test
	public void testcase3() {
		int[] plants = { 5 };
		int CapacityA = 10;
		int capacityB = 8;
		WateringPlants(plants, CapacityA, capacityB);

	}

	@Test
	public void testcase4() {
		int[] plants = { 1, 2, 4, 4, 5 };
		int CapacityA = 6;
		int capacityB = 5;
		WateringPlants(plants, CapacityA, capacityB);

	}

	@Test
	public void testcase5() {
		int[] plants = { 2, 1, 1 };
		int CapacityA = 6;
		int capacityB = 5;
		WateringPlants(plants, CapacityA, capacityB);

	}
	
	private int WateringPlants(int[] plants, int capacityA, int capacityB) {
		
		int left=0,right=plants.length-1;
		int AlexRefill=capacityA;
		int BobRefill=capacityB;
		int count=0;
		
		while (left <= right) {
			int leftVal = plants[left];
			int rightVal = plants[right];

			if (left == right) {
				// both has enough water
				// A has enough water , b does not have --> refill increment counter
				// A does not have enough water , B does have enough water --> refill incremnt
				// counter
				// A and B does not have enough water--> refill and increment counter

				
				 if(capacityA <leftVal && capacityB <rightVal) {
					count++;
					left++;
				 }
				 else {
					 left++;
				 }

			}

			else if (capacityA >= leftVal && capacityB >= rightVal) {
				capacityA -= leftVal;
				capacityB -= rightVal;
				left++;
				right--;
			}

			else if (capacityA < leftVal && capacityB >= rightVal) {
				capacityA = AlexRefill;
				count++;
			}

			else if (capacityA >= leftVal && capacityB < rightVal) {
				capacityB = BobRefill;
				count++;
			}

			else if (capacityA < leftVal && capacityB < rightVal) {
				capacityA = AlexRefill;
				capacityB = BobRefill;
				count += 2;
			}

		}

		System.out.println(count);
        return count;
		
		
	}

}
