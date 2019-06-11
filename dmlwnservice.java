//Daniel Myers
//Assignment 3, Program 1
import java.util.Scanner;
public class dmlwnservice
{
 public static void main(String[] args)
 {
  int length;
  int width;
  int area;
  int prate = 0;
  int season = 20;
  int wserv = 2;
  int sserv = 5;
  int lrate = 25;
  int mrate = 35;
  int hrate = 50;
  char payopt;
  
  Scanner keyboard = new Scanner(System.in);
  
  System.out.println("Welcome to Myers Mowing.");
  System.out.print("Please enter yard length in feet.  ");
  length = keyboard.nextInt();
  System.out.print("Please enter yard width in feet.  ");
  width = keyboard.nextInt();
  area = length * width;
  if (area < 400)
	  prate = lrate;
  else if (area < 600)
      prate = mrate;
  else
      prate = hrate;
  System.out.println("Yard area is " + area + ".");
  System.out.println("Base fee is $" + prate + ", plus a service charge of $" +wserv+ ". Paid weekly.");
  System.out.println("Seasonal rate is $" + (prate * season) + ". Paid in lump or in two installments,");
  System.out.println("with a $" + sserv + " service fee per payment.");
  System.out.println("How would you like to pay?");
  System.out.println("f=full, s=split, w=weekly");
  System.out.print("...  ");
  payopt = keyboard.next().charAt(0);
  switch (payopt)
  {
     case 'w':
     System.out.println("You have chosen to pay your balance of $" + (prate * season) + " in weekly payments of $" + (prate + wserv) + ".");
	 case 'f':
     System.out.println("You have chosen to pay your balance of $" + (prate * season) + " in one payment of $" + (prate * season) + ".");
	 case 's':
     System.out.println("You have chosen to pay your balance of $" + (prate * season) + " in two payments of $" + ((prate*season/2) + sserv) + ".");
  }
  }
}




// x==y ->  Is X equal to y
// x>y  ->  Is x greeater than y
// x<y  ->  Is x less than y
// x>=y  -> Is x greater than or equal to y
// x<=y  -> Is x less than or equal to y
// x!=y  -> Is x different from y