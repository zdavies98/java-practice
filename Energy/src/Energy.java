import java.util.Scanner;

public class Energy
{
   public static void main (String [] args)
   {
      //Declare constants
      final int Cp = 4184;
      
      //Declare variables
      double energy, kilograms, initialTemperature, finalTemperature;
      
      //Set up input object
      Scanner input = new Scanner (System.in);
      
      //Prompt the user to input the amount of water, the initial and final temperature
      System.out.print("Enter the amount of water in kilograms: ");
      kilograms = input.nextDouble();
      
      System.out.print("Enter the initial temperature in degree Celsius: ");
      initialTemperature = input.nextDouble();
      
      System.out.print("Enter the final temperature in degree Celsius: ");
      finalTemperature = input.nextDouble();
      
      //Calculate energy
      energy = kilograms * (finalTemperature - initialTemperature) * Cp;
      
      //Display result
      System.out.println("The energy needed is " + energy + " joules.");
   }
}