//Daniel Myers
//Program assignment 1 program 3
public class owenstock
{
 public static void main(String[] args)
 {
 double buyAmnt = 1000;
 double buyPrice = 28.32;
 double buycommrate = .02;
 double buysub;
 double buycomm;
 double sellAmnt = 1000;
 double sellPrice = 35.64;
 double sellcommrate = .02;
 double sellsub;
 double sellcomm;
 double selltotal;
 
 buysub = buyAmnt * buyPrice;
 buycomm = buysub * buycommrate;
 sellsub = sellAmnt * sellPrice;
 sellcomm= sellsub * sellcommrate;
 selltotal = sellsub - buysub - buycomm - sellcomm;

 System.out.println("Owen paid $" + buysub + " for " + buyAmnt + " shares.");
 System.out.println("He paid $" + buycomm + " commission to his broker.");
 System.out.println("  ");
 System.out.println("Owen sold " + sellAmnt + " shares for  a total of $" + sellsub + ".");
 System.out.println("He paid $" + sellcomm + " commission to his broker.");
 System.out.println("  ");
 System.out.println("Owen's profit on the shares was $" + selltotal + ".");
 }
}