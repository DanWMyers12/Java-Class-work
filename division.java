import java.util.Scanner;

public class division
{
	public static void main(String[]args)
	{
		int a,b,result;
		Scanner input = new Scanner(System.in);
		System.out.println("Input dividend");
		a = input.nextInt();
		System.out.println("Input divisor");
		b = input.nextInt();
		try
		{
			result = a / b;
			System.out.println("Result = " + result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Caught: Division by zero");
		}
	}
}