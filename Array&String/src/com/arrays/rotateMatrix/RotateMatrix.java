package com.arrays.rotateMatrix;

public class RotateMatrix {

	public static boolean rotate(int[][] matrix)
	{
		if(matrix.length == 0 || matrix.length != matrix[0].length) return false;	//Not a square matrix
		int n = matrix.length;
		
		for(int layer = 0; layer<n/2; layer++) {
			int first = layer;
			int last = n-1-first;
			
			for(int i=first; i<last; i++)
			{
				int offset = i-first;
				
				//top->temp(top)
				int top = matrix[first][i];
				
				//left->top
				matrix[first][i] = matrix[last-offset][first];
				
				//bottom->left
				matrix[last-offset][first] = matrix[last][last-offset];
				
				//right->bottom
				matrix[last][last-offset] = matrix[i][last];
				
				//top->right
				matrix[i][last] = top;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		int[][] matrix = {{11,22,33,44,800},{55,66,77,88,900},{99,100,200,300,1000},{400,500,600,700,2000},{3000,4000,5000,6000,7000}};
		if(!rotate(matrix))
			System.out.println("Not able to rotate\n\n");
		
		for(int i = 0; i<matrix.length; i++) {
			for(int j = 0; j<matrix[0].length; j++) {
				System.out.print(matrix[i][j]+"   ");
			}
			System.out.println();
		}
	}

}
