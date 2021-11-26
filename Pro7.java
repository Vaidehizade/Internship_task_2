package task_package;

import java.util.*;
//Write a Java Program to reverse the letters present in the given String.
class  Reverse 
{
	String s;
	Reverse()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string: ");
		s = sc.nextLine();
	}
	void show()
	{
		 String words[]=s.split("\\s"); //array of words 
		 String reverseWord="";  
		 for(String w:words)
		 {  
		        StringBuilder sb=new StringBuilder(w);  
		        sb.reverse();  
		        reverseWord+=sb+" ";  
		 }  
		    System.out.println("Resultant string: "+reverseWord.trim());   
	}
}
public class Pro7 {

	public static void main(String[] args) {
		Reverse  r = new Reverse();
		r.show();
	}

}
