package task_package;

//Write a Java program to calculate a Factorial of a number.
import java.util.Scanner;
class Fact
{
	int num;
	Fact()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number: ");
		num = sc.nextInt();
	}
	void show()
	{
		int fact = 1;
		int i= 1;
		while(num >=i)
		{
			fact = fact * i;
			i = i+1;
		}
		System.out.println("Factorial of a number: "+ fact);
	}
}
public class Pro3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Fact f = new Fact();
       f.show();
	}

}
