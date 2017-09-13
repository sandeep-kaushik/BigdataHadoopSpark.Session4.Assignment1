package assignment;
import java.util.Scanner;

public class Array_sort_desc {
	public static void main(String[] args) {
		int n,temp;
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of elements in array");
        n = scan.nextInt();
        int a [] = new int[n];
        System.out.println("Enter all the elements :");
        for (int i =0;i < n; i++)
        {
        	a[i] = scan.nextInt();

        }
        for (int i =0 ;i<n;i++)
        {
        	for (int j = i + 1;j < n; j++)
            {
        		if ( a[i] < a[j])
                {
        			temp = a[i];
        			a[i] = a[j];
        			a[j] = temp;

                }
            }
        }
        System.out.println("Descending Order :");
        for (int i = 0; i< n - 1; i++)
        {
        	System.out.println(a[i] + ",");

        }
        System.out.println(a[n-1]);


	}
}
