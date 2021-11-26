package task_package;

import java.util.Scanner;
//Write a program in Java to print Diamond Pattern.
public class Pro6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=2*n-1; j++)
			{
				if(j >= n-(i-1) && j<=n+(i-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		for(int k =n; k>= 1; k--)
		{
			for(int h = 2*n-1; h>=1; h--)
			{
				if(h >= n-(k-1) && h<=n+(k-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		
		
	}

}




