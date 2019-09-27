package snackBar;

public class Customer
{
    // fields
    private static int maxId = 0;
    private int id;
    private String name;
    private double cash;

    // constructor
    public Customer(String name, double cash)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.cash = cash;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getCash()
    {
        return cash;
    }

    public void addCash(double amt)
    {
        cash += amt;
    }

    public void buySnack(int amt, Snack snack)
    {
        if (snack.getQuantity() > amt) {
            cash -= (snack.getCost() * amt);
        }

        snack.buySnack(amt, name);
    }
}
