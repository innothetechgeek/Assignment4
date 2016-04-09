package za.ac.cput.ObeyingDesignPrinciples.LiskovSubstitutionPrinciple;

/**
 * Created by Game330 on 2016/03/24.
 */
public class RidesOnly extends Ticket{
    @Override
    public double calculatePrice()
    {
        return this.getPrice() * this.getHours() * 0.5;
    }
}
