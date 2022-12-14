import java.util.Scanner;

public class returntypes 
{
    public static int age;
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        /* Methods w/ return
         * modifiers returntype methodName (arguments)
         * {
         *      //do code here
         *      return value;
         * } 
         */
        System.out.println("How old are you?");
        age = sc.nextInt();

        isLegalAge(age);
        
        System.out.println(isLegalAge(age));
        sc.close();
    }
    static boolean isLegalAge(int age)
    {
        if (age >= 18) return true;
        else return false;
    }
    
}
