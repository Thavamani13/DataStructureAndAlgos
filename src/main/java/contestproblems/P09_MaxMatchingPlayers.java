package contestproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class P09_MaxMatchingPlayers {
	
	//https://leetcode.com/problems/maximum-matching-of-players-with-trainers/
	
	@Test
	public void testcase1() {
		int[] players = new int[] {4,7,9};
		int[] trainers= new int[] {8,2,5,8};
		matchPlayersAndTrainers(players,trainers);
	}
	
	@Test
	public void testcase2() {
		int[] players = new int[] {1,1,1};
		int[] trainers= new int[] {10};
		matchPlayersAndTrainers(players,trainers);
	}
	
	@Test
	public void testcase3() {
		int[] players = new int[] {1,100};
		int[] trainers= new int[] {100,1};
		matchPlayersAndTrainers(players,trainers);
	}
	
	/*Sort both the arrays 
	 *left--> players , right-->trainers
	 *if player capacity is less than / equal to trainers capacity 
	 *        increment the count
	 *        move both the pointer forward 
	 * else 
	 *   increment right pointer
	 * 
	 * 
	 * */
	private int matchPlayersAndTrainers(int[] players, int[] trainers) {
		
		List<Integer> matchedIndex = new ArrayList<Integer>();
		int count = 0;
		Arrays.sort(players);
		Arrays.sort(trainers);

		int left = 0, right = 0;

		while (left < players.length && right < trainers.length) {
			int playerVal = players[left];
			int trainerVal = trainers[right];
			
			if (playerVal <= trainerVal) {
				count++;
				left++;
				right++;
			}
			else {
				right++;
			}

		}

		System.out.println(count);

		return 0;

	}

}
