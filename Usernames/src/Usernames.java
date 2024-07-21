import java.util.Scanner;
import java.util.Random;
public class Usernames
{
   public static void main (String [] args)
   {
   
      Random generator = new Random();
      int num1;
      
      String Name;
   
      Scanner Usernames = new Scanner (System.in);
      
      
      //Declare variables
      String FirstName, LastName;
      
      
      
      //Calculations
      num1 = generator.nextInt();
      
      
      //output
      System.out.print("Enter your first name: ");
      FirstName = Usernames.next();
      
      System.out.print("Enter your last name: ");
      LastName = Usernames.next();
      
      System.out.print("Username: " + num1);
   }
}
      
      