package za.ac.cput.BreakingDesignPrinciples.PrincipleOfLeastKnowledge;

import java.util.List;

/**
 * Created by Game330 on 2016/03/24.
 */
public class TourGuideSystem {

    List<TourGroup> group;
    TourGroup tg = new TourGroup();

    public void addTourist(Tourist t)
    {
        tg.group.add(t);
    }

    public void replaceGuide(String name)
    {
        tg.setTourGuide(name);
    }
}
