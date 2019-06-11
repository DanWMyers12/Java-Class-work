public class payroll
{
 public static void main(String[]args)
 {
  int hours = 40;
  double grossPay;
  double payRate = 25.0;

  grossPay = hours * payRate;
  System.out.println("Your gross pay is $" + grossPay);
 }
}