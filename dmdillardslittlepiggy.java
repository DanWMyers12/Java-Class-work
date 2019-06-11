//Daniel Myers
//Assignment 5, Program 1
import java.util.Random;
import java.util.Scanner;

public class dmdillardslittlepiggy
{
 public static void main(String[] args) throws Exception
 {
	 char input = 'a';
	 int totalh = 0;
	 int totalc = 0;
	 System.out.println("Welcome to Dillard Little Piggy!");
	 System.out.println("Would you like to play? (Y/N)");
	 while (input != 'n' && input != 'N' && input != 'y' && input != 'Y')
	 {
		 input = (char)System.in.read();
	 }
	 if (input == 'n' || input == 'N')
		 System.exit(0);
	 while (input == 'Y' || input == 'y')
	 {
		 while (totalh < 100 || totalc < 100)
		 {
			 totalh = humanturn(totalh);
			 System.out.println("Player's turn ends at " + totalh);
			 if (totalh >= 100)	 
			 {System.out.println("Congraduations, you win!");
			 totalh = 0;
			 totalc = 0;
			 break;}
			 totalc = compturn(totalc);
			 System.out.println("Computer's turn ends at " + totalc);
			 if (totalc >= 100)
			 {System.out.println("Sorry, you lost.");
			 input = (char)System.in.read();
		     totalh = 0;
			 totalc = 0;
			 break;}
		 }
		 input = 'a';
	 System.out.println("Would you like to play again? (Y/N)");
	 while (input != 'n' && input != 'N' && input != 'y' && input != 'Y')
	 {
		 input = (char)System.in.read();
	 }
	 }
 }
 public static int humanturn(int total) throws Exception
 {
	 char input = 'a';
	 int turn = 0;
	 int tally = 0;
	 int chance = 0;
	 		 System.out.print("Would you like to Roll(r) or Hold(h)?");
	 while (input != 'r' && input != 'R' && input != 'h' && input != 'H')
	 {
		 input = (char)System.in.read(); 
	 }
	 if (input == 'h' || input == 'H')
		 return total;
	 while (input == 'r' || input == 'R')
	 {
		 turn = rolldice();
		 if (turn == -1)
		 { total = 0;
		 System.out.println("Too bad! Total points reset. Turn over.");
		 return total;}
		 else if (turn == 0)
		 { total += turn;
		 System.out.println("Too bad! Zero points this turn. Turn over.");
		 return total;}
		 tally += turn;
		 chance = calcpoints(total, tally);
		 if (chance >= 100)
		 {total += tally;
		 return total;}
		 System.out.println("Player turn points = " + tally + ", Total points on hold = " + chance);
		 input = 'a';
		 System.out.print("Would you like to Roll(r) or Hold(h)?");
		  while (input != 'r' && input != 'R' && input != 'h' && input != 'H')
	 {
		 input = (char)System.in.read(); 
	 }
	 }

	 total += tally;
	 return total;
 }
 public static int compturn(int total)
 {
	 int turn = 0;
	 int tally =0;
	 int chance = 0;
	 while (tally < 20)
	 {
		 turn = rolldice();
		 if (turn == -1)
		 { total = 0;
		 System.out.println("Too bad! Total points reset. Turn over.");
		 return total;}
		 else if (turn == 0)
		 { total += turn;
		 System.out.println("Too bad! Zero points this turn. Turn over.");
		 return total;}
		 tally += turn;
		 chance = calcpoints(total,tally);
		 if (chance >= 100)
		 {total += tally;
		 return total;}
		 System.out.println("Computer turn points = " + tally + ", Total points on hold = " + chance);
	 }
	 total += tally;
	 System.out.println("Computer holds at " + tally + " points. Total is " + total);
	 return total;
 }	 
 public static int rolldice() //feeds int turn in player or comp turn
 {
	 Random dice = new Random();
	 int turn = 0;
	 int die1 = dice.nextInt(6)+1;
	 int die2 = dice.nextInt(6)+1;
	 if (die1 == 1 && die2 ==1)
		 turn = -1;
	 else if (die1 == 1 || die2 ==1)
		 turn = 0;
	 else if (die1 ==6 && die2 ==6)
		 turn = 25;
	 else 
		 turn = die1 + die2;
	 System.out.println("Roll results: (" + die1 + " , " + die2 +")");
	 return turn; 
 }
 public static int calcpoints(int total, int turn) // this seems redundant given my setup... remove? Left in only because the program called for the method
 {
	 total += turn;
	 return total;
 }
}