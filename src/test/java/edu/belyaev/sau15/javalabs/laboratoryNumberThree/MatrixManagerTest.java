package edu.belyaev.sau15.javalabs.laboratoryNumberThree;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.belyaev.sau15.javalabs.laboratoryNumberThree.Matrix;
import edu.belyaev.sau15.javalabs.laboratoryNumberThree.MatrixManager;

public class MatrixManagerTest {
	
	private static MatrixManager matrManag = new MatrixManager();
	private static Matrix matr = new Matrix();

	public void addDataToClass() {
		matr.setMatrix(new int[][] { 	{ 7, 9, 5, 4, 2 }, 
										{ 3, 9, 6, 4, 7 }, 
										{ 5, 9, 6, 5, 5 }, 
										{ 2, 3, 1, 7, 1 },
										{ 7, 7, 7, 6, 3 } 
									});
		matr.setRowsCount(5);
		matr.setColumnsCount(5);
	}
	
	@Test
	public void sumTest() {

		addDataToClass();

		// sum = 130
		assertEquals(130, matrManag.sumElements(matr));
	}

	@Test
	public void minTest() {

		// min = 1
		assertEquals(1, matrManag.searchMinElement(matr));
	}

	@Test
	public void maxTest() {

		// max = 9
		assertEquals(9, matrManag.searchMaxElement(matr));
	}

}
