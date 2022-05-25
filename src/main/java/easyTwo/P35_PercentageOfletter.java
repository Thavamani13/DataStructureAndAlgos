package easyTwo;

import org.junit.Test;

public class P35_PercentageOfletter {
	
	@Test
	public void testcase1() {
		String s="foobar";
		String letter="o";
		findPercentage(s,letter);
	}
	
	@Test
	public void testcase2() {
		String s="sgawtb";
		String letter="s";
		findPercentage(s,letter);
	}

	private int findPercentage(String s, String letter) {
		int count=0;
		int[] ascii = new int[26];
		
		for (int i = 0; i < s.length(); i++) {
			char  inputchar = s.charAt(i);
			if(Character.hashCode(inputchar)==Character.hashCode(letter.charAt(0))) {
				count++;
			}
		}
		System.out.println(count);
		System.out.println(((double)count/(double)s.length())*100);
		System.out.println((int) Math.round(((double)count/(double)s.length())*100));
		
		double  temp = ((double)count/(double)s.length())*100;
		System.out.println(temp);
		String str = String.valueOf(temp);
		String[] split = str.split("\\.");
		System.out.println(split[0]); 
		return Integer.parseInt(split[0]);
		
		
		
		
		
		
		//return (int) Math.round(((double)count/(double)s.length())*100);
		
		
	}
	
	

}
