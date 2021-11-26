package task_package;
//1. Basic Calculator Operation 

import java.util.Scanner;
import java.lang.Math;

class Result
{
	int res1, res2;
	void add(int res1, int res2)
	{
		this.res1 = res1;
		this.res2 = res2;
		System.out.println("ADDITION = "+ (this.res1+ this.res2));
	}
	void sub(int res1, int res2)
	{
		this.res1 = res1;
		this.res2 = res2;
		System.out.println("SUBSTRACTION = "+ (this.res1- this.res2));
	}
	void mul(int res1, int res2)
	{
		this.res1 = res1;
		this.res2 = res2;
		System.out.println("MULTIPLICATION = "+ (this.res1*this.res2));
	}
	void div(int res1, int res2)
	{
		this.res1 = res1;
		this.res2 = res2;
		System.out.println("DIVITION = "+ (this.res1/(float)this.res2));
	}
	void mod(int res1, int res2)
	{
		this.res1 = res1;
		this.res2 = res2;
		System.out.println("MOD = "+ (this.res1% this.res2));
	}
	void square(int res1)
	{
		this.res1 = res1;
		System.out.println("Square = " + (this.res1*this.res1));
	}
	void squareRoot(int res1)
	{
		this.res1 = res1;
		System.out.print("square root = ");
		System.out.println(Math.sqrt(this.res1));
	}
	void power(int res1, int res2)
	{
		this.res1 = res1;
		this.res2 = res2;
		int ans=1;
		System.out.print("power = ");
		for(int i= this.res2; i>0; i--)
		{
			ans = ans* this.res1 ;
		}
		System.out.println(ans);
	}
	
}

public class Pro1 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Result obj = new Result();
		while(true)
		{
			System.out.println("\n============Basic Calculator Operations========");
			System.out.println("1.Addition");
			System.out.println("2.Substraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.mod");
			System.out.println("6.Square");
			System.out.println("7.Square root");
			System.out.println("8.Power");
			System.out.println("9.EXIT");
			System.out.println("enter choice: ");
			int n = sc.nextInt();
			
			switch(n)
			{
			  case 1:
				  System.out.println("enter first number: ");
				  int num1 = sc.nextInt();
				  System.out.println("enter second number: ");
				  int num2 = sc.nextInt();
				  obj.add(num1,num2);
		         break;
			  case 2:
				  System.out.println("enter first number: ");
				  int n1 = sc.nextInt();
				  System.out.println("enter second number: ");
				  int n2 = sc.nextInt();
				  obj.sub(n1,n2);
				  break;
			  case 3:
				  System.out.println("enter first number: ");
				  int a = sc.nextInt();
				  System.out.println("enter second number: ");
				  int b = sc.nextInt();
				  obj.mul(a,b);
				  break;
			  case 4:
				  System.out.println("enter first number: ");
				  int x = sc.nextInt();
				  System.out.println("enter second number: ");
				  int y = sc.nextInt();
				  obj.div(x,y);
				  break;
			  case 5:
				  System.out.println("enter first number: ");
				  int p = sc.nextInt();
				  System.out.println("enter second number: ");
				  int q = sc.nextInt();
				  obj.mod(p,q);
				  break;
			  case 6:
				  System.out.println("enter number: ");
				  int number = sc.nextInt();
				  obj.square(number);
				  break;
			  case 7:
				  System.out.println("enter number: ");
				  int numb = sc.nextInt();
				  obj.squareRoot(numb);
				  break;
			  case 8:
				  System.out.println("enter base: ");
				  int base = sc.nextInt();
				  System.out.println("enter power: ");
				  int index = sc.nextInt();
				  obj.power(base, index);
				  break;
			  case 9:
				  System.exit(0);
			  default:
				  System.out.println("enter valid choice!");	
			}
			
		}

	}
}
