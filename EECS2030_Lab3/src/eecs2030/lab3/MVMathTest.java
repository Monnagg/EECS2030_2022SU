package eecs2030.lab3;

import static org.junit.Assert.*;

import org.junit.Test;

public class MVMathTest {

	@Test
	public void testMatrixMult() {
		double[][] one = {{1d, 2d, 3d},
				{4d, 5d, 6d},
				{7d, 8d, 9d}};

		double[][] two = {{11d, 12d, 13d},
				{21d, 22d, 23d}, 
				{31d, 32d, 33d}};

		double[][] expected = {{146d, 152d, 158d},
				{335d, 350d, 365d},
				{524d, 548d, 572d}};

		Matrix3 m1= new Matrix3 (one);
		Matrix3 m2= new Matrix3 (two);
		double [][] result = MVMath.multiply(m1, m2).getElements();

		String error = String.format("Matrix multiplication failed ");

		for (int i = 0; i < expected.length; i++){
			for (int j = 0; j < expected[0].length; j++){
				assertEquals(error, result[i][j], expected[i][j], 1e-6);
			}
		}
	}

	@Test
	public void testMatrixMult2() {
		double[][] one = {{1d, 2d, 3d},
				{4d, 5d, 6d},
				{7d, 8d, 9d}};

		Matrix3 m1= new Matrix3 (one);
		try {
			MVMath.multiply(null, m1);
			String error = String.format("MVMath.multiply() failed to throw an exception");
			fail(error);
		} catch (NullPointerException x) {
			// ok
		} catch (Exception x) {
			fail("wrong type of exception thrown");
		}
	}
	@Test
	public void test03() {
		double[][] one = {{1d, 2d, 3d},
				{4d, 5d, 6d},
				{7d, 8d, 9d}};
		double[] two  = {1d, 2d, 3d};
		double[] exp  = {14d, 32d, 50d};
		Matrix3 m1= new Matrix3 (one);
		Vector3 v = new Vector3(two);
		double [] result = MVMath.multiply(m1, v).getElements();
		for(int i = 0 ; i < 3; i++) {
			assertEquals(result[i],exp[i],0.0001);
		}
	}
	@Test
	public void test04() {
		double[][] one = {{1d, 2d, 3d},
				{4d, 5d, 6d},
				{7d, 8d, 9d}};
		double[] two  = {11d, 12d, 13d};
		double[] exp  = {74d, 182d, 290d};
		Matrix3 m1= new Matrix3 (one);
		Vector3 v = new Vector3(two);
		double [] result = MVMath.multiply(m1, v).getElements();
		for(int i = 0 ; i < 3; i++) {
			assertEquals(result[i],exp[i],0.0001);
		}
	}
	
	@Test
	public void test05() {
		double[] one = {3,5,4};
		double[] two  = {2,7,5};
		double exp  = 61d;
		Vector3 m1= new Vector3 (one);
		Vector3 v = new Vector3(two);
		double  result = MVMath.dotProduct(m1, v);
		assertEquals(exp,result,0.0001);
		
	}
	@Test
	public void test06() {
		double[] one = {3, -5, 4};
		double[] two  = {2, 6, 5};
		double[] exp  = {-49, -7, 28};
		Vector3 m1= new Vector3 (one);
		Vector3 v = new Vector3(two);
		double[]  result = MVMath.crossProduct(m1, v).getElements();
		for(int i = 0; i < 3;i++) {
			assertEquals(exp[i],result[i],0.0001);
		}
		double  resul = MVMath.dotProduct(m1, v);
		assertEquals(-4,resul,0.0001);
		
		
	}
}
