//Daniel Myers
//Program assignment 2, program 1

import java.util.Scanner;

public class dmavg
{
 public static void main(String[] args)
 {
 String name;
 float score1;
 float score2;
 float score3;
 float avg;
 int nbr = 3;
 Scanner keyboard = new Scanner(System.in);
 
 System.out.print("Enter student's name. ");
 name = keyboard.nextLine();
 System.out.print("Enter first test score. ");
 score1 = keyboard.nextFloat();
 System.out.print("Enter second test score. ");
 score2 = keyboard.nextFloat();
 System.out.print("Enter final test score. ");
 score3 = keyboard.nextFloat();
 avg = (score1 + score2 + score3)/nbr;
 System.out.println("");
 System.out.println(name);
 System.out.println("");
 System.out.println("Test AVG:	" + avg);
 }
}