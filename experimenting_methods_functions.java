import java.util.Scanner;

public class experimenting_methods_functions {

    public static Scanner input = new Scanner(System.in);
    public static int a;
    public static int b;
    public static int c;

    public static void main (String [] args)
    {
        try
        {
            askUserInput();
            addTwoNumbers(a, b);
        }
        catch (Exception e)
        {
            System.out.println("Please enter a valid input!");
        }
    }

    static void addTwoNumbers (int a, int b)
    {
        c = a + b;
        print("The sum is: " +c);
    }

    static void askUserInput()
    {
        System.out.println("Please enter first number: ");
        a = input.nextInt();
        System.out.println("Please enter second number: ");
        b = input.nextInt();
    }
    
    static void print(String word)
    {
        System.out.println(word);
    }
}
