package Sin;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SinTest {

	@Test
	void testFactorial() {
		
		
		assertEquals(SinCalculate.factorial(0),1);
		assertEquals(SinCalculate.factorial(4),24);
		assertEquals(SinCalculate.factorial(3),6);
		assertEquals(SinCalculate.factorial(2),2);
		
		
		
	}
	@Test
	void testFactorialoop() {
		
		
		assertEquals(SinCalculate.factorialoop(0),1);
		assertEquals(SinCalculate.factorialoop(4),24);
		assertEquals(SinCalculate.factorialoop(3),6);
		assertEquals(SinCalculate.factorialoop(2),2);
		
		
	}
	@Test
	void testsin() {
		
		
		//assertEquals(Math.sin(30),SinCalculate.mySin(30),0.001);
		assertEquals(Math.sin(30),SinCalculate.mySin(60),0.001);

		
		
	}
}
