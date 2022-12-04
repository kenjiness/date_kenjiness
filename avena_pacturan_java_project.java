//RECEIPT

import java.util.Scanner;
public class avena_pacturan_java_project {


    public static void main (String[]args)
    {
        Scanner input = new Scanner (System.in);

        int orderSelection;
        int foodOrderSelection;

        

        System.out.println("Kan-anan ni Joross");
        System.out.println("Unsay order nimo doles? Press [1], [2], or [3]");

        orderSelection = input.nextInt();

        switch (orderSelection)
        {
            case 1: //food

                System.out.println("Please choose your order by entering [1-7]: ");
                System.out.println("[1] Burger");
                System.out.println("[2] Taco");
                System.out.println("[3] Hotdog on Buns");
                System.out.println("[4] Potato Fries");
                System.out.println("[5] Shawarma");
                System.out.println("[6] Fried Chicken");
                System.out.println("[7] Steamed Dumplings");

                foodOrderSelection = input.nextInt();

            


                break;
            
            case 2: //drinks
                break;

            case 3: //unsa may pwede na option diri
                break;
        }



        input.close(); //avoid resource leak
    }
}
