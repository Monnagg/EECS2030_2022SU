package eecs2030.lab3;

import java.util.Arrays;

/**
 * An immutable class implementing a 3x3 matrix
 * 
 * @author Andriy EECS 2030 Lab 3 SU2022
 */
public class Matrix3 {
	// TODO

	private final double matrix[][] = new double[3][3];
	// consider how to ensure the objects are immutable

	/**
	 * Creates a 3x3 matrix from an 2D array
	 * 
	 * @param array array containing the elements of the desired matrix 
	 * TODO the input parameter should be a 2D array whose element should be double
	 */
	public Matrix3(double[][] array) {
		// TODO

		for (int i = 0; i < array.length; i++) {
			matrix[i] = Arrays.copyOf(array[i], 3);
		}

		// HERE, consider how to ensure the objects are immutable
	}

	/**
	 * Clones an existing matrix
	 * 
	 * @param old an existing Matrix3 object 
	 * TODO the input element should be an object of Matrix3
	 */
	public Matrix3(Matrix3 old) {
		// TODO

		double[][] oldMatrix = old.getElements();
		for (int i = 0; i < 3; i++) {
			matrix[i] = Arrays.copyOf(oldMatrix[i], 3);
		}
		// consider how to ensure the objects are immutable
	}

	/**
	 * Returns a matrix element at a row, column
	 * 
	 * @param row    row
	 * @param column column
	 * @return matrix element as a scalar 
	 * TODO both row and column should be non-negative integer less than 4
	 */
	public double getElement(int row, int column) {
		// TODO
		return matrix[row][column];
	}

	/**
	 * Returns matrix elements as a 2D array
	 * 
	 * @return 2D array containing 9 matrix elements
	 */
	public double[][] getElements() {
		// TODO
		// HERE, consider how to ensure the objects are immutable
		return matrix;
	}

}
