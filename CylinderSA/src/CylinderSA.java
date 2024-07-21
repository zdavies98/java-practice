import java.util.Scanner;
public class CylinderSA
{
   //main
   public static void main (String [] args)
   {
   Scanner scan = new Scanner (System.in);
   
   //receive user input and declare variables
   System.out.print("Enter the cylinder's radius: ");
   double r = scan.nextDouble();
   System.out.print("Enter the cylinder's height: ");
   double h = scan.nextDouble();
   
   //create method
   double a = Area(r, h);
   
   //output
   System.out.println("The surface area of a cylinder is: " + a);

   
   }
   //my method
   public static double Area(double r, double h)
   {
    double area = 2*Math.PI*r*h + 2*Math.PI*r*r;
   
   
      
   return area;}
}