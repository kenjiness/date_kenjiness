public class returntypes 
{
    public static void main (String [] args)
    {
        /* Methods w/ return
         * modifiers returntype methodName (arguments)
         * {
         *      //do code here
         *      return value;
         * } 
         */

        int sum = add (5, 2);
        System.out.println(sum);
    }

    static int add (int num1, int num2)
        {
            return num1 + num2;
        }
}
