package task_package;

import java.util.Scanner;
//Write a Java Program to check whether the given array is Mirror Inverse or not.
class Matrix
{
	
	int r, c;
	Matrix()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value of r : ");
		r = sc.nextInt();
		System.out.print("Enter Value of c : ");
		c = sc.nextInt();
	}
	void transpose()
	{
		int mat[][] = new int[r][c];
		int trans[][] = new int[r][c];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter matrix: ");
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				mat[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				trans[i][j] = mat[j][i];
			}
		}
		System.out.println("======transpose of matrix====");
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.print(trans[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
}
public class Pro10 {

	public static void main(String[] args) {
		
      Matrix m = new Matrix();
      m.transpose();
	}

}
