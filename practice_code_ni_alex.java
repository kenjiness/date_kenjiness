import java.util.Scanner;
import java.util.Arrays;

public class practice_code_ni_alex 
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner (System.in); // scanner declaration
        int arn; // idk what is this
        boolean loop = true; //boolean thingy
        boolean ar = true;
        String abc = "";
    
        System.out.println("Please input your values now: "); //asks for user input
 
    while(ar) // while ar remains true, do
    {
        if(input.hasNextInt()) //if input is int
        {
            arn = input.nextInt(); // stores data input as int
            String gbc = String.valueOf(arn); // convert int input into string
            abc += " "; // adds " " to abc = ""
            abc += gbc; // adds the string in String gbc into abc
        }
        else
        {
            ar=false; // if data input is not an int, then end loop from while condition
        }
    }
 
        String[] alt = abc.split(" "); // splits the array contents by using " " as separator

        String[] prox = new String[alt.length - 1]; //  create new array named prox with array size less than 1 alt size/length
 
    for (int incrementer = 0; incrementer <= prox.length-1; incrementer++)
        {
            
            prox [incrementer] = alt [incrementer + 1];
            //prox [incrementer] means prox [nth index] in prox array
        }

        System.out.println("Output: " + Arrays.toString(prox));
        loop=false;
        System.exit(0);

    }

}
