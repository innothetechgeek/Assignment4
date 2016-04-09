package za.ac.cput.BreakingDesignPrinciples.LiskovSubstitutionPrinciple;

import java.util.List;

/**
 * Created by Game330 on 2016/03/24.
 */
public class ticketBooth {
    public double calculatePrice(Ticket t)
    {
        if(t.type == 'A')
            return t.getPrice() * t.getHours() * 0.75;
        else if(t.type == 'R')
            return t.getPrice() * t.getHours() * 0.5;
        else if (t.type == 'V')
            return t.getHours() * t.getPrice();
        else
            return t.getPrice();
    }
}
