package edu.belyaev.sau15.javalabs.laboratoryNumberFive;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MatrixManager {

	public static final int MAX_RANDOM_VALUE = 20;
	public static final String SPLIT_ELEMENTS = " ";

	public List<List<Integer>> createRandomMatrix(int rowsCount, int columnsCount) {
		List<List<Integer>> matrix = new ArrayList<List<Integer>>(rowsCount);
		Random ForRandomElements = new Random();
		for (int i = 0; i < rowsCount; i++) {
			matrix.add(new ArrayList<Integer>(columnsCount));
			for (int j = 0; j < columnsCount; j++) {
				matrix.get(i).add(ForRandomElements.nextInt(2 * MAX_RANDOM_VALUE) - MAX_RANDOM_VALUE);
			}
		}
		return matrix;
	}

	public int sumElements(Matrix matr) {
		int sum = 0;
		for (int i = 0; i < matr.getRowsCount(); i++) {
			for (int j = 0; j < matr.getColumnsCount(); j++) {
				sum += matr.getMatrix().get(i).get(j);
			}
		}
		return sum;
	}

	public int searchMaxElement(Matrix matr) {
		int max = matr.getMatrix().get(0).get(0);

		for (int i = 0; i < matr.getRowsCount(); i++) {
			for (int j = 0; j < matr.getColumnsCount(); j++) {
				if (max < matr.getMatrix().get(i).get(j)) {
					max = matr.getMatrix().get(i).get(j);
				}
			}
		}
		return max;
	}

	public int searchMinElement(Matrix matr) {
		int min = matr.getMatrix().get(0).get(0);

		for (int i = 0; i < matr.getRowsCount(); i++) {
			for (int j = 0; j < matr.getColumnsCount(); j++) {
				if (min > matr.getMatrix().get(i).get(j)) {
					min = matr.getMatrix().get(i).get(j);
				}
			}
		}
		return min;
	}

	public void printMatrix(Matrix matr) {
		for (int i = 0; i < matr.getRowsCount(); i++) {
			for (int j = 0; j < matr.getColumnsCount(); j++) {
				System.out.print(matr.getMatrix().get(i).get(j) + SPLIT_ELEMENTS);
			}
			System.out.println("");
		}
		System.out.println("");
	}

}
