package task_package;

//Write a Java Program to check whether the given array is Mirror Inverse or not

import java.util.Scanner;

class Mirror
{
	
	int r, c;
	Mirror()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value of r : ");
		r = sc.nextInt();
		System.out.print("Enter Value of c : ");
		c = sc.nextInt();
	}
	void identical()
	{
		int found =0;
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
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				if(trans[i][j] != mat[i][j])
				{
					found= 1;
					break;
				}
			}
		}
		if(found == 0)
			System.out.println("Its a mirror inverse");
		else
			System.out.println("Its not a mirror inverse");
	}
	
}
public class Pro8 {

	public static void main(String[] args) {
		 Mirror m = new Mirror();
	      m.identical();

	}

}
