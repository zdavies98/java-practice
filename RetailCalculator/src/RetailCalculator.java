import java.util.Scanner;
import java.text.NumberFormat;
public class RetailCalculator
{
   public static void main (String [] args)
   {
      //Declare variables
      double WS, MP;
      
      Scanner scan = new Scanner (System.in);
      //NumberFormat for curreny
      NumberFormat x = NumberFormat.getCurrencyInstance();
      //Ask for input
      System.out.print("Enter the item's wholesale cost: ");
      WS = scan.nextDouble();
      System.out.print("Enter the item's markup percentage (as a %): ");
      MP = scan.nextDouble();
      //My method
      double retailPrice = retailPrice(WS, MP);
      //Output
      System.out.print("The item's retail price (at a " + MP + " markup) is " + x.format(retailPrice));
    }
    //My method
    public static double retailPrice(double WS, double MP)
    {
    double retailPrice = WS + WS*MP/100;
    
    return retailPrice;
    }
}  
