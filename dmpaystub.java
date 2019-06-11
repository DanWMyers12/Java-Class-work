//Daniel Myers
//Assignment 3, Program 2
import java.util.Scanner;
public class dmpaystub
{
 public static void main(String[] args)
 {
  float wage;
  float hours;
  int exempt;    
  float ovtime;
  double ovrate = 1.5;
  int fhours = 40;
  double wthold = 0;
  double gpay;
  double npay;
  double tax;
  
  String name;
    
  Scanner keyboard = new Scanner(System.in);
  
  System.out.print("Please enter employee First and Last name.   ");
  name = keyboard.nextLine();
  System.out.print("Please enter employee wage.  ");
  wage = keyboard.nextFloat();
  System.out.print("Please enter employee hours.  ");
  hours = keyboard.nextFloat();
  if (hours > fhours)
	  ovtime = hours - fhours;
  else 
      ovtime = 0;
  System.out.println("Please enter employee exemptions.  ");
  System.out.print("Enter a number between 1 and 4. Values >4 will default to 4.   ");
  exempt = keyboard.nextInt(); 
  if (exempt >4)
	  exempt = 4;  	  
  switch (exempt)
  {
     case 1:
     wthold = .2;
	 case 2:
     wthold = .15;
	 case 3:
	 wthold = .12;
	 case 4:
     wthold = .1;
  }
  gpay = (wage * (hours - ovtime)) + (ovtime * ovrate * wage);
  tax = (gpay * wthold);
  npay = gpay - tax;
  System.out.println(name +" Paystub Reveiw:");
  System.out.println("Gross Pay:		$" +gpay);
  System.out.println("Tax Withholings:		$" +tax);
  System.out.println("Net Pay:			$" +npay);
  }
}