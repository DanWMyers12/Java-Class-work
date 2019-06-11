//Daniel Myers
//Program assignment 1, program 2
public class change
{
 public static void main(String[] args)
 {
 int centsstart = 41;
 int cents;
 int quarters;
 int dimes;
 int nickels;
 int pennies;
 cents = centsstart;
 quarters = cents / 25;
 cents = cents - quarters * 25;
 dimes = cents / 10;
 cents = cents - dimes * 10;
 nickels = cents / 5;
 cents = cents - nickels * 5;
 pennies = cents;
 System.out.println("Amount = " + centsstart + " cents");
 System.out.println("  ");
 System.out.println("Change:");
 System.out.println("  ");
 System.out.println("Quarters = " + quarters);
 System.out.println("Dimes = " + dimes);
 System.out.println("Nickels = " + nickels);
 System.out.println("Pennies = " + pennies);
 }
}