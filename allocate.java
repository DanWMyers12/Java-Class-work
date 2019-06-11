public class allocate
{
	public static void main(String[]args)
	{
		try
		{
			long num[] = new long[10000000000];
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			system.out.println("The finally block will always execute");
		}
	}
}
		