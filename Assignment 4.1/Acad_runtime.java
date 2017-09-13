package assignment;
import java.util.Scanner;

public class Acad_runtime {
	public static void main(String[] args) {
		int c;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value for a : " );
		int a = scan.nextInt();

		System.out.println("Enter value for b : " );
		int b = scan.nextInt();

		c = a + b;

		System.out.println("sum of " + a + " and " + b + " is  : " + c );


		}

}
