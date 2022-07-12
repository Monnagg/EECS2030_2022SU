package Sin;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SinTest2 {

	@Test
	void testFactorial() {
		
		
		assertEquals(Sin.fact(0),1);
		assertEquals(Sin.fact(4),24);
		assertEquals(Sin.fact(3),6);
		assertEquals(Sin.fact(2),2);
		
		
		
	}
	@Test
	void testFactorialoop() {
		
		
		assertEquals(Sin.factc(0),1);
		assertEquals(Sin.factc(4),24);
		assertEquals(Sin.factc(3),6);
		assertEquals(Sin.factc(2),2);
		
		
	}
	@Test
	void testsin() {
		
		
		assertEquals(Math.sin(30),Sin.sinC(30),0.001);
		//assertEquals(Math.sin(30),SinCalculate.mySin(60),0.001);

		
		
	}
}
