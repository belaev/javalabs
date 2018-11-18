package edu.belyaev.sau15.javalabs.laboratoryNumberFour;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MatrixManager {

	public static final int MAX_RANDOM_VALUE = 20;
	public static final String SPLIT_ELEMENTS = " ";
	public static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		Matrix infoAboutMatrix = new Matrix();
		MatrixManager matrManag = new MatrixManager();

		System.out.print("Size of matrix: ");
		int rowsCount = scan.nextInt();
		int columnsCount = scan.nextInt();
		infoAboutMatrix.setMatrix(matrManag.createRandomMatrix(rowsCount, columnsCount));
		System.out.println("");

		// Write in class "Matrix"
		infoAboutMatrix.setRowsCount(rowsCount);
		infoAboutMatrix.setColumnsCount(columnsCount);
		infoAboutMatrix.setMaxElement(matrManag.searchMaxElement(infoAboutMatrix));
		infoAboutMatrix.setMinElement(matrManag.searchMinElement(infoAboutMatrix));
		infoAboutMatrix.setSumElements(matrManag.sumElements(infoAboutMatrix));

		// Output values from class "Matrix"
		System.out.println("Number of rows: " + infoAboutMatrix.getRowsCount());
		System.out.println("Number of columns: " + infoAboutMatrix.getColumnsCount());
		System.out.println("Max element is " + infoAboutMatrix.getMaxElement());
		System.out.println("Min element is " + infoAboutMatrix.getMinElement());
		System.out.println("Sum of elements is " + infoAboutMatrix.getSumElements());
		System.out.println("");

		System.out.println("Matrix: ");
		matrManag.printMatrix(infoAboutMatrix);

	}

	private List<List<Integer>> createRandomMatrix(int rowsCount, int columnsCount) {
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

	private int sumElements(Matrix matr) {
		int sum = 0;
		for (int i = 0; i < matr.getRowsCount(); i++) {
			for (int j = 0; j < matr.getColumnsCount(); j++) {
				sum += matr.getMatrix().get(i).get(j);
			}
		}
		return sum;
	}

	private int searchMaxElement(Matrix matr) {
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

	private int searchMinElement(Matrix matr) {
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

	private void printMatrix(Matrix matr) {
		for (int i = 0; i < matr.getRowsCount(); i++) {
			for (int j = 0; j < matr.getColumnsCount(); j++) {
				System.out.print(matr.getMatrix().get(i).get(j) + SPLIT_ELEMENTS);
			}
			System.out.println("");
		}
		System.out.println("");
	}

}
