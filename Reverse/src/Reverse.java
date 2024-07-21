import java.util.Scanner;

public class Reverse

{

   public static void main(String[] args)

   {

     int number, lastDigit, reverse = 0;

     Scanner scan = new Scanner(System.in);

     System.out.print("Enter a positive integer: ");

     number = scan.nextInt();
     
     int rev = R(number);
     //Output
     System.out.println("That number reversed is " + rev);
      
      
}
     //My method R

     public static int R(int number)
     {   int reverse = 0;
         while (number > 0) {
         int lastDigit = number % 10;
         
         number = number / 10;
         
         reverse = (reverse * 10) + lastDigit;

     }
     
   //return the reversed number
   return reverse;
  }



}