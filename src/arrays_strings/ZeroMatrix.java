package arrays_strings;

import java.util.Scanner;

public class ZeroMatrix {

	public static void main(String[] args) {
		System.out.println("Enter M");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		System.out.println("Enter N");
		int n = sc.nextInt();
		int[][] matrix = new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}
		sc.close();
		int[][] res = zero(matrix);
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<res[0].length;j++)
			{
				System.out.print(res[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public static int[][] zero(int[][] matrix)
	{
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[0].length;j++)
			{
				if(matrix[i][j] ==0)
				{
					row[i] =true;
					column[j]=true;
				}
			}
		}
		for(int i=0;i<matrix.length;i++)
		{
			if(row[i])
			{
				nullifyrow(matrix, i);
			}
		}
		for(int i=0;i<matrix[0].length;i++)
		{
			if(column[i])
			{
				nullifycolumn(matrix, i);
			}
		}
		return matrix;
		
	}

	private static void nullifycolumn(int[][] matrix, int i) {
		for(int x=0;x<matrix[0].length;x++)
		{
			matrix[i][x]=0;
		}
	}

	private static void nullifyrow(int[][] matrix, int i) {
		for(int x=0;x<matrix.length;x++)
		{
			matrix[x][i]=0;
		}
	}

}
