package task_package;

import java.util.Scanner;
//Write a Java program to find out whether the given 
//String is Palindrome or not.
class Palindrome
{
	String s;
	Palindrome()
	{
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
	}
	void show()
	{
		String rev ="";
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			rev = ch+rev;
		}
		System.out.print(rev+"\n");
		if(rev.equalsIgnoreCase(s))
		{
			System.out.print("String is palindrome");
		}
		else
		{
			System.out.print("String is not palindrome!");
		}
	}
}
public class Pro4 {

	public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.show();
	}

}
