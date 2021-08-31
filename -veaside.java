/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args)
	{
        int[] arr = {-1,2,4,-5,-4,7,9,-6};
         int j =arr.length-1;
        for(int i=arr.length-1;i>=0;i--)
        {
           
         if(arr[i]>0)
         {
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] =temp;
             j-=1;
         }
        }
     for(int i=0;i<arr.length;i++)
        {
		System.out.print(arr[i]+" ");
        }
            
	} 
}

