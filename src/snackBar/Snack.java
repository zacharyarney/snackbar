package snackBar;

public class Snack
{
    // fields
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendId;

    //constructor
    public Snack(String name, int quantity, double cost, int vendId)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendId = vendId;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public double getCost()
    {
        return cost;
    }

    public int getVendId()
    {
        return vendId;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public void setVendId(int vendId)
    {
        this.vendId = vendId;
    }

    public void addQuantity(int amt)
    {
        quantity += amt;
        System.out.printf("%d %s(s) were added.", amt, name);
    }

    public double getTotalCost(int amt)
    {
        return cost * amt;
    }

    public void buySnack(int amt, String customerName)
    {
        if (amt > quantity) {
            System.out.println("Not enough snacks to buy that many!");
        } else {
            double totalCost = getTotalCost(amt);
            quantity -= amt;
            System.out.printf("%s bought %d %s(s) for $%.2f.\n", customerName, amt, name, totalCost);
        }
    }

    @Override
    public String toString()
    {
        return String.format("name: %s\nQuantity: %d\nTotal cost: $%.2f\n", name, quantity, getTotalCost(quantity));
    }
}
