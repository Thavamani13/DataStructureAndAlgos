package dailychallenge;

import java.util.Arrays;

import org.junit.Test;

public class P36_FinaAverageSalary {
	/*
	 * Given an array of unique integers salary where salary[i] is the salary of the
	 * employee i.
	 *
	 *
	 *https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/submissions/
	 * Return the average salary of employees excluding the minimum and maximum
	 * salary.
	 *
	 * Input: salary = [4000,3000,1000,2000] Output: 2500.00000 Explanation: Minimum
	 * salary and maximum salary are 1000 and 4000 respectively. Average salary
	 * excluding minimum and maximum salary is (2000+3000)/2= 2500
	 *
	 * Input: salary =
	 * [1000,2000,3000] Output: 2000.00000 Explanation: Minimum salary and maximum
	 * salary are 1000 and 3000 respectively. Average salary excluding minimum and
	 * maximum salary is (2000)/1= 2000
	 *
	 *  Input: salary =
	 * [6000,5000,4000,3000,2000,1000] Output: 3500.00000
	 *
	 * Input: salary = [8000,9000,2000,3000,6000,1000] Output: 4750.00000
	 */

	/**
	 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
	 * provide more detail with example(s) -> If yes, go to next step !!
	 *
	 * What is the input(s)? intarr[]
       What is the expected output?  int average
	   Do I have constraints to
	 * solve the problem?
	   Do I have all informations to go to next step!! How big is
	 * your test data set will be?
	 *
	 * 2) Test data set
	 *
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions
	   Positive :
	   Negative :
	   Edge : less than 2 employee
	 *
	 *
	 * Approaches :	Bruteforce *
	 *
	 *
	 */
	@Test
	public void testcase1() {
		int[] intarr= {4000,3000,1000,2000};
		findAverageWithoutSort(intarr);

	}

	@Test
	public void testcase2() {
		int[] intarr= {4000};
		findAverageWithoutSort(intarr);
	}

	@Test
	public void testcase3() {
		int[] intarr= {4000};
		findAverageWithoutSort(intarr);
	}

	@Test
	public void testcase4() {
		int[] intarr= {6000,5000,4000,3000,2000,1000};
		findAverageWithoutSort(intarr);
	}
	@Test
	public void testcase5() {
		int[] intarr= {8000,9000,2000,3000,6000,1000};
		findAverageWithoutSort(intarr);
	}



	/*sort the array ,
	 * sum the value  to ignore first and last index
	 * return the avg by Sum/intarr.len-2;
	 *
	 * Time complexity-->O(nlogn)+ o(n)
	 *
	 * space complexity-->O(n/2)

	*/
	private double findAverage(int[] intarr) {

		int size= intarr.length;

		if(size<2) return 0.0;

		Arrays.sort(intarr);
		double sum=0;
		for (int i = 1; i < intarr.length-1; i++) {
			sum+=intarr[i];
		}
        System.out.println(sum/(size-2));
		return (sum/(size-2));

	}


	/*Declare min variable , Assign MAX value to it
	 *Declare max variable , Assign MIN value to it.
	 *Declare a sum -->to calculate the sum of given array
	 * Traverse through the given array
	 *             1.check for the min value between the assigned one and input value
	 *             2.check for the max value between assigned one and iput value
	 *             3. keep adding all the elements from the array .
	 * At the end of the iteration,
	 *            subtract the min and max value from the sum [to exclude min and max salary]
	 *            return the avg by sum/(arr.len-2)
	 *
	 * Time complexity-->O(n)
	 * Space complexity-->O(1)
	*/
	private double findAverageWithoutSort(int[] intarr) {

		int size = intarr.length;
		if (size < 2) return 0.0;

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		double sum = 0;

		for (int i = 0; i < intarr.length; i++) {
			min = Math.min(min, intarr[i]);
			max = Math.max(max, intarr[i]);

			sum += intarr[i];
		}

		sum = sum - (min + max);
		System.out.println(sum / (size - 2));
		return sum / (size - 2);

	}

}
