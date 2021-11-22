package fileread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ReadFile {
	
	public static void main(String[] args) throws IOException {
		
		FileReader file = new FileReader(new File("D:\\photon_workspace\\dsapractice\\src\\main\\java\\fileread\\nwfile.txt"));
		BufferedReader br = new BufferedReader(file);

		String strLine;
		List<String> lineList = new ArrayList<String>();

		/*
		 * read line by line  and add each line to Arraylist
		 */
		while ((strLine = br.readLine()) != null) {
			System.out.println(strLine);
			lineList.add(strLine);
		}

		/*
		 * Now we know that in the arraylist
		 *   index 0--> refers to headers content
		 *   index1--> full of --- , we have to ignore this
		 *   further index --> has some content
		 */

		Map<String, List<String>> map = new LinkedHashMap();
		/*
		 * Get the first index from the map split the string on basis of space
		 * Iterate the string[] array and add each string as key in the map
		 */

		String headerString = lineList.get(0);
		String[] split = headerString.split(" ");

		for (int i = 0; i < split.length; i++) {
			String inputStr = split[i];
			if (inputStr.length() > 0) {
				/*
				 * ignore empty values Add string as key , new array list as its respective
				 * value
				 *
				 **/
				map.put(inputStr, new ArrayList<String>());
			}

		}

		Set<String> headerset = map.keySet();
		List<String> headersList = headerset.stream().collect(Collectors.toList());

		/*
		 * Traverse the linelist from index 2 , get each line 
		 * Split each line on basis of space '
		 *
		 * iterate through the string array
		 * define index-->0
		 * if data.length>0
		 *     get the value from the map for current index() ,
		 *     array list will be returned 
		 *     Add the value0/0 to the arraylist
		 * 
		 * incremnet the index++;
		 * 
		 * 
		 * reset the index to 0;
		 * 
		 * 
		 * 
		 * 
		 */
		for (int i = 2; i < lineList.size(); i++) {
			String inputStr = lineList.get(i);
			int index = 0;

			String[] stringArr = inputStr.split(" ");
			

			for (int j = 0; j < stringArr.length; j++) {
				String data = stringArr[j];

				if (data.length() > 0) {
					String headerKey = headersList.get(index);
					
					List<String> list = map.get(headerKey); // get the arraylist
					list.add(data); // append the value
					map.put(headerKey, list);// update the map
					index++;
				}
			}

		}
		
		System.out.println(map);

	}

}
