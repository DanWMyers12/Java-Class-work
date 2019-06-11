//Daniel Myers
//Program assignment 2, program 2

import java.util.Scanner;

public class dmsales
{
 public static void main(String[] args)
 {
 double price;
 double stax = 0.04;
 double ctax = 0.02;
 double staxsub;
 double ctaxsub;
 double taxsubt;
 double total;
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