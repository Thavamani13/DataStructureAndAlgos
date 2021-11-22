package fileread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class Getvalues {
	
	@Test
	public void test() throws IOException {
		
		//read the input file
		FileReader file = new FileReader(new File("C:\\\\Users\\\\dhana\\\\Desktop\\\\nwfile.txt"));
		BufferedReader br =new BufferedReader(file);
	    Map<String, List<String>> map = new LinkedHashMap<String,List<String>>();
	    List<String> list = new ArrayList<String>();
	    List<String> inputlist = new ArrayList<String>();
	    String[] arr= new String[map.size()];
		
	    
	    //read each line		
		//untill next line is null
	    String line;
		while((line = br.readLine())!=null) {
			String[] split= line.split(" ");
			
			for(int i =0;i<split.length;i++) {
				if(i==0) {
					map.put(split[i], inputlist); //Get the first row /and read all the headers 
					//pass this as key in to map
				}
				else {
					list.add(split[i]);
				}
				
				//get the key values in to array
				int index=0;
				 for(Entry<String, List<String>> mapkey : map.entrySet()) {
              	   {
              		   arr[i]=mapkey.getKey();
              		   index++;
              	   }
        	
                 }
				
				 //iterate the array and get the key based on key add the inputlist 
				int count=0;
				while(index<list.size()) {
                    String value=arr[count];
                    String temp=list.get(count);
                    inputlist.add(temp);
                    map.put(value, inputlist);
                    count++;					
            	   }
            	
				}			
				
			}
		}
		
		
}

	
	
	
	


