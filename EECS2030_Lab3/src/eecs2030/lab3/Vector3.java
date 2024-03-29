package eecs2030.lab3;

import java.util.Arrays;

/**
 * An immutable class implementing a 3D vector
 * 
 * @author Andriy EECS 2030 Lab 3 SU2022
 *
 */
public class Vector3 implements Comparable<Vector3> {
	// TODO
	private final double[] vector;
	// consider how to ensure the objects are immutable

	/**
	 * Creates a 3D vector from 3 numeric scalar components
	 * 
	 * @param x x coordinate
	 * @param y y coordinate
	 * @param z z coordinate
	 */
	public Vector3(double x, double y, double z) {
		// TODO
		vector = new double[] { x, y, z };

	}

	/**
	 * Creates a 3D vector from an array
	 * 
	 * @param v array containing 3 components of the desired vector 
	 * TODO the input parameter should be an array containing 3 double
	 */
	public Vector3(double[] v) {
		// TODO
		vector = Arrays.copyOf(v, 3);
		// consider how to ensure the objects are immutable
	}

	/**
	 * Clones an existing vector
	 * 
	 * @param old an existing Vector3 object 
	 * TODO the input parameter should be an object of Vector3
	 */
	public Vector3(Vector3 old) {
		// TODO
		double[] o = old.getElements();
		vector = Arrays.copyOf(o, 3);

		// consider how to ensure the objects are immutable
	}

	/**
	 * Returns a vector component at a specified index
	 * 
	 * @param index the index of the vector component
	 * @return vector component as a scalar 
	 * TODO the input parameter should be a non-negative integer less than 3
	 */
	public double getElement(int index) {
		// TODO

		return vector[index];
	}

	/**
	 * Returns vector components as an array
	 * 
	 * @return vector components, first element at index [0], and so on
	 */
	public double[] getElements() {
		// TODO
		// consider how to ensure the objects are immutable
		return vector;
	}

	@Override
	public int hashCode() {
		// TODO
		int result = 13;
		for (int i = 0; i < vector.length; i++) {
			result += vector[i];
		}
		result = 31 * result;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO
		if (this == obj) {
			return true;
		}
		if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		}
		Vector3 v = (Vector3) obj;
		boolean equals = true;
		for (int i = 0; i < 3 && equals; i++) {
			if (v.getElements()[i] != this.getElements()[i]) {
				equals = false;
			}
		}
		return equals;
	}

	/**
	 * Compares vectors by their magnitudes
	 * 
	 * @return -1 if o is greater than this, 0 if equal, 1 otherwise
	 */
	@Override
	public int compareTo(Vector3 o) {
		// TODO
		if (o != null && o instanceof Vector3) {
			Vector3 v = (Vector3) o;

			for (int i = 0; i < vector.length; i++) {
				if (v.getElements()[i] > vector[i]) {
					return -1;
				} else if (v.getElements()[i] < vector[i]) {
					return 1;
				}
			}
		}
		return 0;
	}

}
