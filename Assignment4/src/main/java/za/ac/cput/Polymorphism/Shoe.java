package za.ac.cput.Polymorphism;

/**
 * Created by Game330 on 2016/03/24.
 */
public class Shoe {
    int size ;
    String action = "Standing";

    public Shoe()
    {

    }

    public void setAction (String action)
    {
        this.action = action;
    }

    public String getAction()
    {
        return action;
    }

    public String performAction()
    {
        System.out.println("The man is " + action);
        return action;
    }
}
