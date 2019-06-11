//Daniel Myers
//Program assignment 2, program 3

import java.util.Scanner;

public class dmstarage
{
 public static void main(String[] args)
 {
 
 float age;
 float agevar;
 float merc = 88;
 float ven = 255;
 float jupi = 4380;
 float sat = 10767;
 float earth = 365;
 Scanner keyboard = new Scanner(System.in);
 
 System.out.print("Please enter your Earth age. ");
 age = keyboard.nextFloat();
 agevar = age * earth;
 
 System.out.println("On Mercury you are " + (agevar / merc) + " years old.");
 System.out.println("On Venus you are " + (agevar / ven) + "  years old.");
 System.out.println("On Jupiter you are " + (agevar / jupi) + " years old.");
 System.out.println("On Saturn you are " + (agevar / sat) + " years old.");
 }
}