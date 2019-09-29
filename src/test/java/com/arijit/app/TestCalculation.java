package com.arijit.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalculation {

	    @Test
	    public void testAdd() {
	        assertEquals(30, Calculation.add(10, 20));
	    }

	    @Test
	    public void testSub() {
	        assertEquals(-10, Calculation.sub(10, 20));
	    }
}
