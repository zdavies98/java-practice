import java.util.Scanner;
public class Fusion
{
   public static void main (String [] args)
   {
   
   Scanner scan = new Scanner (System.in);
   
   String name1, name2;
   
  
   //Prompt user to input
   System.out.print("Who is the first gem? ");
   name1 = scan.next();
   
   System.out.print("Who is the second gem? ");
   name2 = scan.next();
   
   //Determine fusion. Output
   if (name1.equals("Garnet") && name2.equals("Pearl") || name1.equals("Pearl") && name2.equals("Garnet"))
      System.out.println("When " + name1 + " and " + name2 + " fuse, they create Sardonyx.");
      
   else if (name1.equals("Garnet") && name2.equals("Amethyst") || name1.equals("Amethyst") && name2.equals("Garnet"))
      System.out.println("When " + name1 + " and " + name2 + " fuse, they create Sugilite.");
      
   else if (name1.equals("Amethyst") && name2.equals("Pearl") || name1.equals("Pearl") && name2.equals("Amethyst"))
      System.out.println("When " + name1 + " and " + name2 + " fuse, they create Opal.");
   
   else if (name1.equals("Steven") && name2.equals("Amethyst") || name1.equals("Amethyst") && name2.equals("Steven"))
      System.out.println("When " + name1 + " and " + name2 + " fuse, they create Smokey Quartz.");

   else if (name1.equals("Connie") && name2.equals("Steven") || name1.equals("Steven") && name2.equals("Connie"))
      System.out.println("When " + name1 + " and " + name2 + " fuse, they create Stevonnie.");

   else
      System.out.println("No known fusion");
   
}
}