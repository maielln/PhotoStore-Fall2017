public class ItemDet
{
    private String type;
    private int num;
    private double price;

    public ItemDet(String name, int inventory, double p)
    {
        type = name;
        num = inventory;
        price = p;
    }

    public String getName()
    {
        return type;
    }

    public int getInventory()
    {
        return num;
    }

    public double getPrice()
    {
        return price;
    }

    public void adjustInv(int amount)
    {
        num -= amount;
    }
}
