package Fundamentals;

public class SalesAmount
{
public static void main(String[] args)
{
final double finamount = 30000; 
double salesAmount; 				
double commission;				
double balance;
{
salesAmount=0;				
do
{	
balance = commission = 0;	
salesAmount += 0.01;			
if (salesAmount>10000)
commission += (balance = salesAmount - 10000)*0.12;
if (salesAmount> 5000)
commission += (balance -= balance - 5000)*0.10;
if (salesAmount > 0)
commission += balance* 0.08;
} 
while (commission < finamount);
System.out.println("Final Minimum SalesAmount:\n$"+salesAmount);
}
}
}




