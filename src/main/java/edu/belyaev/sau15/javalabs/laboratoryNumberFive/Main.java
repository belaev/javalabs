package edu.belyaev.sau15.javalabs.laboratoryNumberFive;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static Scanner scan;
	public static Matrix infoAboutMatrix = new Matrix();
	public static MatrixManager matrManag = new MatrixManager();
	public static MatrixWriteRead matrixWR = new MatrixWriteRead();
	
	public static void main(String[] args) throws IOException {

		scan = new Scanner(System.in);
		Matrix infoAboutMatrix = new Matrix();
		MatrixManager matrManag = new MatrixManager();
		MatrixWriteRead matrixWR = new MatrixWriteRead();

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

		matrixWR.writeJson(infoAboutMatrix,"file.txt");
		infoAboutMatrix = matrixWR.readJson(infoAboutMatrix, "file.txt");
		System.out.println("Matrix: ");
		matrManag.printMatrix(infoAboutMatrix);

	}

}
