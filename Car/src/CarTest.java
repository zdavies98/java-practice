import java.util.Scanner;

public class CarTest
{//3 private members
   private static Car car1;
   private static Car car2;
   private static Car car3;
   
   public static void main (String [] args)
   {//scanner
      Scanner scan = new Scanner(System.in);
      //2/3 objects initialized with hardcoded data
      car1 = new Car("Ford", "Taurus", 2015);
      car2 = new Car("Honda", "Accord", 2007);
      car3 = new Car();
      //Output and test accessors and mutators
      System.out.println("Here is the information I have on Mr. Smith's three cars: ");
      System.out.println(car1);
      System.out.println(car2);
      System.out.println(car3);
      
      System.out.println("I am missing the info on one of his cars!\n" + 
                     "Enter the information for the third car here: ");
      
      System.out.print("Make: ");
      car3.setMake(scan.next());
      System.out.print("Model: ");
      car3.setModel(scan.next());
      System.out.print("Year: ");
      car3.setYear(scan.nextInt());
      
      System.out.println("Mr. Smith traded the Taurus for another Ford from the same year.");
      System.out.print("Enter the new Ford model: ");
      car1.setModel(scan.next());
      
      System.out.println("Mr. Smith sold the 2007 Accord to buy a more current version.");
      System.out.print("Enter the new year for the Accord: ");
      car2.setYear(scan.nextInt());
      
      System.out.println("Here is the updated information I now have on Mr. Smith's three cars: ");
      System.out.println(car1);
      System.out.println(car2);
      System.out.println(car3);
   }
}
      
      