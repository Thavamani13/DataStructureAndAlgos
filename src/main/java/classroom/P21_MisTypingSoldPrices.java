package classroom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class P21_MisTypingSoldPrices {


	/*
	 * You have an old grocery shop that instead of scanning their sold proudcts
	 * once sold, they type in the prices, which leaves room for mistyping sold
	 * prices. Given 4 lists: soldItems = ['eggs', 'milk', 'apple'], soldPrices =
	 * [1.00, 2.50, 2.1], productsAvailable = ['eggs', 'lemons', 'milk', 'apple'],
	 * productPrices = [1.01, 0.5, 2.50, 2.1],
	 *
	 * Find the number of items with mistyped prices
	 *
	 */


	@Test
	public void testcase1() {
         String[] soldItems= {"eggs", "milk", "apple"};
         double[] soldPrices= {1.00, 2.50, 2.1};
         String[] productsAvailable= {"eggs", "lemons", "milk", "apple"};
         double[] productPrices= {1.01, 0.5, 2.50, 2.1};
         findMisTypingSoldPricesUsingSet(soldItems,soldPrices,productsAvailable,productPrices);
	}



	/*Traverse through the sold items and sld price , add the items and  price as key and value
	 *
	 * Traverse through the productsAvail, check if it is available in map
	 *    1. if available , check for the prices -> if prices are not equal increment the count
	 *    2.if not available move on .
    */
	private void findMisTypingSoldPrices(String[] soldItems, double[] soldPrices, String[] productsAvailable,
			double[] productPrices) {

		int count=0;
		Map<String, Double> map = new HashMap<String, Double>();

		for (int i = 0; i < soldItems.length; i++) {
			map.put(soldItems[i], soldPrices[i]);
		}

		for (int i = 0; i < productsAvailable.length; i++) {
			String availProd = productsAvailable[i];
			double prodPrice = productPrices[i];

			if (map.containsKey(availProd)) {
				double soldprrice = map.get(availProd);
				if (soldprrice != prodPrice) {
					count++;
				}

			}

		}

		System.out.println(count);

	}


	/*Define the set
	 *Concatenate solditems string and soldprice and add it to set
	 *
	 * Define a arraylist to add the sold products -->checklist
	 *
	 *Traverse   through the prodavail and  Concatenate prod with prodprice
	 *check if the prod is available in the productlist
	 *       if yes --> validate Strings are equal --> if nt increment the count

	*/
	private void findMisTypingSoldPricesUsingSet(String[] soldItems, double[] soldPrices, String[] productsAvailable,
			double[] productPrices) {

		int count=0;
		Set<String> set = new HashSet<String>();
		List<String> availablityCheck = new ArrayList<String>();

		for (int i = 0; i < soldItems.length; i++) {
			String inputstr = soldItems[i]+soldPrices[i];
			availablityCheck.add(soldItems[i]);
			set.add(inputstr);
		}

		for (int i = 0; i < productsAvailable.length; i++) {
			String prodAvailStr = productsAvailable[i] + productPrices[i];

			if (availablityCheck.contains(productsAvailable[i])) {
				if (!set.contains(prodAvailStr)) {
					count++;
				}
			}

		}

		System.out.println(count);
	}

}
