import java.util.Scanner;

public class ShapeTest
{//variables
   private static Shape s1;
   private static Shape s2;
   private static Shape s3;

   public static void main (String [] args)
   {//scanner
      Scanner scan = new Scanner (System.in);
      //3 shapes
      s1 = new Shape();
      s2 = new Shape();
      s3 = new Shape();
      //output
      System.out.println("Enter info on 3 shapes:");
      System.out.print("Enter the name of the shape: ");
      s1.setShape(scan.next());
      System.out.print("Enter the number of sides: ");
      s1.setNum(scan.nextInt());
      System.out.print("Enter the name of the shape: ");
      s2.setShape(scan.next());
      System.out.print("Enter the number of sides: ");
      s2.setNum(scan.nextInt());
      System.out.print("Enter the name of the shape: ");
      s3.setShape(scan.next());
      System.out.print("Enter the number of sides: ");
      s3.setNum(scan.nextInt());

      System.out.println("Here is the info you entered for the 3 shapes:");
      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s3);
   }
}

     
      