import java.util.Scanner;
import java.util.ArrayList;

public class prime_composite_exam 
{
	public static ArrayList <Integer> prime_list = new ArrayList <Integer>(); // stores prime numbers
	public static ArrayList <Integer> composite_list = new ArrayList <Integer>(); // stores composite numbers
	
	public static int num; // user enters number
	public static Scanner input = new Scanner(System.in);

	public static int incrementer = 0;
	public static boolean isPrime = true;

	public static void main(String[] args) //main program
	{
		try
		{
			do
			{
				System.out.println("\nPlease enter a number: ");
				num = input.nextInt();
			

				numCheck(); // calling the prime/composite checker method
				incrementer++;
		
				array_comp(); // calling the array_comp sorter method
			
			}

				while (incrementer < 6);

				show_array();

				input.close();
		}
		catch(Exception e)
		{
			System.out.println("Please enter a valid value!");
		}
	}
	
	static void numCheck() // number checker
	{
		if (num < 1)
			System.out.println("Number needs to be greater than 1.");
		else if (num == 1)
			System.out.println("Number is neither prime nor composite.");
		else
		{
			for (int divisor = 2; divisor <= (num / 2); divisor++)
			{
				if ((num % divisor) == 0)
				{
					isPrime = false;
					break;
				}
			}
			
			if (isPrime)
				System.out.printf("\n%d is a prime number.\n", num);
			else
				System.out.printf("\n%d is a composite number.\n", num);
		}
	}
	
	static void array_comp() //stores and sorts values
	{
		if (isPrime)
		{
			prime_list.add(num);
		}
		else
			composite_list.add(num);
		
		isPrime = true;
	}

	static void show_array()
	{
		System.out.println("Prime numbers are: " + prime_list);
		System.out.println("Composite numbers are: " +composite_list);
	}
}


