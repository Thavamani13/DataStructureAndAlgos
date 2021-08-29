package assessment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class P03_PriceCheck {

	/*
	 * 	1.
	    Input(s)?   list<product> , list<productprice> float , list<productsold> string , list<Soldprice> float
	    Output ?  int error count
	    Constraints ?

	2. Test data set

	        Positive :
	        Negative :
	        Edge     :

	3. Known Approaches
	        Approach 1 : using map
	        Approach 2 :

	4. O-Notations
			Approach 1 :

	5. Pseudocode
 *
 */

	@Test
	public void testcase1() {
		List<String> products = new ArrayList<String>(Arrays.asList("eggs","milk","cheese"));
		List<Float> productPrice=new ArrayList<Float>(Arrays.asList((float) 2.89,(float) 3.29 , (float) 5.79));

		List<String> productSold = new ArrayList<String>(Arrays.asList("eggs","eggs","cheese","milk"));
		List<Float> soldPrice=new ArrayList<Float>(Arrays.asList((float) 2.89,(float) 2.99 , (float) 5.97 , (float) 3.29 ));

		findErrorCount(products,productPrice,productSold,soldPrice);
		Assert.assertEquals(2, findErrorCount(products, productPrice, productSold, soldPrice));
}

	@Test
	public void testcase2() {
		List<String> products = new ArrayList<String>(Arrays.asList("rice","sugar","wheat","cheese"));
		List<Float> productPrice=new ArrayList<Float>(Arrays.asList((float) 16.89,(float) 56.29 , (float) 20.79, (float) 345.99));

		List<String> productSold = new ArrayList<String>(Arrays.asList("rice","cheese"));
		List<Float> soldPrice=new ArrayList<Float>(Arrays.asList((float) 18.99,(float) 400.89));

		findErrorCount(products,productPrice,productSold,soldPrice);
		Assert.assertEquals(2, findErrorCount(products, productPrice, productSold, soldPrice));
}

	@Test
	public void testcase3() {
		List<String> products = new ArrayList<String>(Arrays.asList("choclate","cheese","tomato"));
		List<Float> productPrice=new ArrayList<Float>(Arrays.asList((float) 15.00,(float) 300.90, (float) 23.99));

		List<String> productSold = new ArrayList<String>(Arrays.asList("choclate","cheese","tomato"));
		List<Float> soldPrice=new ArrayList<Float>(Arrays.asList((float) 15.00,(float) 300.90,(float)10.00  ));

		findErrorCount(products,productPrice,productSold,soldPrice);
		Assert.assertEquals(1, findErrorCount(products, productPrice, productSold, soldPrice));
}









	private int findErrorCount(List<String> products, List<Float> productPrice, List<String> productSold,List<Float> soldPrice) {

		Map<String, Float> actualPriceMap = new LinkedHashMap<String, Float>();
		for (int i = 0; i < products.size(); i++) {
			actualPriceMap.put(products.get(i), productPrice.get(i));
		}

		System.out.println(actualPriceMap);


		int count=0;
		for (int i = 0; i < productSold.size(); i++) {
			String soldProduct = productSold.get(i);
			Float  sellingPrice = soldPrice.get(i);

			Float actualPrice = actualPriceMap.get(soldProduct);

			int compare = Float.compare(actualPrice, sellingPrice);

			if(compare!=0) {
				count++;
			}
			}

	  System.out.println(count);
      return count;

	}



}
