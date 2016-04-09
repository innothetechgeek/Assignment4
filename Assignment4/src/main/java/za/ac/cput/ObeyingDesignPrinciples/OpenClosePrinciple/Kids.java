package za.ac.cput.ObeyingDesignPrinciples.OpenClosePrinciple;

/**
 * Created by Game330 on 2016/03/24.
 */
public class Kids extends PriceRule {
    public boolean ruleApplies(Person p) {
        return p.age < 13;
    }

    public double calculatePrice(Person p) {
        return p.ticketType.getPrice()*0.50;
    }
}
