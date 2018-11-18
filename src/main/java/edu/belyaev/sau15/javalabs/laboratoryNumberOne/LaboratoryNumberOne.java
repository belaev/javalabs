package edu.belyaev.sau15.javalabs.laboratoryNumberOne;
import java.util.Random;
import java.util.Scanner;

public class LaboratoryNumberOne {

	static int[][]matrix;
	static int nrow,ncol;
	private static Scanner in;
	
	public static void CreateMatrix()
	{
		Random r=new Random();
		for(int i=0; i<nrow;i++)
			for(int j=0;j<ncol;j++)
				matrix[i][j]=r.nextInt(20)-10;
		
		for(int i=0; i<nrow;i++) {
			for(int j=0;j<ncol;j++) {
				System.out.print(matrix[i][j]+" ");}
			System.out.println("");}
		System.out.println("");
	}
	
	
	public static void SearchMax()
	{
		int max=0;
		for(int i=0; i<nrow;i++) 
			for(int j=0;j<ncol;j++) 
				if(max<matrix[i][j])max=matrix[i][j];
		System.out.print("Max (first way) = "+max+"  ");
		
		max=0;
		for(int i=0; i<nrow;i++) 
			for(int j=0;j<ncol;j++)
				max=Math.max(max, matrix[i][j]);
		System.out.println("Max (second way) = "+max);
	}
	
	
	public static void SearchMin()
	{
		int min=2^31-1;
		for(int i=0; i<nrow;i++) 
			for(int j=0;j<ncol;j++) 
				if(min>matrix[i][j])min=matrix[i][j];
		System.out.print("Min (first way) = "+min+"  ");
		
		min=2^31-1;
		for(int i=0; i<nrow;i++) 
			for(int j=0;j<ncol;j++)
				min=Math.min(min, matrix[i][j]);
		System.out.println("Min (second way) = "+min);
	}
	
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		System.out.print("Size of matrix: ");		
		nrow=in.nextInt();ncol=in.nextInt();
		matrix=new int[nrow][ncol];
		CreateMatrix();
		
		int SumOfElements=0;
		for(int i=0; i<nrow;i++) 
			for(int j=0;j<ncol;j++)
				SumOfElements=SumOfElements+matrix[i][j];
		System.out.println("Sum = "+SumOfElements);
		
		SearchMax(); SearchMin();
	}
}
