package za.ac.cput.BreakingDesignPrinciples.LiskovSubstitutionPrinciple;

/**
 * Created by Game330 on 2016/03/24.
 */
public class Ticket {
    char type;
    double price;
    int hours;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
