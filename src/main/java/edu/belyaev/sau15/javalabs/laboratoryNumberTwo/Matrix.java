package edu.belyaev.sau15.javalabs.laboratoryNumberTwo;
class Matrix {
	private int[][] infoMatrix;
	private int infoCountRows;
	private int infoCountColumns;
	private int infoMaxElement;
	private int infoMinElement;
	private int infoSumElements;

	public void setMatrix(int[][] mass) {
		infoMatrix = mass;
	}

	public void setRowsCount(int rowsCount) {
		infoCountRows = rowsCount;
	}

	public void setColumnsCount(int columnsCount) {
		infoCountColumns = columnsCount;
	}

	public void setMaxElement(int maxElement) {
		infoMaxElement = maxElement;
	}

	public void setMinElement(int minElement) {
		infoMinElement = minElement;
	}

	public void setSumElements(int sumElements) {
		infoSumElements = sumElements;
	}

	public int[][] getMatrix() {
		return infoMatrix;
	}

	public int getRowsCount() {
		return infoCountRows;
	}

	public int getColumnsCount() {
		return infoCountColumns;
	}

	public int getMaxElement() {
		return infoMaxElement;
	}

	public int getMinElement() {
		return infoMinElement;
	}

	public int getSumElements() {
		return infoSumElements;
	}

}