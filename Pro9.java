package task_package;

import java.util.Scanner;
import java.util.*;
//ArrayList in JAVA = dynamic array

class ArrayListExample
{
	int n;
	void show()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of elements: ");
		n = sc.nextInt();
		ArrayList<Integer>arr = new ArrayList<Integer>(n);  //declaration at runtime
		System.out.println("enter array: ");
		for(int i=0; i<n; i++)
		{
			int ele = sc.nextInt();
			arr.add(ele); // scanning array
		}
		System.out.println("Print array: ");
		for(int i=0; i<n; i++)
			System.out.print(arr.get(i) + " "); //print array
		System.out.println("\nenter position on which you want to remove: ");
		int pos = sc.nextInt();
	    arr.remove(pos);
		
		for(int i=0; i<arr.size(); i++)
			System.out.print(arr.get(i) + " "); //print array
	}
	
	
	
}

public class Pro9 {

	public static void main(String[] args) {
		
		ArrayListExample e = new ArrayListExample();
        e.show();
	}

}
