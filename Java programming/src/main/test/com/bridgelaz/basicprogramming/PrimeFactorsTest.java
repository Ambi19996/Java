package com.bridgelaz.basicprogramming;

public class PrimeFactorsTest {
	
	ArrayList<Integer> primeList=new ArrayList<Integer>();
	ArrayList<Integer> expectedList=new ArrayList<Integer>();
	
	
	
	
	@Test
	public void primeFactorsTest() {
		expectedList.add(2);
		expectedList.add(2);
		expectedList.add(2);
		primeList=Utility.primeFactors(8);
		assertEquals(expectedList, primeList); //AssertEquals method to campare expected and actual lists
		
	}

}
