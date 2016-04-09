package za.ac.cput.ObeyingDesignPrinciples.OpenClosePrinciple;

/**
 * Created by Game330 on 2016/03/24.
 */
public class Elderly extends PriceRule {


    public boolean ruleApplies(Person p) {
        return p.age > 65;
    }

    public double calculatePrice(Person p) {
        return p.ticketType.getPrice()*0.75;
    }
}
