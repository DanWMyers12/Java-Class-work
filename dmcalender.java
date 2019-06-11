import java.util.Scanner;
public class dmcalender
{
	public static void main(String[] args)
	{
		int year = 0;
		int month = 0;
		int mdays = 0;
		int days = 0;
		int leap = 2;
		String monthnm[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		String mname;
		Scanner input = new Scanner(System.in);
		do
		{
			System.out.print("Please enter 4-digit year  ");
			year = input.nextInt();
		}while (year < 1900);
		do
		{
			System.out.print("Please enter month (1-12) ");
			month = input.nextInt()-1;
		}while (month < 0 || month > 12);
		mname = monthnm[month];
		for (;year>1899; year--)
		{
			if (year %4 == 0)
				if (year %100 ==0)
					if (year %400 == 0)
						leap = 1;
					else
						leap = 0;
				else
					leap =1;
			else
				leap = 0;
			while (month-->0)
			{
				switch (month)
				{
					case 9: case 4: case 6: case 11:
					mdays = 30;
					break;
					case 2:
					mdays = 28 + leap;
					break;
					default:
					mdays = 31;
					break;
				}
			days += mdays;
			}
			System.out.println(year + " : " + leap + " : " + days);
			month = 12;
		}
		int daylog = days %7;
		System.out.println("First day is " + daylog + " " + mname);
			
			
//		switch (month)
//		{
//		}
	}
}