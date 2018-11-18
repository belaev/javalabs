package edu.belyaev.sau15.javalabs.laboratoryNumberFive;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import edu.belyaev.sau15.javalabs.laboratoryNumberFive.Matrix;
import edu.belyaev.sau15.javalabs.laboratoryNumberFive.MatrixManager;
import edu.belyaev.sau15.javalabs.laboratoryNumberFive.MatrixWriteRead;

public class MatrixWriteReadTest {

	public static MatrixWriteRead matrixWR = new MatrixWriteRead();
	public static Matrix matrix = new Matrix();
	public static MatrixManager matrManag = new MatrixManager();

	@Before
	public void must() throws IOException {
		matrix.setMatrix(matrManag.createRandomMatrix(3, 3));
		matrix.setColumnsCount(3);
		matrix.setRowsCount(3);
		matrix.setMaxElement(matrManag.searchMaxElement(matrix));
		matrix.setMinElement(matrManag.searchMinElement(matrix));
		matrix.setSumElements(matrManag.sumElements(matrix));

		matrixWR.writeJson(matrix, "testFile1.txt");
	}

	@Test
	public void readJSon() throws IOException {
		assertEquals(matrix.getMatrix(), matrixWR.readJson(matrix, "testFile1.txt").getMatrix());
	}

	@Test
	public void writeJSon() throws IOException {
		assertTrue(matrixWR.writeJson(matrix, "testFile1.txt"), true);
	}


}
