package task_package;

//Write a Java program to calculate Permutation and
//Combination of 2 numbers
import java.util.Scanner;

class Operations
{
	int number;
	int factorial(int num)
	{
		int fact = 1, i=1;
		number = num;
		while(num>=i)
		{
			fact = fact*i;
			i = i+1;
		}
		return fact;
	}
	
}
public class Pro5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     Operations obj = new Operations();
     int n; //no of things
     System.out.print("Enter Value of n : ");
     n = sc.nextInt();
     int r; // no of times
     System.out.print("Enter Value of r : ");
     r = sc.nextInt();
     
     System.out.print("the permutation is: "+ (obj.factorial(n)/ obj.factorial(n-r)));
     System.out.println();
     System.out.print("the Combination is " +(obj.factorial(n)/(obj.factorial(n-r)*obj.factorial(r))));
	}

}
