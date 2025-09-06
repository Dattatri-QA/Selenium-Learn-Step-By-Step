package com.day_23;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class Hard_Assertion {


	@Test
	void test() {

		assertEquals("DATTATRI", "DATTATRI");
		assertEquals("123", "DAI");
		assertNotEquals(123,123);

		assertTrue(false);
		assertTrue(true);

		fail();

	}

}
