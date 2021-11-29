package easy;

import org.junit.Test;
import org.mozilla.javascript.ast.SwitchCase;

import io.netty.handler.codec.http.HttpContentEncoder.Result;

public class P49_RomanToInteger {
	
	
	@Test
	public void testcase1() {
		String s ="LVIII";
		romanToInt(s);
	}
	
	@Test
	public void testcase2() {
		String s ="IX";
		romanToInt(s);
	}
	
	@Test
	public void testcase3() {
		String s ="MCMXCIV";
		romanToInt(s);
	}

	private int romanToInt(String s) {
		
		int ouput=0;
		for (int i = s.length()-1; i >=0; i--) {
			 char inputchar = s.charAt(i);
			 
			switch (inputchar) {
			case 'M':
				ouput+=1000;
				break;
			case 'D':
				ouput+=500;
				break;
			case 'C':
				ouput+=100*(ouput>=500?-1:1);
				break;
			case 'L':
				ouput+=50;
				break;
			case 'X':
				ouput+=10*(ouput>=50?-1:1);
				break;
			case 'V':
				ouput+=5;
				break;
			case 'I':
				ouput+=1*(ouput>=5?-1:1);
				break;

			default:
				break;
			}
		}
		
		System.out.println(ouput);
		return ouput;
	}
}
