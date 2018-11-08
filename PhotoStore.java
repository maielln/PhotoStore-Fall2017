import java.util.Scanner;

public class PhotoStore
{
    public static void main(String[] args)
    {
        Items inventory = new Items();
        Scanner in = new Scanner(System.in);

        int answer = 0;
        String it = "";
        int inv = 0;
        double price = 0.0;

        System.out.println("Welcome to the Photography Store!");

        do{
            System.out.println("Below is a list of options, enter the number of$
            answer = in.nextInt();

            if (answer == 1)
            {
                System.out.println("Enter the name of the item below:");
                it = in.nextLine();

                System.out.println("Enter the number of items in our inventory $
                inv = in.nextInt();
                in.nextLine();

                System.out.println("Enter the price of the item:");
                price = in.nextDouble();
                in.nextLine();

                inventory.addItems(it, inv, price);
            }

            else if (answer == 2)
            {
                System.out.println("Enter the name of the item to search for be$
                it = in.nextLine();
                inventory.Search(it);
            }

            else if (answer == 3)
            {
                System.out.println("Enter the name of the item you would like t$
                it = in.nextLine();

                System.out.println("How many would you like to purchase?");
                inv = in.nextInt();
                in.nextLine();

                inventory.purchase(it, inv);
            }

            else if (answer == 4)
            {
                inventory.listAll();
            }
        }
        while(answer != 0);
    }
}

