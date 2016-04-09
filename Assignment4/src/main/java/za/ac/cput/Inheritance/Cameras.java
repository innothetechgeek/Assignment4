package za.ac.cput.Inheritance;

/**
 * Created by Game330 on 2016/03/24.
 */
public abstract class Cameras {

    public String action = "Picture was taken.";

    public String performAction()
    {
        System.out.println(action);
        return action;
    }

}
