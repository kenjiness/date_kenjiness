import java.util.Scanner;

public class MainInventorySystem {
    public static void main (String [] args)
    {
        Scanner input = new Scanner (System.in);

        String itemName, itemType, itemSize;
        long itemID;
        int proceed, itemQuantity, itemPrice;
        int itemUserChoice;
        boolean itemUserChoiceLoop = false;

        do
        {
            System.out.println("Welcome to insertInventoryNameHere! ");
            System.out.println("Press [1] to proceed: ");
            proceed = input.nextInt();
        }
        while (proceed != 1);

        System.out.println("What would you like to do? ");
        System.out.println("[1] New Item\n[2] Edit Item\n[3] Delete Item");
        itemUserChoice = input.nextInt();

        switch (itemUserChoice)
        {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Please try again!");                
        }

        
    }
}
