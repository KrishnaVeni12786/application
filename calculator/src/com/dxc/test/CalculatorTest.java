package com.dxc.test;

import static org.junit.Assert.*;



import org.junit.Test;

import com.dxc.dev.Calculator;


public class CalculatorTest {

	@Test
	public void testAdd() {
	 
		Calculator cal = new Calculator();
	    int actual =	cal.add(5, 5);
	    assertEquals(10, actual);
	}

}
