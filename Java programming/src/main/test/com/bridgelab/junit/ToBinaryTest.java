package com.bridgelab.junit;

import java.util.ArrayList;

public class ToBinaryTest {
	
	ArrayList<Integer> expected=new ArrayList<Integer>();
	int decimalNumber=43;
	
	
	@Before
	
	public void checkDecimalPositive(int decimalNumber)
	{
		assertTrue(decimalNumber>0);
	}

	@Test
	
	public void decimalToBinaryTest() {
		expected.add(1);
		expected.add(1);
		expected.add(0);
		expected.add(1);
		expected.add(0);
		expected.add(1);
		ArrayList<Integer> binaryList=Utility.decimalToBinary(decimalNumber);
		assertEquals(expected, binaryList);
	}

}
