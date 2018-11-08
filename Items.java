public class Items
{
    private int count = 0;

    public Items()
    {
        ItemDet[] itemNames = new ItemDet[250];
    }

    public void addItems(String item, int inv, double price)
    {
        itemNames[count] = new ItemDet(item, inv, price);
        count++;
    }

    public void Search(String item)
    {
        int found = 0;

        for(int i = 0; i <= count; i++)
        {
            if (itemNames[i].getName() == item)
            {
                System.out.println("Item: " + itemNames[i].getName() + "/n/tInv$
                found = 1;
            }
        }

        if (found == 0)
            System.out.println("We do not carry that item.");
    }

    public void purchase(String item, int num)
    {
        for (int i = 0; i <= count; i++)
        {
            if (itemNames[i].getName() == item)
            {
                itemNames[i].adjustInv(num);
                i = count + 1;
            }
        }
    }

    public void listAll()
    {
        for(int i = 0; i <= count; i++)
            System.out.println(itemNames[i].getName());
    }
}
