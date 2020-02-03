package com.bridgelab.function;

public class WindChillTest {
	
	@Test
	public void windChillTest() {
		
		double result=Utility.windChill(32, 60);
		assertEquals(13.14,result,0.01); //AssertEquals method to check value of wind produced
	}


}
