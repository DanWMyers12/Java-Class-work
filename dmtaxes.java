//Daniel Myers
//Program assignment 4, program 1

import java.util.Scanner;

public class dmtaxes
{
 public static void main(String[] args)
 {
 int ssn;
 String fstat;
 double income;
 double tincome;
 int sdeduct=5000;
 int exempt;
 int ededuct=1000;
 int tihi=0;
 int tilow=0;
 int tilows=5000;
 int tihis=20000;
 int tilowm=10000;
 int tihim=40000;
 int tilowj=7000;
 int tihij=25000;
 double trate =0;
 double tratel=.15;
 double tratem=.22;
 double trateh=.31;
 double tax;
 
 Scanner keyboard = new Scanner(System.in);
 
 System.out.println("Please enter Taxpayer ID ");
 System.out.print("Enter '0'(zero) to exit ");
 ssn = keyboard.nextInt();
 keyboard.nextLine();	 //Used to correct for the nextInt to nextLine issue
 
 do
 {
	 if (ssn ==0)
	 return;
	 do
	 {
		 System.out.println("Please enter Filing Status ");
		 System.out.print("'S'- Single, 'M'- Married, 'J'- Married filing Joint: ");
		 fstat = keyboard.nextLine();
	 }while (fstat =="S"|| fstat =="J" || fstat =="M");
	 switch (fstat)
	 {
		 case "S":
		 tihi = tihis;
		 tilow = tilows;
		 break;
		 case "M":
		 tihi = tihim;
		 tilow = tilowm;
		 break;
		 case "J":
		 tihi =tihij;
		 tilow = tilowj;
		 break;
	 }
	 System.out.print("Please enter Gross Income ");
	 income = keyboard.nextDbl();
	 System.out.print("Please enter exemptions (0-12) ");
	 exempt = keyboard.nextInt();
	 while (exempt<0||exempt>12)
	 {
		 System.out.print("Please enter exemptions (0-12) ");
		 exempt = keyboard.nextInt();
	 }		 
	 tincome = income - sdeduct - (exempt *ededuct);
	 switch (fstat)
	 {
	 case "J":
	 if (tincome<0)
		 tincome = 0;
	 if (tincome < tilow)
		 trate=.17;
	 else if (tincome>tihi)
		 trate=.33;
	 else 
		 trate = .24;
	 break;
	 case "S":
	 case "M":
	 	 if (tincome<0)
		 tincome = 0;
	 if (tincome < tilow)
		 trate=tratel;
	 else if (tincome>tihi)
		 trate=trateh;
	 else 
		 trate =tratem;
	 break;
	 }
	 tax = trate * tincome;
	 System.out.println("Taxpayer ID:		"+ssn);
	 System.out.println("Taxable income:		"+tincome);
	 System.out.println("Tax rate for " + fstat + ":		"+(trate*100)+"%");
	 System.out.println("Taxes Due:		"+tax);
	 System.out.println();
	 System.out.println();
	 System.out.println("Please enter Taxpayer ID ");
	 System.out.print("Enter '0'(zero) to exit ");
	 ssn = keyboard.nextInt();
 }while (ssn == 0);				//does this even do anything?
 }
}