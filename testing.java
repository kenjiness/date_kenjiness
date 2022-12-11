import java.util.Scanner;
import java.util.Arrays;

public class testing {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
int proceed = 1, user_input;
 
boolean loop = true;
 
int arn = 0;
 
System.out.println("*****JAVA*****\n");
 
do
 
{
 
System.out.println("ENTER 1 TO PROCEED: ");
 
proceed = input.nextInt();
 
}
 
while (proceed != 1);
System.out.println("MAIN MENU SELECTION: \n");
System.out.println("[1] CALCULATION\n[2] LOOP \n[3] ARRAY");
user_input = input.nextInt();
switch (user_input)
{
case 1:
double base, height;
System.out.println("ENTER BASE: ");
base = input.nextInt();
System.out.println("ENTER HEIGHT: ");
height = input.nextInt();
double area = (base * height) / 2;
System.out.println("AREA OF TRIANGLE IS: " +area + "\n");
System.out.println("THANK YOU FOR USING THE SERVICE!");
 
System.exit(0);
 
case 2:
int stars;
System.out.println("ENTER VALUE OF STAR: ");
stars = input.nextInt();
for (int i = stars - 1; i>=0; i--)
{
for (int j = 0; j<=i; j++)
if (i % 2 == 0)
 
{
 
{
 
System.out.print("*");
 
}
 
}
System.out.println("");
}
 
System.out.println("\nTHANK YOU FOR USING THE SERVICE!");
 
System.exit(0);
case 3:
 
System.out.println("Please input your values now");
 
boolean ar=true;
 
 
 
String abc = "";
 
 
while(ar)
 
{
 
if(input.hasNextInt()) //if input is int
 
{
 
arn = input.nextInt();
 
String gbc = String.valueOf(arn); //convert input into string
 
abc += " ";
 
abc += gbc;
 
}
 
else
 
{
 
ar=false;
 
}
 
}
 
String[] alt = abc.split(" ");
 
String[] prox = new String[alt.length - 1];
 
 
for (int i = 0;i <= prox.length-1; i++)
 
{
 
prox[i]=alt[i+1];
 
}
 
System.out.println("Output: " + Arrays.toString(prox));
 
loop=false;
 
System.exit(0);
 
default:
 
System.out.println("Invalid input. Please try again.");
 
System.out.println();
 
 
 

    }
}
}
