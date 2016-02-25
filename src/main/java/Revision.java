package goelr.practice;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

public class Revision implements Revision_i {

	static int i = 10;

	@Before
	public void setUp() throws Exception {
		//
	}

	@Test
	@Override
	public void test() {

		System.out.println(String.format("%tT", Calendar.getInstance().toString()));
	}

}

class Revision_1 {

}
