package Fundamentals;

import java.util.Scanner;
public class Payroll 
{
public static void main(String[] args) 
{
double federal,grosspay,state,totalDeduction;
Scanner sc= new Scanner(System.in);
System.out.print("Enter employee’s name: ");
String name = sc.next();	
System.out.print("Enter number of hours worked in a week: ");
double hoursWorked = sc.nextDouble();
System.out.print("Enter hourly pay rate: ");
double hourlyPayRate = sc.nextDouble();
System.out.print("Enter federal tax withholding rate: ");
double federalTaxRate = sc.nextDouble();
System.out.print("Enter state tax withholding rate: ");
double stateTaxRate = sc.nextDouble();
System.out.printf("Employee name: " + name);
System.out.println("Hours worked: " +hoursWorked);
System.out.println("Pay rate : $" +hourlyPayRate);
System.out.println("Gross pay: $" + (grosspay = hoursWorked * hourlyPayRate));
System.out.println("Deductions:");
System.out.println("Federal witholding (20.0%):$" +(federal = grosspay * federalTaxRate));
System.out.println("State witholding (9.0%): $" +(state = grosspay * stateTaxRate));
System.out.println("Total deduction: $" +(totalDeduction = federal + state));
System.out.println("Net pay: $" +(grosspay - totalDeduction));
}
}








