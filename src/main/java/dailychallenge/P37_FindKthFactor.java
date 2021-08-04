package dailychallenge;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class P37_FindKthFactor {

	/*
	 * Find the kth factor of the given interger n .
	 *
	 * example: n=7 , k= 2 ,	 *
	 * factors of 7 is 1 and 7 . return7
	 *
	 * example: n=12, k=3
	 * factors of 12 are 1,2,3,4,6,12 , return 3.
	 *
	 * example : n=10 , k=5
	 * factors of 10 are 1,2,5,10 . no 5th occurance
	 *
	 *
	 */

	/**
	 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 *
	 * What is the input(s)? int n , int k
       What is the expected output?   int a
	   Do I have constraints to
	 * solve the problem?
	 *
	 *
	   Do I have all informations to go to next step!! How big is
	 * your test data set will be?
	 *
	 * 2) Test data set
	 *
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions
	   Positive : no.of factors less than k
	   Negative :
	   Edge : no .of factors > than k
	 *
	 *
	 * Approaches :	Bruteforce
	 *
	 *
	 */

    @Test
	public void testcase1() {
		int n =12, k=3;
		Assert.assertEquals(3, findFactorWithoutAddOnSpace(n,k));
	}

    @Test
   	public void testcase2() {
   		int n =1, k=1;
   		Assert.assertEquals(1, findFactorWithoutAddOnSpace(n,k));
   	}

    @Test
   	public void testcase3() {
   		int n =4, k=4;
   		Assert.assertEquals(-1, findFactorWithoutAddOnSpace(n,k));
   	}



	/*Get the inputs from 1 till n , and check if the "n" is divisible by i
	 *                  if yes , Add the input values to the list.
	 *
	 *if the given K> n return -1,
	 *if the arraysize is equal to 1 --> return the first value from arraylist
	 *if the arraysize is lesss than k-->return -1
	 *else --> return  k-1 value from arraylist.
	 *
	 * Time complexity-->O(n) space complexity-->O(n)
	 *
	 */


	private int findFactor(int n, int k) {
		if(k>n) return -1;

		List<Integer> arrlist = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				arrlist.add(i);
			}

		if(arrlist.size()==1) return arrlist.get(0);
		else if(arrlist.size()<k) return -1;
		else  return arrlist.get(k - 1);
    }


	/*declare count variable to zero
	 *Traverse from 1 to n
	 *     if n is divisible by  input value i --> increment the count .
	 *                 once the count value matches the  K, return the input value .
	 *If there is no matches after the full traversal , return -1;
	 *
	 * time complexity-->O(n) , space complexity-->O(1)

	*/

	private int findFactorWithoutAddOnSpace(int n, int k) {
		if(k>n) return -1;

		int count=0;
		for (int i = 1; i <=n; i++) {
			if(n%i==0) count++;
			if(count==k) {
				return i;
			}
		}

		return -1;
	}
}
