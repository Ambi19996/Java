package com.bridgelaz.basicprogramming;

public class HarmonicTest {
	
@Test
	
	public void HarmonicMeanTest() {
		
		double result=Utility.harmonicMean(5); //Harmonic value for positive Integer
		double result1=Utility.harmonicMean(0); //Harmonic value of 0
		assertTrue(result>0); //
		assertTrue(result>1);
		assertEquals(2.28, result, 0.01);
		assertEquals(0, result1,0);
		
	}

}
