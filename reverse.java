/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
		//System.out.println("Hello World");
		for(int i =0;i<n;i++)
		{
		    arr[i] = sc.nextInt();
		}
		for(int i =0,j=n-1;i<n/2 || j>n/2;i++,j--)
		{
		    int temp =arr[i];
		    arr[i] = arr[j];
		    arr[j] = temp;
		}
		//System.out.println(n/2);
			for(int i =0;i<n;i++)
		{
		    System.out.print(arr[i]+" ");
		}
	}
}
