package edu.belyaev.sau15.javalabs.laboratoryNumberFive;

import java.io.*;
import java.util.Scanner;
import com.google.gson.*;

public class MatrixWriteRead {

	private static Gson file = new Gson();
	private static String json;
	private static FileWriter writer;
	private static Scanner scan;

	public String writeJson(Matrix matrix, String fileName) throws IOException {
		writer = new FileWriter(fileName, false);
		json = file.toJson(matrix);
		writer.write(json);
		writer.close();
		return json;
	}

	public Matrix readJson(Matrix matrix, String fileName) throws IOException {
		try {
			FileReader reader = new FileReader(fileName);
			scan = new Scanner(reader);
			matrix = file.fromJson(scan.nextLine(), Matrix.class);
			reader.close();
			return matrix;
		} catch (FileNotFoundException e) {
			System.out.println("File is not found!");
			return matrix;
		}
	}

}



//public void writeJson(Matrix matrix, String fileName) throws IOException {
	//writer = new FileWriter(fileName, false);
	//json = file.toJson(matrix);
	//writer.write(json);
	//writer.close();
	//System.out.print("������ � ���� ������ �������!");
//}

//public Matrix readJson(Matrix matrix, String fileName) throws IOException {
	//try (FileReader reader = new FileReader(fileName);) {
		//scan = new Scanner(reader);
		//matrix = file.fromJson(scan.nextLine(), Matrix.class);
		//reader.close();
		//return matrix;
	//} catch (FileNotFoundException e) {
		//System.out.println("���� �� ������!");
		//return matrix;
//	}
//}
