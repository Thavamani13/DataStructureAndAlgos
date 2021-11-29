package medium;

import java.util.PriorityQueue;

import org.junit.Test;

public class P03_FindKthLargestElement {
	
	//https://leetcode.com/problems/kth-largest-element-in-an-array/
	@Test
	public void testcase1() {
		int[] intarr= {3,2,1,5,6,4};
		int k =2;
		findKthLargestElem(intarr,k);
	}
	
	@Test
	public void testcase2() {
		int[] intarr= {3,2,3,1,2,4,5,5,6};
		int k =4;
		findKthLargestElem(intarr,k);
	}
	
	@Test
	public void testcase3() {
		int[] intarr= {3,5,4,2,9};
		int k =3;
		findKthLargestElem(intarr,k);
	}
	
	

	
	/*Consider k no of elements from the array and add it to priority queue.
	 * 
	 *  1.PQ adds the element from greatest to lowest value--> left to right 
	 *  
	 * Case1:
	 *   The next element is greater than or equal to top of the priority queue 
	 *      
	 *       if the incoming element is smaller than the top of the priority queue --> do nothing 
	 *       
	 *       else {
	 *         
	 *          if the input element 9 > top of the priority queue(3)  then we have to add  9 
	 *           
	 *               9 , 5 , 4  --> previous three will be removed 
	 *            
	 *        
	 *       } 
	 * 
	 * 
	 * 
	 * 
	 **/
	private void findKthLargestElem(int[] intarr, int k) {
		
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		int x=0;
		
		for (int i = 0; i <k; i++) {
			int inputVal = intarr[i];
			queue.add(inputVal);
		}
		
		for (int i = k; i < intarr.length; i++) {
			int inputVal = intarr[i];
			if(queue.peek()>inputVal) {
				continue;
			}
			else {
				queue.poll();
				queue.add(inputVal);
			}
			
			
		}
		
		System.out.println(queue.peek());
	}

}
