package za.ac.cput.Encapsulation;

/**
 * Created by Game330 on 2016/03/24.
 */
public class implementationClass {
    private int amount = 50;
    private double price = 31.74;
    private myClass _methods;

    public implementationClass(myClass methods, int amount, double price)
    {
        this._methods = methods;
        this.price = price;
        this.amount = amount;
    }

    public double calculateSignleItem()
    {
        return _methods.calculatePricePerItem(price);
    }

    public double calculateTotalCost()
    {
        return _methods.calculateTotalAmount(price, amount);
    }

    public void displayData()
    {
        System.out.println(_methods.displaySingleItem());
        System.out.println("\n\n");
        System.out.println(_methods.displayTotal());
    }
}
