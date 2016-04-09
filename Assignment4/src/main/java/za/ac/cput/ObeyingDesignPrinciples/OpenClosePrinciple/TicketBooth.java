package za.ac.cput.ObeyingDesignPrinciples.OpenClosePrinciple;

import za.ac.cput.ObeyingDesignPrinciples.OpenClosePrinciple.Person;

import java.util.List;

/**
 * Created by Game330 on 2016/03/24.
 */
public class TicketBooth {
    public double calculateTotal(List<PriceRule> rules, List<Person> people)
    {
        double total=0.0;
        for(Person p :people)
        {
            for(PriceRule r: rules)
                if(r.ruleApplies(p))
                    total = r.calculatePrice(p);
        }
        return total;
    }
}
