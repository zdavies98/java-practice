import java.util.Scanner;
import java.text.DecimalFormat;
public class Heron
{
   public static void main (String [] args)
   {
      String Name;
      Scanner scan = new Scanner (System.in);
      DecimalFormat sides = new DecimalFormat ("0.00");
      
      //Declare variables
      double a, b, c, s, area;
 
      
      //Prompt user to enter sides
      System.out.print("Enter the length of side 1: ");
      a = scan.nextDouble();
      
      System.out.print("Enter the length of side 2: ");
      b = scan.nextDouble();
    
      System.out.print("Enter the length of side 3: ");
      c = scan.nextDouble();
      
      //Calculations
      s = (a + b + c)/2;
      area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
      
      
      //Output
      System.out.print("Area: " + area);
      
      
      
      
      
      
      
   }
}
      