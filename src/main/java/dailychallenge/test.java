package dailychallenge;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

public class test {

	public static void main(String[] args) {

		// Index = hashcode(Key) & (n-1)

		HashMap<String, String> hmap = new HashMap<String, String>();

		hmap.put("Dinesh", "Manager");
		int hashCode = hmap.hashCode();
		System.out.println(hashCode);
		int index = hashCode & (16 - 1);
		System.out.println(index);
		System.out.println("==============================");

		hmap.put("Curt", "Director");
		int hascode2 = hmap.hashCode();
		System.out.println(hascode2);
		int index2 = hascode2 & (16 - 1);
		System.out.println(index2);
		System.out.println("==============================");

		hmap.put("Kalai", "Lead");
		int hascode3 = hmap.hashCode();
		System.out.println(hascode3);
		int index3 = hascode3 & (16 - 1);
		System.out.println(index3);
		System.out.println("==============================");

		hmap.put("null", "");
		int hascode4 = hmap.hashCode();
		System.out.println(hascode4);
		int index4 = hascode4 & (16 - 1);
		System.out.println(index4);
		System.out.println("==============================");

	}

}