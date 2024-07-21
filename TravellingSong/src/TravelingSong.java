import java.util.Scanner;
public class TravelingSong
{
   public static void main (String [] args)
   {
   //Declare variables
   
   int numberofverses;
   
   String string = "x";
   
   Scanner scan = new Scanner (System.in);
   
   
   //Determine output
   while(string.equals("x"))
   {
   
      System.out.print("How many verses (1 to 100)? ");
      numberofverses = scan.nextInt();
   
   
      while(numberofverses < 0 || numberofverses > 100)
      {
         System.out.print("Invalid input. Enter a number between 0 and 100: ");
         numberofverses = scan.nextInt();
         
      }
   
   for(int n = 100; n > 100 - numberofverses; n--)
   {
   //Output
      System.out.println("\n" + n + " bottles of beer on the wall");
      System.out.println("\n" + n + " bottles of beer");
      System.out.println("\nIf one of those bottles should happen to fall");
      System.out.println("\n" + (n - 1) + " bottles of beer on the wall");
   }
}
} 
}
      
      
      
      
