//This program calculates the amount of pay that
//will be contributed to a retirement plan if 5%,
//7%, or 10% of montly pay is withheld.

public class Contributions
{
 public static void main(String[] args)
 {
 double monthlyPay = 6000.0;
 double contribution;
 
 contribution =monthlyPay * .05;
 System.out.println("5 percent is $" + contribution + " per month.");

 contribution =monthlyPay * .08;
 System.out.println("8 percent is $" + contribution + " per month.");

 contribution =monthlyPay * .1;
 System.out.println("10 percent is $" + contribution + " per month.");
 }
}