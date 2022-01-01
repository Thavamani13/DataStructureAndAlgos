package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class P81_OccuranceAfterBigram {
	
	@Test
	public void testcase1() {
		String text="alice is a good girl she is a good student";
		String first ="a";
		String second="good";
		findOccurancesAfterBigram(text,first,second);
	}
	
	@Test
	public void testcase2() {
		String text="we will we will rock you";
		String first ="we";
		String second="will";
		findOccurancesAfterBigram(text,first,second);
	}
	
	@Test
	public void testcase3() {
		String text="ypkk lnlqhmaohv lnlqhmaohv lnlqhmaohv ypkk ypkk ypkk ypkk ypkk ypkk lnlqhmaohv lnlqhmaohv lnlqhmaohv lnlqhmaohv ypkk ypkk ypkk lnlqhmaohv lnlqhmaohv ypkk";
		String first ="lnlqhmaohv";
		String second="ypkk";
		findOccurancesAfterBigram(text,first,second);
	}

	private void findOccurancesAfterBigram(String text, String first, String second) {
		String[] split = text.split(" ");
		String[] StringArr = new String[] {first,second};
		
		List<String> arrlist = new ArrayList<String>();
		
		for (int i = 0; i < split.length-1; i++) {
			String[] subArr = new String[] {split[i],split[i+1]};
			if(Arrays.equals(StringArr, subArr)==true && (i+2)<split.length) {
				arrlist.add(split[i+2]);
			}
			
		}
		
		String[] array = arrlist.toArray(new String[arrlist.size()]);
        System.out.println(Arrays.toString(array));
		
	}

}
