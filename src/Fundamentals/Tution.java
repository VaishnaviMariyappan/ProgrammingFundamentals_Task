package Fundamentals;

public class Tution 
{
	
	public static void main(String[] args)
	{
	int tuitionPerYear = 10000;
	int total = 0;
	for (int year = 1; year <= 14; year++) 
	{
	tuitionPerYear += tuitionPerYear * .05;
	if (year == 10)
	{
	System.out.println("The cost of tuition in 10 years is $"+ tuitionPerYear);
	}
	if (year > 10)
	{
	total = total + tuitionPerYear;
	}
	}


	System.out.println("The total cost of 4 years tuition in 10 years is $"+ total);
	}
	}



