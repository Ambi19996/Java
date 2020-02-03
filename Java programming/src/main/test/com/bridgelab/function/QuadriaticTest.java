package com.bridgelab.function;

import java.util.HashMap;

public class QuadriaticTest {
	
	@Test
	public void QuadriaticRootsTest() {
		
		HashMap<String, Float> roots=new HashMap<String, Float>();
		HashMap<String, Float> result=new HashMap<String, Float>();
		roots.put("root1", (float) -1.0);
		roots.put("root2", (float) -1.0);
		result=Utility.QuadriaticRoots(1, 2, 1); //AssertEquals methodcamparing hashmap 
														//for the Quadriatic roots
		assertEquals(roots, result);
	}

}
