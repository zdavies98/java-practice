import java.util.Scanner;

public class SecondsConv
{
   public static void main (String [] args)
   {
     //Declare constants
     final int MINS_IN_HOUR = 60;
     final int SECS_IN_MIN = 60;
     
     //Declare variables
     long minutes, seconds, hours;
     
     //Set up input object
     Scanner input = new Scanner (System.in);
     
     //Prompt the user to enter the number of seconds
     System.out.print("Enter the number of seconds: ");
     seconds = input.nextLong();
     
     //Calculate the number of hours and minutes
     minutes = seconds / (SECS_IN_MIN);
     hours = minutes / (MINS_IN_HOUR);
     
     //Display results
     System.out.println(seconds + " seconds is approximately " +
     hours + " hours, " + (minutes % MINS_IN_HOUR) + " minutes, and " + (seconds % SECS_IN_MIN) + " seconds.");
   }
}      