package assignment;
import java.util.Scanner;

public class Find_even_odd {
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value for a : " );
		int a = scan.nextInt();
		int o = 0;
		int e =0;
		System.out.println("Enter value for b : " );
		int b = scan.nextInt();
		int [] EvenNumber = new int[b];
		int [] OddNumber = new int[b];

		for (int i = a;i< b + 1;i ++)
		{

		if ((i % 2) == 0)
		            {
		EvenNumber[e] = i;
		System.out.println("EVEN :"+EvenNumber[e]);
		              e =  e + 1;
		            }
		else
		            {
		OddNumber[o] = i;
		System.out.println("ODD :"+i);
		                 o = o + 1;
		            }

		}

		System.out.println("LIST OF EVEN NUMBERS BETWEEN " + a + " AND " + b + ":");
		for    (e = 0;e <EvenNumber.length;e++)
		{
			System.out.println(EvenNumber[e]);
		}
			System.out.println("LIST OF ODD NUMBERS BETWEEN " + a + " AND " + b + ":");
		for    (o = 0;o <OddNumber.length;o++)
		{
			System.out.println(OddNumber[o]);
	    }


	}

}
