import java.util.Scanner;
import java.text.NumberFormat;
public class Payroll
{
   public static void main (String [] args)
   {
      //Declare variables
      double WorkHours, PayRate, fedTax, stateTax, fedTaxFinal, stateTaxFinal;
      double stateTaxPercent, fedTaxPercent, grossPay, TotalDeduction, NetPay;
      
      //Declare string
      String Name;
      
      Scanner Payroll = new Scanner (System.in);
      
      System.out.println("Enter employee's name: ");
      Name = Payroll.next();
      
      System.out.println("Enter number of hours worked in a week: ");
      WorkHours = Payroll.nextDouble();
      
      System.out.println("Enter hourly pay rate: ");
      PayRate = Payroll.nextDouble();
      
      System.out.println("Enter federal tax withholding rate (as decimal): ");
      fedTax = Payroll.nextDouble();
      
      System.out.println("Enter state tax withholdng rate (as a decimal): ");
      stateTax = Payroll.nextDouble();
      
    
      
      //Calculations
      grossPay = (WorkHours * PayRate);
      TotalDeduction = (fedTax + stateTax);
      NetPay = (grossPay - TotalDeduction);
      fedTaxFinal = (grossPay * fedTax);
      stateTaxFinal = (grossPay * stateTax);
      
      //output
      System.out.println("Employee Name: " + Name);
      System.out.println("Hours Worked: " + WorkHours);
      System.out.println("Pay Rate: " + PayRate);
      System.out.println("Gross Pay: " + grossPay);
      System.out.println("Deductions:");
      System.out.println("  Federal Tax @20%: " + fedTaxFinal);
      System.out.println("  State Tax @9% " + stateTaxFinal);
      System.out.println("  Total deduction:" + TotalDeduction);
      System.out.println("  Net Pay: " + NetPay);  
      
      
      
      
      }
} 