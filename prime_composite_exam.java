import java.util.Scanner;
import java.util.ArrayList;

public class prime_composite_exam 
{
	public static ArrayList <Integer> prime_list = new ArrayList <Integer>();
	public static ArrayList <Integer> composite_list = new ArrayList <Integer>();
	
	public static int num;
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) //main program
	{
		while (true)
		{
		
		System.out.println("\nPlease enter a number: ");
		num = input.nextInt();
		//input.close(); // avoid resource leak

		numCheck(); // calling the prime/composite checker method
		}
	}
	
	static void numCheck() // number checker
	{

		boolean isPrime = true;

		if (num < 1)
			System.out.println("Number needs to be greater than 1.");
		else if (num == 1)
			System.out.println("Number is neither prime nor composite.");
		else
		{
			for (int divisor = 2; divisor <= (num / 2); divisor++)
			{
				if ((num % divisor) == 0)
					isPrime = false;
					break;
			}
			if (isPrime)
				System.out.printf("%d is a prime number.\n", num);
			else
				System.out.printf("%d is a composite number.\n", num);
	
			
		}
		
		
	}
	
	static void array_comp() //stores and sorts values
	{
		
	}
}


