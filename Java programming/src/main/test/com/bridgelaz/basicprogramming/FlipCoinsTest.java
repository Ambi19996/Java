package com.bridgelaz.basicprogramming;

public class FlipCoinsTest {
	
int flips=22;
	
	@Before
	public void checkTurnsPositive()
	{
		assertTrue(flips>0);
		
	}
	
	@Test
	public void test() {
		
		int test=Utility.flipsCoin(flips);
		assertTrue("head tail percentage should greater than or equal to 0",test>=0);
		
		
		
	}


}
