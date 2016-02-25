package goelr.practice;

import java.util.Arrays;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.junit.Before;
import org.junit.Test;

public class Revision2 {

	@Before
	public void setUp() throws Exception {
	}


		static String LookAndSay(String start, int n) {

			if (StringUtils.isBlank(start) || !NumberUtils.isNumber((start))) {
				return null;
			}
			String val = null;
			if (n == 0) {
				
				try {
					
					String str = start;
					char ch;
					int count = 0;
					while (str.length() > 0) {
						ch = str.charAt(0);
						int i = 0;
						while (i < str.length() && str.charAt(i) == ch) {
							count = count + 1;
							i++;
						}
						str = str.substring(count);
						val = val + count + ch;
						count = 0;
					}
				
					
				} catch(NumberFormatException e) {
					return null;
				}
			} else {
				return LookAndSay(start, n-1);
			}
			
			return val;
	    }

	public static void main(String args[]) {
		StringBuilder stb = new StringBuilder();
		for (String arg : args) {
			if (stb.indexOf(arg) < 1) {
				stb.append(arg + " ");
			}
		}
		System.out.println(stb.toString());
		Scanner sc = new Scanner(stb.toString());
		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				System.out.print(sc.nextInt() + " ");
			} else
				sc.next();
		}

		Revision r = new Revision();
		r.test();
	}

}
