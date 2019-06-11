//Daniel Myers
//Program assignment 2, program 2

import java.util.Scanner;

public class dmsalestax
{
 public static void main(String[] args)
 {
 float price;
 float stax = 0.04;
 float ctax = 0.02;
 float staxsub;
 float ctaxsub;
 float taxsubt;
 float total;
 Scanner keyboard = new Scanner(System.in);
 
 System.out.print("Please enter price. ");
 price = keyboard.nextFloat();
 staxsub = price * stax;
 ctaxsub = price * ctax;
 taxsubt = staxsub + ctaxsub;
 total = price + staxsub + ctaxsub;
 
 System.out.println("Sale price:	$" + price);
 System.out.println("State Tax: 	$" + staxsub);
 System.out.println("County Tax:	$" + ctaxsub);
 System.out.println("Total Sale:	$" + total);
 }
}