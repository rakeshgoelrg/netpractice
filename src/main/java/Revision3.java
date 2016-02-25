package goelr.practice;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class Revision3 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	void test() {

		System.out.println(Math.round(10.55));
		System.out.println(Math.nextUp(10.22));
		System.out.println(Math.random());
		System.out.println(Math.floor(10.99));
		System.out.println(Math.nextAfter(10.22, 0.01));
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
