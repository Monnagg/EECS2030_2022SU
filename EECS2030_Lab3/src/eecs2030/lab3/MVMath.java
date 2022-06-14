package eecs2030.lab3;

/**
 * A utility class containing some matrix/vector operations
 * 
 * @author Andriy EECS 2030 Lab 3 SU2022
 */
public class MVMath {
	// TODO
	private MVMath() {	
	}
	// ensure this class is a utility class and no objects are ever created

	/**
	 * Multiplies a matrix by a vector
	 * 
	 * @param m matrix
	 * @param v vector
	 * @return new vector object containing the result 
	 * TODO the input parameter m should be an object of Matrix3, and v should be an object of Vector3 
	 */
	public static Vector3 multiply(Matrix3 m, Vector3 v) {
		// TODO
		double[][] matrix = m.getElements();
		double[] vector = v.getElements();
		double[] result = new double[vector.length];

		double element;
		for (int i = 0; i < matrix.length; i++) {
			element = 0;
			for (int j = 0; j < matrix[0].length; j++) {
				element += matrix[i][j] * vector[j];
			}
			result[i] = element;
		}
		Vector3 vec = new Vector3(result);

		return vec;
	}

	/**
	 * @param m1 matrix 1
	 * @param m2 matrix 2
	 * @return new matrix object containing the result 
	 * TODO the input parameters m1 and m2 should be objects of Matrix3
	 *
	 */
	public static Matrix3 multiply(Matrix3 m1, Matrix3 m2) {
		// TODO
		double[][] result = new double[3][3];
		double[][] one = m1.getElements();
		double[][] two = m2.getElements();
		double element;
		for (int k = 0; k < one.length; k++) {
			for (int i = 0; i < one.length; i++) {
				element = 0;
				for (int j = 0; j < one[0].length; j++) {
					element += one[k][j] * two[j][i];
					// System.out.println(one[i][j] +"*"+two[j][i]+"= "+element);
				}
				result[k][i] = element;

			}
		}
		Matrix3 m = new Matrix3(result);

		return m;
	}

	/**
	 * Computes a cross product of two vectors
	 * 
	 * @param v1 vector 1
	 * @param v2 vector 2
	 * @return a new vector object containing the result 
	 * TODO the input parameters v1 and v2 should be objects of Vector3
	 */
	public static Vector3 crossProduct(Vector3 v1, Vector3 v2) {
		// TODO
		double[] vector1 = v1.getElements();
		double[] vector2 = v2.getElements();
		double one = vector1[1] * vector2[2] - vector1[2] * vector2[1];
		double two = vector1[2] * vector2[0] - vector1[0] * vector2[2];
		double three = vector1[0] * vector2[1] - vector1[1] * vector2[0];
		double[] array = new double[] { one, two, three };

		Vector3 v = new Vector3(array);
		return v;
	}

	/**
	 * Computes a dot product of two vectors
	 * 
	 * @param v1 vector 1
	 * @param v2 vector 2
	 * @return dot product (a scalar) 
	 * TODO the input parameters v1 and v2 should be objects of Vector3
	 */
	public static double dotProduct(Vector3 v1, Vector3 v2) {
		// TODO
		double[] vector1 = v1.getElements();
		double[] vector2 = v2.getElements();
		double result = 0;
		for (int i = 0; i < vector1.length; i++) {
			result += vector1[i] * vector2[i];
		}

		return result;
	}

}
