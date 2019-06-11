import java.util.Scanner; // Needed for the Scanner class
/** This program demonstrates the Scanner class. */
public class InputPayroll
{
 public static void main(String[] args)
{
String name; // To hold a name
int hours; // Hours worked
double payRate; // Hourly pay rate
double grossPay; // Gross pay
Scanner keyboard = new Scanner(System.in);
System.out.print("What is your name? ");
name = keyboard.nextLine();
System.out.print("How many hours did you work this week? ");
hours = keyboard.nextInt();
System.out.print("What is your hourly pay rate? ");
payRate = keyboard.nextDouble();
grossPay = hours * payRate;
System.out.println("Hello, " + name);
System.out.println("Your gross pay is $" + grossPay);
}
}