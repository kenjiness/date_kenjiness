package school_projects;

//RECEIPT

import java.util.Scanner;
public class avena_pacturan_java_project {

    static void foodPriceCalculation()
    {

    }

    static void drinkPriceCalculation()
    {

    }

    public static void main (String[]args)
    {
        Scanner input = new Scanner (System.in);

        int orderSelection;

        int foodOrderSelection;
        int drinkOrderSelection;

        int foodOrderNumber;
        int drinkOrderNumber;

        
        System.out.println("Kan-anan ni Joross");
        System.out.println("Unsay order nimo doles? Press [1], [2], or [3]");

        orderSelection = input.nextInt();

        switch (orderSelection)
        {
            case 1: //food

                System.out.println("Please choose your order by entering [1-7] (Press [0] if you do not want any food.): ");
                System.out.println("[1] Burger");
                System.out.println("[2] Taco");
                System.out.println("[3] Hotdog on Buns");
                System.out.println("[4] Potato Fries");
                System.out.println("[5] Shawarma");
                System.out.println("[6] Fried Chicken");
                System.out.println("[7] Steamed Dumplings");

                foodOrderSelection = input.nextInt();

                switch (foodOrderSelection){

                    case 0:
                        break;
                    case 1:
                        System.out.println("How many orders?");
                        foodOrderNumber = input.nextInt();
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;

                }
                
            
            case 2: //drinks
                System.out.println("Please choose your order by entering [1-4] (Press [0] if you do not want any drinks.): ");
                System.out.println("[1] Coke");
                System.out.println("[2] Sprite");
                System.out.println("[3] Royal");
                System.out.println("[4] Mountain Dew");

                break;



            case 3: //unsa may pwede na option diri
                break;
        }



        input.close(); //avoid resource leak
    }
}
