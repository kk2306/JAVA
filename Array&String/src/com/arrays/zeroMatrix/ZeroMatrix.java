package com.arrays.zeroMatrix;

public class ZeroMatrix {

	public static void setZeroes(int[][] matrix)
	{
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];
		
		//store the value 0 in row and column index
		for(int i = 0; i<matrix.length; i++)
		{
			for(int j=0; j<matrix[0].length; j++)
			{
				if(matrix[i][j] == 0)
				{
					row[i] = true;
					column[j] = true;
				}
			}
		}
		
		for(int i=0; i<row.length; i++)
			if(row[i]) nullifyRow(matrix, i);
		
		for(int j=0; j<column.length; j++)
			if(column[j]) nullifyColumn(matrix, j);
 	}
	
	public static void nullifyRow(int[][] matrix, int row)
	{
		for(int j=0; j<matrix[0].length; j++)
			matrix[row][j]=0;
	}
	
	public static void nullifyColumn(int[][] matrix, int y)
	{
		for(int i=0; i<matrix.length; i++)
			matrix[i][y]=0;
	}
	
	public static void main(String[] args) {
		
		int[][] matrix = {{10,20,20},{30,0,33},{60,70,44},{20,11,77}};
		setZeroes(matrix);
		
		for(int i = 0; i<matrix.length; i++)
		{
			for(int j=0; j<matrix[0].length; j++)
			{
				System.out.print(matrix[i][j]+"   ");
			}
			System.out.println();
		}
	}

}
