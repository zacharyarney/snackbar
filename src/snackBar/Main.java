package snackBar;

public class Main
{
    public static void main(String[] args)
    {
        snackBarProcess();
    }

    private static void snackBarProcess()
    {
        System.out.println("Gimme that snack");
        Customer customer1 = new Customer("Jane", 45.25);
        Customer customer2 = new Customer("Bob", 33.14);
        VendingMachine vmFood = new VendingMachine("Food");
        VendingMachine vmDrink = new VendingMachine("Drink");
        VendingMachine vmOffice = new VendingMachine("Office");
        Snack snack1 = new Snack("Chips", 36, 1.75, vmFood.getId());
        Snack snack2 = new Snack("Chocolate Bar", 36, 1.00, vmFood.getId());
        Snack snack3 = new Snack("Pretzel", 30, 2.00, vmFood.getId());
        Snack snack4 = new Snack("Soda", 24, 2.50, vmDrink.getId());
        Snack snack5 = new Snack("Water", 20, 2.75, vmDrink.getId());

        customer1.buySnack(3, snack4);
        printMessage(customer1, snack4);
        customer1.buySnack(1, snack3);
        printMessage(customer1, snack3);
        customer2.buySnack(2, snack4);
        printMessage(customer2, snack4);
        customer1.addCash(10);
        printMessage(customer1);
        customer1.buySnack(1, snack2);
        printMessage(customer1, snack2);
        snack3.addQuantity(12);
        printMessage(snack3);
        customer2.buySnack(3, snack3);
        printMessage(customer2, snack3);
        System.out.println("\n*** Final Snack Tally ***\n");
        System.out.println(snack1);
        System.out.println(snack2);
        System.out.println(snack3);
        System.out.println(snack4);
    }

    private static void printMessage(Customer customer)
    {
        System.out.printf("%s has $%.2f left on hand.\n", customer.getName(), customer.getCash());
    }

    private static void printMessage(Snack snack)
    {
        System.out.printf("There are %d %s(s) left.\n", snack.getQuantity(), snack.getName());
    }

    private static void printMessage(Customer customer, Snack snack)
    {
        printMessage(customer);
        printMessage(snack);
    }
}
