package windowsliding;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

public class Variant_03 {
	/*Dynamic variant with the use of Auxillary Data Structure 
	 * Longest Substring Length with K distinct characters 
	 * 
	 * We have to find teh Longest Substring with K distinct Characters  . K =2 
	 * 
	 * You need to have 2 distinct characters in your substring 
	 * 
	 * A A  A  H H I B C 
	*/
	
	
	/*Add A into the HashMap ->map ->> A=1
	 * Grow the window--> A-->2 ,  update my MAX 
	 * Grow the window-->A --> 3 , Update my MAX 
	 * Grow the window--> H--> map--> A=3 , H=1 m Satisfies it does not have more than 2 distinct characters , MAX 4
	 * 
	 * Grow  the window--> H-->A=3 , H=2, Satisfies it does not have more than 2 distinct characters , MAX 5 , 
	 * 
	 * Grow the window-->I will be in Map --> A=3 , H=2, I=1 , Violates the condition  . Map size 3 
	 * 
	 *       We need to shrink the left value --> Decrement the Occurrence  value of A to 2 
	 *       A=2 , H=2, I=1 , Violates the condition  . Map size 3 . Shrink the left 
	 *       
	 *       We need to shrink the left value --> Decrement the Occurrence  value of A to 1 
	 *        A=1 , H=2, I=1 , Violates the condition  . Map size 3 . Shrink the left 
	 *        
	 *       We need to shrink the left value --> Decrement the Occurrence  value of A to 0 . Remove A from HashMap .
	 *       H=2, I=1 ,  . Map Size 2 . Max size 3  . Grow the Window towards right 
	 *       
	 *       Map -->H=2, I=1, B=1, .Violates the condition . Shrink left . Decrement H to 1 . 
	 *       
	 *       Map -->H=1, I=1, B=1, .Violates the condition . Shrink left . Decrement H to 0 . and remove H 
	 *       
	 *       Map--> I=1,B=1 .Grow Again towards right . 
	 *       
	 *       Map -->I=1,B=1,C=1, Violates the condition . Shrink left . Decrement I to 1 and remove I
	 *       
	 *       Map-->B=1, C=1. 
	 *                RIght hand side reached the end of the array . Terminate the loop and return the MAX value    
	 *        
	 *                        
	 *        
	 * 
	 * 
	
	*/
	
	@Test
	public void testcase1() {
		String str="AAAHHIBC";
		int k=2;
		findLongestSubString(str,k);
	}

	
	
	/*Loop through the given array  , get each character and add it to the MAP 
	 * 
	 * When the map size goes beyond the K , shrink the  window from left side .	
	 * 
	
	
	*/
	private int findLongestSubString(String str, int k) {
		
		Map<Character, Integer> hmap = new LinkedHashMap<Character, Integer>();
		
		int maxlength=0 , windowstart=0;
		
		for (int windowend = 0; windowend < str.length(); windowend++) {
			char charr = str.charAt(windowend);
			hmap.put(charr, hmap.getOrDefault(charr, 0)+1) ;
			
			while (hmap.size()>k) {
				char leftchar = str.charAt(windowstart);// look for the character at start of the window 
				hmap.put(leftchar, hmap.get(leftchar)-1) ;//Decrement the occurance of the character 
				
				if (hmap.get(leftchar)==0) {  // If the occurance of the each character becomes zero , remove that character
					hmap.remove(leftchar);
				}
				
				windowstart++;
			}
			
			maxlength = Math.max(maxlength, windowend-windowstart+1);
			
			
		}
		return maxlength;
		
	}	
	
}
