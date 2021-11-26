package task_package;
//Write a Java program to calculate Fibonacci Series up to n numbers.
import java.util.Scanner;
public class Pro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Fibo obj = new Fibo();
		        Scanner sc = new Scanner(System.in);
				System.out.println("enter number: ");
				int num = sc.nextInt();
				System.out.println("Fibonacci series: ");
	}

}

class Fibo
{
	int n;
    void show(int n)
    {
    	this.n = n;
    	int t1 = 0, t2 = 1, nextTerm = 0;
    	for (int i = 1; i <= this.n; ++i) {
            // Prints the first two terms.
            if(i == 1) {
               System.out.print(t1+ " ");
                continue;
            }
            if(i == 2) {
            	System.out.print(t2+ " ");
                continue;
            }
            nextTerm = t1 + t2;
            t1 = t2;
            t2 = nextTerm;
            
            System.out.print(nextTerm + " ");
    }
   }
	
}


