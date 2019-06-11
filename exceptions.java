import java.util.Scanner;

public class exceptions
{
	public static void main(String[]args)
	{
		String students[] = {"Abe", "Bill", "Carla", "Dani", "Evan"};
		try
		{
		for (int a = 1; a<=5; a++)
		{
			System.out.println(students[a]);
		}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
			
	}
}